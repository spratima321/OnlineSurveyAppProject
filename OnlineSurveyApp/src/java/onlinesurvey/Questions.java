/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinesurvey;

/**
 *
 * @author Pratima
 */
public class Questions {
    
    public String userName;
    public String userID;
    public String firstQuestionResponse;
    public String secondQuestionResponse;
    public String thirdQuestionResponse;
    public String fourthQuestionResponse;
    
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
