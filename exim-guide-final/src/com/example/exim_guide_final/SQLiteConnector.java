package com.example.exim_guide_final;

import java.util.ArrayList;
import java.util.List;






import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
/**
 * 
 * @author manish.s
 *
 */

public class SQLiteConnector extends Activity{
	
	private SQLiteDatabase database;
	private SQLiteHelper sqlHelper;
	private Cursor cursor;
	boolean flag=false;
	private int code=search_by_code.itc_code;
	//private String state=Statewise.Statewisesearch;
	//private String desc=Descr.Statewisesearch;
	private static final String TABLE_RECORD = "hs8";
	
	public SQLiteConnector(Context context) {
		sqlHelper = new SQLiteHelper(context);
		
	}
	
	// Getting All records

			
/*public ArrayList<Object> codewise() {
				int n=0;
		
				ArrayList<Object> codeList = new ArrayList<Object>();
				
				
				String selectQuery = "SELECT  hs8_no,hs8_des,policy,conditions FROM " + TABLE_RECORD + " where hs8_no LIKE '"+code+"' ; ";

				database = sqlHelper.getReadableDatabase();
				cursor = database.rawQuery(selectQuery, null);
				if (cursor.moveToFirst()) {
					do {
						codeList.add("ITCHS- "+cursor.getString(0));
						codeList.add("ITEM DESCRIPTION- "+cursor.getString(1));
						codeList.add("POLICY- "+cursor.getString(2));
						codeList.add("CONDITIONS- "+cursor.getString(3));
						
						
					} while (cursor.moveToNext());
				}
				else{
					codeList.add("no result found");
				}
				
				
			
				database.close();
				return codeList;
				
			}
		
*/				
	public ArrayList<ArrayList<Object>> codewise()
	{
		// create an ArrayList that will hold all of the data collected from
		// the database.
		ArrayList<ArrayList<Object>> dataArrays = new ArrayList<ArrayList<Object>>();
		String selectQuery = "SELECT  hs8_no,hs8_des,policy,conditions FROM " + TABLE_RECORD + " where hs8_no LIKE '"+code+"' ; ";
		database = sqlHelper.getReadableDatabase();
		cursor = database.rawQuery(selectQuery, null);

		// this is a database call that creates a "cursor" object.
		// the cursor object store the information collected from the
		// database and is used to iterate through the data.
		
		if (cursor.moveToFirst()) {
			do {
				ArrayList<Object> codeList = new ArrayList<Object>();
				codeList.add("ITCHS- "+cursor.getString(0));
				codeList.add("ITEM DESCRIPTION- "+cursor.getString(1));
				codeList.add("POLICY- "+cursor.getString(2));
				codeList.add("CONDITIONS- "+cursor.getString(3));
				dataArrays.add(codeList);
				
			} while (cursor.moveToNext());
		}
		
		
		
	
		database.close();
		return dataArrays;
		
	}
 
		
	

/*public List<String> description() {
	
	List<String> studentList = new ArrayList<String>();
	
	String selectQuery = "SELECT  distinct itc,hs8_des,policy,conditions FROM " + TABLE_RECORD + " where hs8_des LIKE '%"+desc+"%' ; ";

	database = sqlHelper.getReadableDatabase();
	cursor = database.rawQuery(selectQuery, null);
	if (cursor.moveToFirst()) {
		do {
			studentList.add("ITCHS- "+cursor.getString(0));
			studentList.add("ITEM DESCRIPTION- "+cursor.getString(1));
			studentList.add("POLICY- "+cursor.getString(2));
			studentList.add("CONDITIONS- "+cursor.getString(3));
			studentList.add("");
			
		} while (cursor.moveToNext());
	}
	else{
		studentList.add("no result found");
	}
	database.close();
	return studentList;
}
*/
	
}
