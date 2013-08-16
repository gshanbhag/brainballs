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
public class SyllabusActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);
		
		initGreeting();
		initSyllabus();
		initBackButton();
		initNextButton();
		
	}
	
	private void initGreeting() {
		setContentView(R.layout.syllabus);
		TextView nameString = (TextView) findViewById(R.id.badge_name);
		nameString.setText(userName);
		TextView stdString = (TextView) findViewById(R.id.badge_standard);
		stdString.setText(userStd);
	}
	
	private void initSyllabus() {
		int[] syllabi = {R.id.syllabus_cbse, R.id.syllabus_icse};
		
		for (int i=0; i < syllabi.length; i++) {
			ImageView img = (ImageView) findViewById(syllabi[i]);
			img.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                //v.getId() will give you the image id
	            	syllabusId = v.getId();
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
            	Toast.makeText(SyllabusActivity.this, "TODO: Launch Standard Activity \r\n[" 
            			+ userName +", " + email + ", " + avatarId + ", " + syllabusId + "]", 
            			Toast.LENGTH_LONG).show();
            	
            	startActivity(new Intent(SyllabusActivity.this, StandardActivity.class));
                SyllabusActivity.this.finish();
            }
        });
	}
	
	private void initBackButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button_back);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {            	
            	startActivity(new Intent(SyllabusActivity.this, AvatarActivity.class));
                SyllabusActivity.this.finish();
            }
        });
	}
}
