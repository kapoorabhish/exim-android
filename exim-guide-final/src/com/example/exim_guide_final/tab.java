package com.example.exim_guide_final;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;



@SuppressWarnings("deprecation")
public class tab extends TabActivity{
	
	private TabHost mTabHost;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_activity);
		
		Resources res=getResources();
		mTabHost=getTabHost();
		TabHost.TabSpec spec;
		Intent intent;
		
		//search by code tab
		intent=new Intent(this,search_by_code.class);
		spec=mTabHost.newTabSpec("code")
				.setIndicator("By Code",res.getDrawable(R.drawable.search))
				.setContent(intent);
		mTabHost.addTab(spec);
		
		
		//search by description tab
		intent=new Intent(this,search_by_description.class);
		spec=mTabHost.newTabSpec("description")
				.setIndicator("By Description",res.getDrawable(R.drawable.search))
				.setContent(intent);
		mTabHost.addTab(spec);
		
		
		//Tarrif calculator tab
		
		intent=new Intent(this,calculate_tarrif.class);
		spec=mTabHost.newTabSpec("tarrif")
				.setIndicator("Tarrif",res.getDrawable(R.drawable.calculator))
				.setContent(intent);
		mTabHost.addTab(spec);
		
		mTabHost.setCurrentTab(0);
		
	}


}
