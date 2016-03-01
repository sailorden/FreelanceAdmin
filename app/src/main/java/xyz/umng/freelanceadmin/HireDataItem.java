package xyz.umng.freelanceadmin;

/**
 * Created by Umang on 2/12/2016.
 */
public class HireDataItem {
    public String firstName;
    public String lastName;
    public String email;
    public String phone;
    public String workRequire;
    public String projects;
    public String skills;
    public String moreAboutYou;


    public HireDataItem(String firstName, String lastName, String email, String phone
            , String workRequire, String projects, String skills, String moreAboutYou)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.workRequire = workRequire;
        this.projects = projects;
        this.skills = skills;
        this.moreAboutYou = moreAboutYou;

    }
}
