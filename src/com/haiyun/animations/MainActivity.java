package com.haiyun.animations;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity {
private Button alphaButton,rotateButton, scaleButton, transButton;
private ImageView imageView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		alphaButton = (Button)findViewById(R.id.alphaButton);
		rotateButton = (Button)findViewById(R.id.rotateButton);
		scaleButton = (Button)findViewById(R.id.scaleButton);
		transButton = (Button)findViewById(R.id.translateButton);
		imageView = (ImageView)findViewById(R.id.imageView);
		alphaButton.setOnClickListener(new AlphaButtonListener());
		rotateButton.setOnClickListener(new RotateButtonListener());
		scaleButton.setOnClickListener(new ScaleButtonListener());
		transButton.setOnClickListener(new TranslateButtonListener());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	class AlphaButtonListener implements OnClickListener{
		public void onClick(View v) {
			Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha);
			imageView.startAnimation(animation);
		}
		
	}
	class RotateButtonListener implements OnClickListener{
		public void onClick(View v) {
			Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotate);
			imageView.startAnimation(animation);
		}
		
	}
	class ScaleButtonListener implements OnClickListener{
		public void onClick(View v) {
			Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale);
			imageView.startAnimation(animation);
		}
		
	}
	class TranslateButtonListener implements OnClickListener{
		public void onClick(View v) {
			Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate);
			imageView.startAnimation(animation);
		}
		
	}

}
