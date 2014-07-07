package com.example.exim_guide_final;



import android.annotation.SuppressLint;
import android.app.ActionBar.LayoutParams;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;

public class search_by_code extends Activity {
	ListView listcodewise;
	SQLiteConnector sqlConnect;
	public static int itc_code;
	TableLayout t1;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.search_by_code);
		
	}

	

	@SuppressLint({ "InlinedApi", "NewApi" })
	public void onClickStatewise(View v) {
		 EditText  code=(EditText)findViewById(R.id.code_field);
		 String temp=code.getText().toString();
		 itc_code=Integer.parseInt(temp);
		 TableLayout tl = (TableLayout) findViewById(R.id.main_table);
		/* TableRow tr_head = new TableRow(this);
		 tr_head.setId(10);
		 tr_head.setBackgroundColor(Color.GRAY);
		 tr_head.setLayoutParams(new LayoutParams(
		 LayoutParams.FILL_PARENT,
		 LayoutParams.WRAP_CONTENT));
		 
		 
		 TextView itc = new TextView(this);
         itc.setId(20);
         itc.setText("DATE");
         itc.setTextColor(Color.WHITE);
         itc.setPadding(5, 5, 5, 5);
         tr_head.addView(itc);// add the column to the table row here

         TextView description = new TextView(this);
         description.setId(21);// define id that must be unique
         description.setText("Wt(Kg.)"); // set the text for the header 
         description.setTextColor(Color.WHITE); // set the color
         description.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView(description); // add the column to the table row here
         
         TextView policy = new TextView(this);
         policy.setId(21);// define id that must be unique
         policy.setText("Wt(Kg.)"); // set the text for the header 
         policy.setTextColor(Color.WHITE); // set the color
         policy.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView( policy); // add the column to the table row her
         
         TextView conditions = new TextView(this);
         conditions.setId(21);// define id that must be unique
         conditions.setText("Wt(Kg.)"); // set the text for the header 
         conditions.setTextColor(Color.WHITE); // set the color
         conditions.setPadding(5, 5, 5, 5); // set the padding (if required)
         tr_head.addView( conditions); // add the column to the table row her
         */
         sqlConnect = new SQLiteConnector(this);
		// listcodewise = (ListView) findViewById(R.id.codelist);
			

		
			//ArrayAdapter<Object> adapter1 = new ArrayAdapter<Object>(search_by_code.this, R.layout.color, sqlConnect.codewise());
			//itc.setAdapter(adapter1);
         ArrayList<ArrayList<Object>> data =  sqlConnect.codewise();
			for (int position=0; position < data.size(); position++)
	    	{
	    		TableRow tableRow= new TableRow(this);
	 
	    		ArrayList<Object> row = data.get(position);
	 
	    		TextView idText = new TextView(this);
	    		idText.setText(row.get(0).toString());
	    		tableRow.addView(idText);
	 
	    		TextView textOne = new TextView(this);
	    		textOne.setText(row.get(1).toString());
	    		tableRow.addView(textOne);
	 
	    		TextView textTwo = new TextView(this);
	    		textTwo.setText(row.get(2).toString());
	    		tableRow.addView(textTwo);
	 
	    		tl.addView(tableRow);
	    	}
       }
	
}
