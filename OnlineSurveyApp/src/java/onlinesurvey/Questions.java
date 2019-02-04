package onlinesurvey;

/**
 *
 * @author Pratima
 */
public class Questions extends User {
    
    public String userID;
    public String firstQuestionResponse;
    public String secondQuestionResponse;
    public String thirdQuestionResponse;
    public String fourthQuestionResponse;
    
    //Default Empty constructor
    public Questions(){}

    //Constructor to initialize our object
    public Questions(String username, String firstQuestionResponse , String secondQuestionResponse, String thirdQuestionResponse, String fourthQuestionResponse) 
    {
        this.userName=username;
        this.firstQuestionResponse=firstQuestionResponse;
        this.secondQuestionResponse=secondQuestionResponse;
        this.thirdQuestionResponse=thirdQuestionResponse;
        this.fourthQuestionResponse=fourthQuestionResponse;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getFirstQuestionResponse() {
        return firstQuestionResponse;
    }

    public void setFirstQuestionResponse(String firstQuestionResponse) {
        this.firstQuestionResponse = firstQuestionResponse;
    }

    public String getSecondQuestionResponse() {
        return secondQuestionResponse;
    }

    public void setSecondQuestionResponse(String secondQuestionResponse) {
        this.secondQuestionResponse = secondQuestionResponse;
    }

    public String getThirdQuestionResponse() {
        return thirdQuestionResponse;
    }

    public void setThirdQuestionResponse(String thirdQuestionResponse) {
        this.thirdQuestionResponse = thirdQuestionResponse;
    }

    public String getFourthQuestionResponse() {
        return fourthQuestionResponse;
    }

    public void setFourthQuestionResponse(String fourthQuestionResponse) {
        this.fourthQuestionResponse = fourthQuestionResponse;
    }    
}
