package adapter;

import java.util.ArrayList;
import data_model.Courses;
import com.example.assigment2.CoursesActivity;
import com.example.assigment2.R;

import android.R.color;
import android.app.Activity;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MyAdapter extends ArrayAdapter<Courses> {
	Activity context = null;
	ArrayList<Courses> myArray = null;
	int layoutId;

	public MyAdapter(Activity context, int layoutID, ArrayList<Courses> objects) {
		super(context, layoutID, objects);
		this.context = context;
		myArray = objects;
		layoutId = layoutID;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = context.getLayoutInflater();
		convertView = inflater.inflate(layoutId, null);
		final int pos = position;
		TextView txtCourses = (TextView) convertView
				.findViewById(R.id.txtCourses);
		TextView txtSchedule = (TextView) convertView
				.findViewById(R.id.txtSchedule);
		TextView txtTeacher = (TextView) convertView
				.findViewById(R.id.txtTeacher);
		CheckBox chkItem = (CheckBox) convertView.findViewById(R.id.chkitem);
		if(pos%2==0)
		{
			convertView.setBackgroundColor(Color.parseColor("#ffffff"));
		}
		else
		{
			convertView.setBackgroundColor(Color.parseColor("#33ffffff"));
		}
		if (myArray.size() > 0 && position >= 0) {
			txtCourses.setText(myArray.get(position).getCourses());
			txtSchedule.setText(myArray.get(position).getSchedule());
			txtTeacher.setText(myArray.get(position).getTeacher());
			if (myArray.get(pos).isCheck()) {
				chkItem.setChecked(true);
			} else {
				chkItem.setChecked(false);
			}
			chkItem.setOnCheckedChangeListener(new OnCheckedChangeListener() {

				@Override
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					// TODO Auto-generated method stub
					if (isChecked) {
						myArray.get(pos).setCheck(true);
						((CoursesActivity) context).startMenu();
					} else {
						myArray.get(pos).setCheck(false);
						((CoursesActivity) context).stopMenu();
					}
				}
			});
		}

		return convertView;
	}
}