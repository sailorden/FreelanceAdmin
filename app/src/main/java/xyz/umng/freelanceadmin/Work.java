package xyz.umng.freelanceadmin;

import com.parse.ParseClassName;
import com.parse.ParseObject;

/**
 * Created by Umang on 3/2/2016.
 */
@ParseClassName("Work")
public class Work extends ParseObject {

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

    public String getStream(){
        return getString("stream");
    }

    public String getWorkDo(){
        return getString("workDo");
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
                + "\n" + getString("stream")
                + "\n" + getString("workDo")
                + "\n" + getString("moreAboutYou");
    }
}

