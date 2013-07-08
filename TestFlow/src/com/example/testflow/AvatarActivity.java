package com.example.testflow;

import java.util.ArrayList;

import com.example.testflow.util.SystemUiHider;


import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.SharedPreferences.Editor;


import android.os.Bundle;

import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class AvatarActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);

		setContentView(R.layout.avatar);
		
		initNextButton();
	}
	
	private void initNextButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	
                Toast.makeText(AvatarActivity.this, "TODO: Launch Syllabus Activity \r\n[" + userName +", " + email +"]", Toast.LENGTH_LONG).show();
            }
        });
	}
}
