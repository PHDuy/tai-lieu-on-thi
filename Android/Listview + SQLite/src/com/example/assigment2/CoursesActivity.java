package com.example.assigment2;

import java.util.ArrayList;

import sqliteHelper.MyDBHandler;
import data_model.Courses;
import adapter.MyAdapter;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class CoursesActivity extends Activity {
	ActionMode.Callback callback;
	ActionMode actionMode = null;
	ArrayList<Courses> arrList = new ArrayList<Courses>();
	MyAdapter adapter;
	MyDBHandler dbhelper= new MyDBHandler(this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_courses);
		// --------------------------------------------------
		ActionBar bar = getActionBar(); // or
		// MainActivity.getInstance().getActionBar()
		bar.setBackgroundDrawable(new ColorDrawable(0xffa276eb));
		bar.setDisplayShowTitleEnabled(false); // required to force redraw,
		// without, gray color
		bar.setDisplayShowTitleEnabled(true);
		// --------------------------------------------------
		ListView list = (ListView) findViewById(R.id.listItems);
		adapter = new MyAdapter(CoursesActivity.this,
				R.layout.layout_listview_item, arrList);
		list.setAdapter(adapter);
		// --------------------------------
//		Courses dfCourse = new Courses();
//		dfCourse.setCourses("Algebra");
//		dfCourse.setSchedule("Monday, lecture 1");
//		dfCourse.setTeacher("Linda Chu");
//		arrList.add(dfCourse);
		// adapter.notify();
		String selectQuery="SELECT * FROM courses";
		SQLiteDatabase db=dbhelper.getWritableDatabase();
		Cursor cursor=db.rawQuery(selectQuery, null);
		if(cursor.moveToFirst())
		{
			do{
				Courses course= new Courses();
				course.setCourses(cursor.getString(1));
				course.setSchedule(cursor.getString(2));
				course.setTeacher(cursor.getString(3));
				arrList.add(course);
			}
			while(cursor.moveToNext());
		}

		callback = new ActionMode.Callback() {

			@Override
			public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void onDestroyActionMode(ActionMode mode) {
				// TODO Auto-generated method stub

			}

			@Override
			public boolean onCreateActionMode(ActionMode mode, Menu menu) {
				// TODO Auto-generated method stub
				getMenuInflater().inflate(R.menu.my_actionbar_menu, menu);
				return true;
			}

			@Override
			public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
				// TODO Auto-generated method stub
				switch (item.getItemId()) {
				case R.id.add:
					add();
					break;
				case R.id.remove:
					remove();
					break;
				case R.id.update:
					update();
					break;
				}
				return true;
			}
		};
	}

	public void startMenu() {
		if (actionMode == null) {
			actionMode = startActionMode(callback);
		}
	}

	public void stopMenu() {
		if (actionMode != null) {
			actionMode.finish();
			actionMode = null;
		}
	}

	public void remove() {
		ArrayList<Courses> arrCopy = (ArrayList<Courses>) arrList.clone();
		for (Courses aCourses : arrCopy) {
			if (aCourses.isCheck()) {
				arrList.remove(aCourses);
				dbhelper.deleteCourse(aCourses.getCourses());
			}
		}
		adapter.notifyDataSetChanged();
		stopMenu();
	}

	public void update() {
		final Dialog dialog = new Dialog(CoursesActivity.this);
		dialog.setContentView(R.layout.layout_dialog);
		dialog.setTitle("Update khóa học");

		// Lay cac thanh phan layout cua Dialog
		Button btnOK = (Button) dialog.findViewById(R.id.btnOK_dialog);
		Button btnCancel = (Button) dialog.findViewById(R.id.btnCancel_dialog);
		final EditText edtCourse = (EditText) dialog
				.findViewById(R.id.edt_course);
		final EditText edtSchedule = (EditText) dialog
				.findViewById(R.id.edt_schedule);
		final EditText edtTeacher = (EditText) dialog
				.findViewById(R.id.edt_teacher);

		btnCancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		btnOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (edtCourse.getText().length() > 0
						&& edtSchedule.getText().length() > 0
						&& edtTeacher.getText().length() > 0) {
					for (Courses aCourses : arrList) {
						if (aCourses.isCheck()) {
							String courseName=aCourses.getCourses();
							aCourses.setCourses(edtCourse.getText().toString());
							aCourses.setSchedule(edtSchedule.getText()
									.toString());
							aCourses.setTeacher(edtTeacher.getText().toString());
							aCourses.setCheck(false);
							dbhelper.updateAccount(courseName, aCourses);
						}
					}
					dialog.dismiss();
					adapter.notifyDataSetChanged();
					stopMenu();
				} else {
					Toast notification = Toast.makeText(CoursesActivity.this,
							"Phải điền đầy đủ các trường", Toast.LENGTH_SHORT);
					notification.show();
				}
			}
		});

		dialog.show();
	}

	public void add() {
		final Dialog dialog = new Dialog(CoursesActivity.this);
		dialog.setContentView(R.layout.layout_dialog);
		dialog.setTitle("Nhập khóa học");

		// Lay cac thanh phan layout cua Dialog
		Button btnOK = (Button) dialog.findViewById(R.id.btnOK_dialog);
		Button btnCancel = (Button) dialog.findViewById(R.id.btnCancel_dialog);
		final EditText edtCourse = (EditText) dialog
				.findViewById(R.id.edt_course);
		final EditText edtSchedule = (EditText) dialog
				.findViewById(R.id.edt_schedule);
		final EditText edtTeacher = (EditText) dialog
				.findViewById(R.id.edt_teacher);

		btnCancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dialog.dismiss();
			}
		});
		btnOK.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				if (edtCourse.getText().length() > 0
						&& edtSchedule.getText().length() > 0
						&& edtTeacher.getText().length() > 0) {
					Courses newCourse = new Courses();
					newCourse.setCourses(edtCourse.getText() + "");
					newCourse.setSchedule(edtSchedule.getText() + "");
					newCourse.setTeacher(edtTeacher.getText() + "");
					arrList.add(newCourse);
					dbhelper.addCourse(newCourse);
					dialog.dismiss();
					adapter.notifyDataSetChanged();
					stopMenu();
				} else {
					Toast notification = Toast.makeText(CoursesActivity.this,
							"Phải điền đầy đủ các trường", Toast.LENGTH_SHORT);
					notification.show();
				}
			}
		});

		dialog.show();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_actionbar_menu0, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.add) {
			add();
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
