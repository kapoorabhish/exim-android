package com.example.exim_guide_final;


import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Handler x= new Handler();
		x.postDelayed(new SplashHandler() , 5000);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	class SplashHandler implements Runnable{
		public void run(){
			startActivity(new Intent(getApplication(),tab.class));
			MainActivity.this.finish();
		}
	}
}
