package xyz.umng.freelanceadmin;

/**
 * Created by Umang on 3/2/2016.
 */
public class WorkDataItem {
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String stream;
    public String workDo;
    public String moreAboutYou;


    public WorkDataItem(String firstName, String lastName, String email, String phone
            , String stream, String workDo, String moreAboutYou)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.stream = stream;
        this.workDo = workDo;
        this.moreAboutYou = moreAboutYou;
    }
}