<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>
          Online Survey
      </title>
      <!--STYLES -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">   
      <!--SCRIPTS -->
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
      
      <style>
          .labels{
              padding: 10px;
          }
      </style>
   </head>
   <body>
       <br>
       <br>
        <div class="container" style="border:1px solid blue;padding: 10px;">
            <div class="panel-heading text-center">
                <p class="text-center text-primary text-uppercase" style="font-size:24px">Online Survey Application</p>
            </div>
            <div class="panel-body">
                <p class="text-center text-info" style="font-size:18px">Welcome ${USERNAME}</p>
                <form:form method = "POST" action = "/OnlineSurveyApp/addQuestions" cssClass="form-horizontal" onsubmit="return confirm('Are you sure you want to submit your survey responses?')">
                <br />
                <form:hidden path = "userName" value="${USERNAME}" class="control-label labels"></form:hidden>
                <form:hidden path = "userID" value="${USERID}" class="control-label labels"></form:hidden>
                    
                     <div class="form-group required">
                         <label class="control-label labels">1. What is your favorite color? </label>
                         <br>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="Red" checked="checked" />Red</label>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="Yellow" />Yellow</label>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="Green" />Green</label>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="Blue" />Blue</label>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="Black" />Black</label>
                            <label class="radio-inline"><form:radiobutton path = "firstQuestionResponse" id="" value="White" />White</label>
                     </div>
                     <div class="form-group required">
                         <label class="control-label labels">2. Do you have a valid driver's license? </label>
                         <br>
                            <label class="radio-inline"><form:radiobutton path = "secondQuestionResponse" id="" value="Yes" checked="checked" />Yes</label>
                            <label class="radio-inline"><form:radiobutton path = "secondQuestionResponse" id="" value="No" />No</label>
                    </div>
                    <div class="form-group required">
                        <label class="control-label labels">3. What is your favorite vacation spot?</label>
                        <br>
                            <form:textarea path = "thirdQuestionResponse" class="form-control" rows="5" id="" required="required"/>        
                    </div>                    
                      <div class="form-group required">
                         <label class="control-label labels">4. I am happy about my job. </label>
                         <br>
                            <label class="radio-inline"><form:radiobutton path = "fourthQuestionResponse" id="" value="Strongly Disagree" checked="checked" />Strongly Disagree</label>
                            <label class="radio-inline"><form:radiobutton path = "fourthQuestionResponse" id="" value="Mostly Disagree" />Mostly Disagree</label>
                            <label class="radio-inline"><form:radiobutton path = "fourthQuestionResponse" id="" value="No Opinion" />No Opinion</label>
                            <label class="radio-inline"><form:radiobutton path = "fourthQuestionResponse" id="" value="Mostly Agree" />Mostly Agree</label>
                            <label class="radio-inline"><form:radiobutton path = "fourthQuestionResponse" id="" value="Strongly Agree" />Strongly Agree</label>
                    </div>  
                    <br>
                    <center>
                        <div style="margin-top: 1em;">
                            <button type="submit" class="btn btn-primary btn-md">Submit Survey</button>
                            <button type="reset" class="btn btn-primary btn-md">Reset Survey</button>
                        </div>
                    </center>
                </form:form>          
            </div>
        </div>  
   </body>
</html>