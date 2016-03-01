package xyz.umng.freelanceadmin;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;

public class HireActivity extends AppCompatActivity {
    private static final String TAG = "HireActivity";

    ProgressDialog pd;

    HireCustomAdapter adapter;

    private ArrayList<HireDataItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hire);

        ButterKnife.bind(this);

        pd = new ProgressDialog(HireActivity.this,
                R.style.AppTheme_Dark_Dialog);
        pd.setIndeterminate(true);
        pd.setCancelable(true);
        pd.setMessage("Loading...");
        pd.show();

        data = new ArrayList<>();

        adapter = new HireCustomAdapter(this, data);
        ListView listView = (ListView) findViewById(R.id.listView_hire);
        listView.setAdapter(adapter);

        ParseQuery orderQuery = new ParseQuery("Hire");
        orderQuery.orderByDescending("createdAt");
        orderQuery.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> content, ParseException pEx) {
                if (pEx == null && content != null) {
                    if (!(content.isEmpty())) {
                        for (ParseObject orderObject : content) {
                            data.add(new HireDataItem(orderObject.getString("firstName"),
                                    orderObject.getString("lastName"),
                                    orderObject.getString("email"),
                                    orderObject.getString("phone"),
                                    orderObject.getString("workRequire"),
                                    orderObject.getString("project"),
                                    orderObject.getString("skills"),
                                    orderObject.getString("moreAboutYou")
                            ));
                            adapter.notifyDataSetChanged();
                        }
                        pd.dismiss();
                    }
                }
            }
        });


    }
}
