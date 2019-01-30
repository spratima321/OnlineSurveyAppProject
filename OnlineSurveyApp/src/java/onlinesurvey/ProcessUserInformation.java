/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlinesurvey;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author PratimaS
 */
public class ProcessUserInformation {

    public static Map<String,User> userMap = new HashMap<String,User>();
    
    public void insertUserInformation(String userID,User user)
    {
        userMap.put(userID, user);
    }
}
