/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinesurvey;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Pratima
 */
@Controller
@EnableWebMvc
public class MainController {
   
    //Getting our user view via get method
   @RequestMapping(value = "/user", method = RequestMethod.GET)
   public ModelAndView user() {
      return new ModelAndView("user", "command", new User());
   }
   
   //Posting model values via post
   @RequestMapping(value = "/addUser", method = RequestMethod.POST)
      public ModelAndView addUser(User user, RedirectAttributes redir) {
      
      String userID=java.util.UUID.randomUUID().toString();
      String userName=user.getUserName();
      //Add to our dictionary the added user
      ProcessUserInformation process=new ProcessUserInformation();
      process.insertUserInformation(userID, user);
      
    //Redirect to survey questions page with required user data
    //modelAndView.setViewName("redirect:survey");
    redir.addFlashAttribute("USERID",userID);
    redir.addFlashAttribute("USERNAME",userName);
    return new ModelAndView("redirect:questions");
   }
      
   @RequestMapping(value = "/questions", method = RequestMethod.GET)
   public ModelAndView questions() {
      return new ModelAndView("questions", "command", new Questions());
   }
   
   @RequestMapping(value = "/addQuestions", method = RequestMethod.POST)
      public String addQuestion(Questions question,ModelMap model){

      //Insert our responses here
      ProcessUserQuestionResponse response=new ProcessUserQuestionResponse();
      response.insertUserQuestionResponse(question);
      model.addAttribute("questionsResponseList", response.getQuestionsResponseList());
      return "surveyresult";
   }

//    @RequestMapping(value = "/surveyresult", method = RequestMethod.GET)
//   public ModelAndView surveyresult() {    
//      SurveyResult result=new SurveyResult();
//      result.questionsResponseList=ProcessUserQuestionResponse.questionsResponseList;
//      return new ModelAndView("surveyresult", "command", new SurveyResult());
//   }
}
