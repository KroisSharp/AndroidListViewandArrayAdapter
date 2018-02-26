package mik.easj.skole.androidlistviewandarrayadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by krois on 26-02-2018.
 */

public class StudentAdapter extends ArrayAdapter<Student> {

private int resource;

    public StudentAdapter(Context context, int resource, Student[] items) {
        super(context, resource, items);
        this.resource = resource;
    }


    @Override
    public View getView(int position, View convertView,ViewGroup parent) {
        Student item = getItem(position);
        String Name = item.getName();
        String LastName = item.getLastname();

        LinearLayout itemView;
        if (convertView == null){
            itemView = new LinearLayout(getContext());
            String inflater = Context.LAYOUT_INFLATER_SERVICE;
            LayoutInflater li = (LayoutInflater) getContext().getSystemService(inflater);
            li.inflate(resource, itemView, true);
        } else{
            itemView = (LinearLayout) convertView;
        }
        TextView nameView = (TextView) itemView.findViewById(R.id.Student_Name);
        TextView lastNameView = (TextView) itemView.findViewById(R.id.Student_LastName);
        nameView.setText(Name);
        lastNameView.setText(LastName);



        return itemView;
    }
}
