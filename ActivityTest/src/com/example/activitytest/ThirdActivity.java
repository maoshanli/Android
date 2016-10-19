package com.example.activitytest;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class ThirdActivity extends BaseActivity {
  protected void onCreate(Bundle savedInstanceState){
	   super.onCreate(savedInstanceState);
	   Log.d("ThirdActivity", "Task id is"+getTaskId());
	   requestWindowFeature(Window.FEATURE_NO_TITLE);
	   setContentView(R.layout.third_layout);
	   Button button3=(Button)findViewById(R.id.button_3);
	   button3.setOnClickListener(new OnClickListener(){
		   public void onClick(View v){
			ActivityConllector.finishAll();   
		   }
	   });
  }
}
