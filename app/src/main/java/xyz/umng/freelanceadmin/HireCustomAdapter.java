package xyz.umng.freelanceadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Umang on 3/1/2016.
 */
public class HireCustomAdapter extends BaseAdapter {

    ArrayList<HireDataItem> data;
    Context context;
    private static LayoutInflater inflater = null;

    public HireCustomAdapter(Context context, ArrayList<HireDataItem> data)
    {
        this.context = context;
        this.data = data;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null)
        {
            view = inflater.inflate(R.layout.list_view_item_hire, null);
        }
        TextView firstNameText = (TextView) view.findViewById(R.id.hire_first_name);
        TextView lastNameText = (TextView) view.findViewById(R.id.hire_last_name);
        TextView emailText = (TextView) view.findViewById(R.id.hire_email);
        TextView phoneText = (TextView) view.findViewById(R.id.hire_phone);
        TextView workRequireText = (TextView) view.findViewById(R.id.hire_work_require);
        TextView projectText = (TextView) view.findViewById(R.id.hire_project);
        TextView skillsText = (TextView) view.findViewById(R.id.hire_skills);
        TextView moreAboutYouText = (TextView) view.findViewById(R.id.hire_more_about_you);
        HireDataItem item = data.get(position);
        firstNameText.setText(item.firstName);
        lastNameText.setText(item.lastName);
        emailText.setText(item.email);
        phoneText.setText(item.phone);
        workRequireText.setText(item.workRequire);
        projectText.setText(item.projects);
        skillsText.setText(item.skills);
        moreAboutYouText.setText(item.moreAboutYou);
        return view;
    }
}
