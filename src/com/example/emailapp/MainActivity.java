package com.example.emailapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

	Button btn;
	EditText ed1,ed2,ed3,ed4,ed5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn=(Button)findViewById(R.id.button1);
		ed1=(EditText)findViewById(R.id.editText1);
		ed1=(EditText)findViewById(R.id.editText1);
		ed1=(EditText)findViewById(R.id.editText1);
	}
}
