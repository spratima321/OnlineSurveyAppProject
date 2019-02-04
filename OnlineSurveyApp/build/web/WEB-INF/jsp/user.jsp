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
        <div class="col-sm-6 col-sm-offset-3" style="border:1px solid blue;padding: 10px;">
            <div class="panel-heading text-center">
                <p class="text-center text-primary text-uppercase" style="font-size:24px">Online Survey Application</p>
            </div>
            <div class="panel-body">
                <p class="text-center text-info" style="font-size:18px">Please fill out user details</p>
                <form:form method = "POST" action = "/OnlineSurveyApp/addUser" cssClass="form-horizontal">
                <br />
                    <div class="form-group required">
                        <form:label path = "userName" class="control-label labels col-sm-2">Name:</form:label>
                        <div class="col-xs-5">
                            <form:input path = "userName" class="form-control" id="username" required="required"/>
                        </div>
                    </div>
                    <div class="form-group required">
                        <form:label path = "userAge" class="control-label labels col-sm-2">Age:</form:label>
                        <div class="col-xs-2">
                            <form:input path = "userAge" class="form-control" id="userage" required="required" />
                        </div>
                    </div> 
                    <div class="form-group required">
                        <form:label path = "userGender" class="control-label labels col-sm-2">Gender:</form:label>
                            <label class="radio-inline"><form:radiobutton path = "userGender" id="usergender" value="Male" checked="checked" />Male</label>
                            <label class="radio-inline"><form:radiobutton path = "userGender" id="usergender" value="Female" />Female</label>
                            <label class="radio-inline"><form:radiobutton path = "userGender" id="usergender" value="NoAnswer" />Choose not to answer</label>
                    </div>   
                    <div class="form-group required">
                        <form:label path = "userMartialStatus" class="control-label labels col-sm-2">Martial Status:</form:label>
                            <label class="radio-inline"><form:radiobutton path = "userMartialStatus" id="usermartialstatus" value="Single" checked="checked" />Single</label>
                            <label class="radio-inline"><form:radiobutton path = "userMartialStatus" id="usermartialstatus" value="Married" />Married</label>
                            <label class="radio-inline"><form:radiobutton path = "userMartialStatus" id="usermartialstatus" value="Divorced" />Divorced</label>
                    </div>   
                    <div class="form-group required">
                        <form:label path = "userNumberOfChildren" class="control-label labels col-sm-2"># of children:</form:label>
                        <div class="col-xs-2">
                            <form:input path = "userNumberOfChildren" class="form-control" id="usernumberofchildren" required="required" />
                        </div>
                    </div>  
                    <center>
                        <div style="margin-top: 1em;">
                            <button type="submit" class="btn btn-primary btn-md">Go to survey!</button>
                            <button type="reset" class="btn btn-primary btn-md">Reset Form</button>
                        </div>
                    </center>
                </form:form>          
            </div>
        </div>  
   </body>
</html>