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
