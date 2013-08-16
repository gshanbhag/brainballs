package com.example.testflow;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.testflow.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class StandardActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);
		
		initGreeting();
		initStandard();
		initBackButton();
		initNextButton();
		
	}
	
	private void initGreeting() {
		setContentView(R.layout.standard);
		TextView nameString = (TextView) findViewById(R.id.badge_name);
		nameString.setText(userName);
		TextView stdString = (TextView) findViewById(R.id.badge_standard);
		userStd = "CBSE";
		String usrSyllStd = userStd;
		stdString.setText(usrSyllStd);
	}
	
	private void initStandard() {
		int[] standard = {
							R.id.std_1st, R.id.std_2nd, R.id.std_3rd,
							R.id.std_4th, R.id.std_5th, R.id.std_6th,
						};
		
		for (int i=0; i < standard.length; i++) {
			ImageView img = (ImageView) findViewById(standard[i]);
			img.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                //v.getId() will give you the image id
	            	standardId = v.getId();
	            	//TODO: Visually show the button as selected
	            	
	            }
			});
		}
	}
	
	private void initNextButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button_next);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Toast.makeText(StandardActivity.this, 
            			"TODO: Launch Standard Activity \r\n[" 
            			+ userName +", " + email + ", " + avatarId + ", " 
            					+ syllabusId + ", " + standardId + "]", 
            			Toast.LENGTH_LONG).show();
            	
            	//startActivity(new Intent(StandardActivity.this, HomeActivity.class));
                //StandardActivity.this.finish();
            }
        });
	}
	
	private void initBackButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button_back);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {            	
            	startActivity(new Intent(StandardActivity.this, SyllabusActivity.class));
                StandardActivity.this.finish();
            }
        });
	}
}
