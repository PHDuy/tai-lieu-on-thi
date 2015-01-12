package com.example.assigment2;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_login);
		ActionBar bar = getActionBar(); // or
										// MainActivity.getInstance().getActionBar()
		bar.setBackgroundDrawable(new ColorDrawable(0xffa276eb));
		bar.setDisplayShowTitleEnabled(false); // required to force redraw,
												// without, gray color
		bar.setDisplayShowTitleEnabled(true);
		// ----------------------------------------------------------------------
		TextView appTitle = (TextView) findViewById(R.id.app_title);
		Typeface face = Typeface.createFromAsset(getAssets(),
				"font/HoboStd.otf");
		appTitle.setTypeface(face);
		// -----------------------------------------------------------------------
		Button btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				EditText edtUser = (EditText) findViewById(R.id.txtUsername);
				EditText edtPass = (EditText) findViewById(R.id.txtPassword);
				String key="1251tt1420";
				if (edtUser.getText().toString().equals(key)
						&& edtPass.getText().toString().equals(key)) {
					Intent myIntent = new Intent(LoginActivity.this,
							CoursesActivity.class);
					startActivity(myIntent);
					finish();
				} else {
					Toast notification = Toast.makeText(LoginActivity.this,
							"Tài khoản hoặc mật khẩu không đúng",
							Toast.LENGTH_SHORT);
					notification.show();
					edtPass.setText("");
					edtPass.requestFocus(); 
					
				}
			}
		});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
