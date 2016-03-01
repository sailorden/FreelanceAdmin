package xyz.umng.freelanceadmin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Umang on 3/2/2016.
 */
public class WorkCustomAdapter extends BaseAdapter {

    ArrayList<WorkDataItem> data;
    Context context;
    private static LayoutInflater inflater = null;

    public WorkCustomAdapter(Context context, ArrayList<WorkDataItem> data)
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
            view = inflater.inflate(R.layout.list_view_item_work, null);
        }
        TextView firstNameText = (TextView) view.findViewById(R.id.work_first_name);
        TextView lastNameText = (TextView) view.findViewById(R.id.work_last_name);
        TextView emailText = (TextView) view.findViewById(R.id.work_email);
        TextView phoneText = (TextView) view.findViewById(R.id.work_phone);
        TextView streamText = (TextView) view.findViewById(R.id.work_stream);
        TextView workDoText = (TextView) view.findViewById(R.id.work_work_do);
        TextView moreAboutYouText = (TextView) view.findViewById(R.id.work_more_about_you);
        WorkDataItem item = data.get(position);
        firstNameText.setText(item.firstName);
        lastNameText.setText(item.lastName);
        emailText.setText(item.email);
        phoneText.setText(item.phone);
        streamText.setText(item.stream);
        workDoText.setText(item.workDo);
        moreAboutYouText.setText(item.moreAboutYou);
        return view;
    }
}