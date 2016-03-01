package xyz.umng.freelanceadmin;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Umang on 3/1/2016.
 */
@ParseClassName("Hire")
public class Hire extends ParseObject {

    public String getFirstName(){
        return getString("firstName");
    }

//    public void setCategoryName(String categoryName){
//        put("categoryName", categoryName);
//    }

    public String getLastName(){
        return getString("lastName");
    }

    public String getEmail(){
        return getString("email");
    }

    public String getPhone(){
        return getString("phone");
    }

    public String getWorkRequire(){
        return getString("workRequire");
    }

    public String getProjects(){
        return getString("project");
    }

    public String getSkillsRequire(){
        return getString("skills");
    }

    public String getMoreAboutyou(){
        return getString("moreAboutYou");
    }

    @Override
    public String toString() {
        return getString("firstName")
                + "\n" + getString("lastName")
                + "\n" + getString("email")
                + "\n" + getString("phone")
                + "\n" + getString("project")
                + "\n" + getString("workRequire")
                + "\n" + getString("skills")
                + "\n" + getString("moreAboutYou");
    }
}

