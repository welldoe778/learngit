package com.haiyun.animations;

import java.text.AttributedCharacterIterator.Attribute;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class TitleLayout extends LinearLayout {

	public TitleLayout(Context context,AttributeSet attrs) {
		super(context,attrs);
		LayoutInflater.from(context).inflate(R.layout.title, this);
		Button titleBack = (Button)findViewById(R.id.titileBack);
		Button titleEditButton = (Button)findViewById(R.id.titleEdit);
		titleBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				((Activity)getContext()).finish();
				
			}
		});
		titleEditButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getContext(),"You clicked Edit Button",Toast.LENGTH_LONG).show();
				
			}
		});
		// TODO Auto-generated constructor stub
	}

}
