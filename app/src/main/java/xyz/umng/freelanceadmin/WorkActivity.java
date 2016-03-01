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

public class WorkActivity extends AppCompatActivity {
    private static final String TAG = "WorkActivity";

    ProgressDialog pd;

    WorkCustomAdapter adapter;

    private ArrayList<WorkDataItem> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        ButterKnife.bind(this);

        pd = new ProgressDialog(WorkActivity.this,
                R.style.AppTheme_Dark_Dialog);
        pd.setIndeterminate(true);
        pd.setCancelable(true);
        pd.setMessage("Loading...");
        pd.show();

        data = new ArrayList<>();

        adapter = new WorkCustomAdapter(this, data);
        ListView listView = (ListView) findViewById(R.id.listView_work);
        listView.setAdapter(adapter);

        ParseQuery orderQuery = new ParseQuery("Work");
        orderQuery.orderByDescending("createdAt");
        orderQuery.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> content, ParseException pEx) {
                if (pEx == null && content != null) {
                    if (!(content.isEmpty())) {
                        for (ParseObject orderObject : content) {
                            data.add(new WorkDataItem(orderObject.getString("firstName"),
                                    orderObject.getString("lastName"),
                                    orderObject.getString("email"),
                                    orderObject.getString("phone"),
                                    orderObject.getString("stream"),
                                    orderObject.getString("workDo"),
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
