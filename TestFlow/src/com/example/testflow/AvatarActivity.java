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
public class AvatarActivity extends BaseActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);
		
		initGreeting();
		initAvatars();
		initNextButton();
	}
	
	private void initGreeting() {
		setContentView(R.layout.avatar);
		TextView helloString = (TextView) findViewById(R.id.avatar_name);
		helloString.setText("Hello, " + userName);
	}
	
	private void initAvatars() {
		int[] avatars = {R.id.avatar_kohli, R.id.avatar_dhoni,R.id.avatar_gayle};
		
		for (int i=0; i < avatars.length; i++) {
			ImageView img = (ImageView) findViewById(avatars[i]);
			img.setOnClickListener(new View.OnClickListener() {
	            public void onClick(View v) {
	                //v.getId() will give you the image id
	            	avatarId = v.getId();
	            	//TODO: Visually show the button as selected
	            	
	            }
			});
		}
	}
	
	private void initNextButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Toast.makeText(AvatarActivity.this, "TODO: Launch Syllabus Activity \r\n[" 
            			+ userName +", " + email + ", " + avatarId +"]", 
            			Toast.LENGTH_LONG).show();
            	startActivity(new Intent(AvatarActivity.this, SyllabusActivity.class));
                AvatarActivity.this.finish();
            }
        });
	}
}
