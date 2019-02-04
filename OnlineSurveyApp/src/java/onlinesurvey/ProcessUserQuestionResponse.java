package onlinesurvey;

import java.util.ArrayList;

/**
 *
 * @author Pratima
 */
public class ProcessUserQuestionResponse {
    
    public  ArrayList<Questions> questionsResponseList = new ArrayList<>();

    public ArrayList<Questions> getQuestionsResponseList() {
        return questionsResponseList;
    }

    public void setQuestionsResponseList(ArrayList<Questions> questionsResponseList) {
        this.questionsResponseList = questionsResponseList;
    }
    
    public void insertUserQuestionResponse(Questions questions)
    {
        //Add dummy survey result list (this shall come from db at some point)
        questionsResponseList.add(questions);
        questionsResponseList.add(new Questions("John Smith","Black","No","Las Vegas","Mostly Agree"));
        questionsResponseList.add(new Questions("Jane Doe","Green","Yes","No vacations","Strongly Disagree"));
        questionsResponseList.add(new Questions("Sam King","Blue","Yes","Hawaii","Mostly Disagree"));
        questionsResponseList.add(new Questions("Cathy Jones","Yellow","No","India","No Opinion"));
        questionsResponseList.add(new Questions("Susie Yale","Green","Yes","Alaska","Strongly Agree"));
    }   
}
