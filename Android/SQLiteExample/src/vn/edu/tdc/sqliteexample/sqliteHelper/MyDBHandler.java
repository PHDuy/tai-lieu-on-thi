package vn.edu.tdc.sqliteexample.sqliteHelper;

import vn.edu.tdc.sqliteexample.models.Account;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MyDBHandler extends SQLiteOpenHelper {

	public static final int DATABASE_VERSION = 1;
	private static final String DATABASE_NAME = "accountDB.db";
	public static final String TABLE_ACCOUNT = "accounts";

	public static final String COLUMN_ID = "_id";
	public static final String COLUMN_ACCOUNTNAME = "name";
	public static final String COLUMN_PASSWORD = "password";
	//public static final String COLUMN_STATUS = "status";

	public MyDBHandler(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_ACCOUNT_TABLE = "CREATE TABLE " + TABLE_ACCOUNT + "("
				+ COLUMN_ID + " INTEGER PRIMARY KEY," + COLUMN_ACCOUNTNAME
				+ " TEXT," + COLUMN_PASSWORD + " TEXT" + ")";
		db.execSQL(CREATE_ACCOUNT_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_ACCOUNT);
		onCreate(db);
	}

	public void addAccount(Account account) {
		ContentValues values = new ContentValues();
		values.put(COLUMN_ACCOUNTNAME, account.getName());
		values.put(COLUMN_PASSWORD, account.getPassword());
		//values.put(COLUMN_STATUS, account.getStatus());

		SQLiteDatabase db = this.getWritableDatabase();

		db.insert(TABLE_ACCOUNT, null, values);
		// db.close();
		this.close();
	}

	public Account findAccount(String accountname) {
		String query = "Select * FROM " + TABLE_ACCOUNT + " WHERE "
				+ COLUMN_ACCOUNTNAME + " =  \"" + accountname + "\"";

		SQLiteDatabase db = this.getWritableDatabase();

		Cursor cursor = db.rawQuery(query, null);

		Account account = new Account();

		if (cursor.moveToFirst()) {
			cursor.moveToFirst();
			account.setId(cursor.getString(0));
			account.setName(cursor.getString(1));
			account.setPassword(cursor.getString(2));
			//account.setStatus(cursor.getString(3));
			cursor.close();
		} else {
			account = null;
		}
		// db.close();
		this.close();
		return account;
	}


	public boolean deleteAccount(String accountname) {

		boolean result = false;

		String query = "Select * FROM " + TABLE_ACCOUNT + " WHERE "
				+ COLUMN_ACCOUNTNAME + " =  \"" + accountname + "\"";

		SQLiteDatabase db = this.getWritableDatabase();

		Cursor cursor = db.rawQuery(query, null);

		Account account = new Account();

		if (cursor.moveToFirst()) {
			account.setId(cursor.getString(0));
			db.delete(TABLE_ACCOUNT, COLUMN_ID + " = ?",
					new String[] { String.valueOf(account.getId()) });
			cursor.close();
			result = true;
		}
		// db.close();
		this.close();
		return result;
	}

	public void updateAccount(String name, Account account) {
		deleteAccount(name);
		addAccount(account);
	}

	public boolean isDatabaseItemsExist() {
		SQLiteDatabase db = this.getWritableDatabase();
		boolean dbItemExists = false;
		try {
			String sql = "select * from " + TABLE_ACCOUNT;
			Cursor cur = db.rawQuery(sql, null);
			//Log.v("test", cur.getCount()+"");
			if (cur.getCount() != 0) {
				dbItemExists = true;
			}
		} catch (Exception e) {
			/* fail */
		}

		// close();
		this.close();
		return dbItemExists;
	}

	public void deleteDatabase(Context context){
		context.deleteDatabase(DATABASE_NAME);
	}
	
	public void close() {
		SQLiteDatabase db = this.getWritableDatabase();
		db.close();
	}
}
