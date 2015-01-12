package vn.edu.tdc.sqliteexample;

import vn.edu.tdc.sqliteexample.models.Account;
import vn.edu.tdc.sqliteexample.sqliteHelper.MyDBHandler;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ContactActivity extends Activity {
	private MyDBHandler dbhelper;
	
	public static final String PRES_NAME = "LoginStatus";
	public static final String STATUS_KEY = "Status";
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
		setContentView(R.layout.layout_contact);
		
		dbhelper = new MyDBHandler(this);
		
		Button btnCreate = (Button)findViewById(R.id.btnCreate);
		final EditText edtName = (EditText)findViewById(R.id.accountName);
		final EditText edtPass = (EditText)findViewById(R.id.accountPassword);
		
		//Log.v("test", dbhelper.isDatabaseItemsExist()+"");
		if(dbhelper.isDatabaseItemsExist()){
			String status = reStoreStatus(STATUS_KEY);
			if(status.equalsIgnoreCase(STATUS_LOGOUT)){
				Intent intent = new Intent(ContactActivity.this, LoginActivity.class);
				startActivity(intent);
				finish();
			}
			else{
				Intent intent = new Intent(ContactActivity.this, WellcomeActivity.class);
				startActivity(intent);
				finish();
			}
		}
		
		btnCreate.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Account account = new Account();
				account.setName(edtName.getText().toString());
				account.setPassword(edtPass.getText().toString());
				dbhelper.addAccount(account);
				
				storeStatus(STATUS_KEY, STATUS_LOGOUT);
				
				Intent intent = new Intent(ContactActivity.this, LoginActivity.class);
				startActivity(intent);
				finish();
			}
		});

		/*Intent callIntent = new Intent(Intent.ACTION_CALL);
		callIntent.setData(Uri.parse("tel:+84976428495"));
		startActivity(callIntent);*/
		
	}
}
