package vn.edu.tdc.sqliteexample;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class WellcomeActivity extends Activity {
	public static final String PRES_NAME = "LoginStatus";
	public static final String STATUS_KEY = "Status";
	public static final String NAME_KEY = "Name";
	public static final String STATUS_LOGIN = "Login";
	public static final String STATUS_LOGOUT = "Logout";
	
	private void storeStatus(String key, String status){
		SharedPreferences account = getSharedPreferences(PRES_NAME, 0);
		SharedPreferences.Editor editor = account.edit();
		editor.putString(key, status);
		editor.commit();
	}
	private String reStoreStatus(String key){
		SharedPreferences statusInfo = getSharedPreferences(PRES_NAME, 0);
		return statusInfo.getString(key, null);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_wellcome);
		
		TextView txtName = (TextView)findViewById(R.id.wellcomeName);
		txtName.setText(reStoreStatus(NAME_KEY));
		Button btnLogout = (Button)findViewById(R.id.btnLogout);
		Button btnChange = (Button)findViewById(R.id.btnChange);
		btnLogout.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				storeStatus(STATUS_KEY, STATUS_LOGOUT);
				Intent intent = new Intent(WellcomeActivity.this, LoginActivity.class);
				startActivity(intent);
				finish();
			}
		});
		btnChange.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(WellcomeActivity.this, ChangeActivity.class);
				startActivity(intent);
				//finish();
			}
		});
	}
}
