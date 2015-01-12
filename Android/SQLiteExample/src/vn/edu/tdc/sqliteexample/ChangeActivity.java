package vn.edu.tdc.sqliteexample;

import vn.edu.tdc.sqliteexample.models.Account;
import vn.edu.tdc.sqliteexample.sqliteHelper.MyDBHandler;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ChangeActivity extends Activity {
	private MyDBHandler dbhelperRead;
	
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
		setContentView(R.layout.layout_change);
		
		dbhelperRead = new MyDBHandler(this);
		
		final EditText edtName = (EditText)findViewById(R.id.accountName);
		final EditText edtPass = (EditText)findViewById(R.id.accountPassword);
		Button btnChange = (Button)findViewById(R.id.btnChange);
		Button btnCancel = (Button)findViewById(R.id.btnCancel);
		Button btnDel = (Button)findViewById(R.id.btnDel);
		
		btnCancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				backToPrevious();
			}
		});
		
		btnChange.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String name = edtName.getText().toString().trim();
				String pass = edtPass.getText().toString().trim();
				Account acount = new Account();
				acount.setName(name);
				acount.setPassword(pass);
				
				dbhelperRead.updateAccount(name, acount);
				
				storeStatus(STATUS_KEY, STATUS_LOGOUT);
				Intent intent = new Intent(ChangeActivity.this, LoginActivity.class);
				startActivity(intent);
				finish();
			}
		});
		btnDel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				dbhelperRead.deleteDatabase(ChangeActivity.this);
				Intent intent = new Intent(ChangeActivity.this, ContactActivity.class);
				startActivity(intent);
				finish();
			}
		});
	}
	
	public void backToPrevious(){
		this.onBackPressed();
	}
}
