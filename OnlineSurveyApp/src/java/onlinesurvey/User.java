package onlinesurvey;

/**
 *
 * @author Pratima
 */
public class User {
    
    public String userName;
    public String userGender;
    public String userMartialStatus;
    public Integer userNumberOfChildren;
    public Integer userAge;
    
    //Default Empty Constructor
    public User(){}

    //Constructor to initialize our object
    public User(String userName,String userGender,String userMartialStatus,Integer userNumberOfChildren,Integer userAge)
    {
        this.userName=userName;
        this.userGender=userGender;
        this.userMartialStatus=userMartialStatus;
        this.userNumberOfChildren=userNumberOfChildren;
        this.userAge=userAge;
    }
    //Getter and setter methods
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserMartialStatus() {
        return userMartialStatus;
    }

    public void setUserMartialStatus(String userMartialStatus) {
        this.userMartialStatus = userMartialStatus;
    }

    public Integer getUserNumberOfChildren() {
        return userNumberOfChildren;
    }

    public void setUserNumberOfChildren(Integer userNumberOfChildren) {
        this.userNumberOfChildren = userNumberOfChildren;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
    
}
