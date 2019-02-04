package onlinesurvey;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Pratima
 */
public class ProcessUserInformation {

    public static Map<String,User> userMap = new HashMap<>();
    
    public void insertUserInformation(String userID,User user)
    {     
        //Put in some dummy data
        userMap.put(java.util.UUID.randomUUID().toString(),new User("John Smith","Male","Married",3,45)); 
        userMap.put(java.util.UUID.randomUUID().toString(),new User("Jane Doe","Female","Single",0,22));
        userMap.put(java.util.UUID.randomUUID().toString(),new User("Sam King","Male","Divorced",1,32));
        userMap.put(java.util.UUID.randomUUID().toString(),new User("Cathy Jones","Female","Married",0,25));
        userMap.put(java.util.UUID.randomUUID().toString(),new User("Susie Yale","Female","Divorced",1,34));
        //Finally Insert our user here
        userMap.put(userID, user);
    }
}
