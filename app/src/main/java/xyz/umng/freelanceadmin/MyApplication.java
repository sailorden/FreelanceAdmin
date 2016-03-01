package xyz.umng.freelanceadmin;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;

/**
 * Created by Umang on 2/29/2016.
 */
public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        //registering subclass
        ParseObject.registerSubclass(Hire.class);
        ParseObject.registerSubclass(Work.class);

        // initializing parse library
        Parse.initialize(this, "", "");
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

}
