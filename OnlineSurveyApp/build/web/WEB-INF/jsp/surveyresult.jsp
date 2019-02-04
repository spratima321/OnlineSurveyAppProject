<%@page contentType = "text/html;charset = UTF-8" language = "java" %>
<%@page isELIgnored = "false" %>
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
                <p class="text-center text-info" style="font-size:20px">Survey Results</p>
                <table class="table table-bordered">                  
                    <thead style='font-size: 15px;'>                                         
                        <th>
                            Name
                        </th>
                        <th>
                            What is your favorite color?
                        </th>
                        <th>
                            Do you have a valid driver's license?
                        </th>
                        <th>
                            What is your favorite vacation spot? 
                        </th>
                         <th>
                            I am happy about my job.
                        </th>                   
                    </thead>
                <c:forEach var="listVar" items="${questionsResponseList}"> 
                    <tr style='font-size: 14px'>
                        <td>${listVar.userName}</td>
                        <td>${listVar.firstQuestionResponse}</td>
                        <td>${listVar.secondQuestionResponse}</td>
                        <td>${listVar.thirdQuestionResponse}</td>
                        <td>${listVar.fourthQuestionResponse}</td>
                    </tr>
                </c:forEach>
                </table>       
                <a href="/OnlineSurveyApp/user" class="btn btn-primary btn-md">Start A New Survey</a>
            </div>
        </div>  
   </body>
</html>