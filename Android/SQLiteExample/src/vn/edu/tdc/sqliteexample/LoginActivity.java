package vn.edu.tdc.sqliteexample;

import vn.edu.tdc.sqliteexample.models.Account;
import vn.edu.tdc.sqliteexample.sqliteHelper.MyDBHandler;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
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
		setContentView(R.layout.layout_login);

		dbhelperRead = new MyDBHandler(this);

		Button btnLogin = (Button) findViewById(R.id.btnCreate);
		final EditText edtName = (EditText) findViewById(R.id.accountName);
		final EditText edtPass = (EditText) findViewById(R.id.accountPassword);

		btnLogin.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					String name = edtName.getText().toString().trim();
					String pass = edtPass.getText().toString().trim();
					Account account = dbhelperRead.findAccount(name);
					//Log.v("test", "Login:"+account.toString());
					if (account == null) {
						Toast.makeText(LoginActivity.this, "Invalid Username!", Toast.LENGTH_LONG).show();
					} else {
						String mPass = account.getPassword();
						if (mPass.equalsIgnoreCase(pass)) {
							storeStatus(STATUS_KEY, STATUS_LOGIN);
							storeStatus(NAME_KEY, name);
							Intent intent = new Intent(LoginActivity.this, WellcomeActivity.class);
							startActivity(intent);
							finish();
						} else {
							Toast.makeText(LoginActivity.this, "Invalid Password!", Toast.LENGTH_LONG).show();
						}
					}
				} catch (Exception e) {
					// TODO: handle exception
					Log.v("test", "Read data error!");
				}
			}
			
		});

		/*
		 * Intent callIntent = new Intent(Intent.ACTION_CALL);
		 * callIntent.setData(Uri.parse("tel:+84976428495"));
		 * startActivity(callIntent);
		 */

	}
}
