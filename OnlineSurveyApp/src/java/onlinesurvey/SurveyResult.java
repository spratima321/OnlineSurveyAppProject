/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinesurvey;

import java.util.ArrayList;

/**
 *
 * @author Pratima
 */
public class SurveyResult {
    public ArrayList<Questions> questionsResponseList;

    public ArrayList<Questions> getQuestionsResponseList() {
        return questionsResponseList;
    }

    public void setQuestionsResponseList(ArrayList<Questions> questionsResponseList) {
        this.questionsResponseList = questionsResponseList;
    }
}