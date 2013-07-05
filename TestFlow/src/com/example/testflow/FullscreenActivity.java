package com.example.testflow;

import com.example.testflow.util.SystemUiHider;


import android.app.Activity;

import android.os.Bundle;

import android.view.Window;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class FullscreenActivity extends Activity {


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_fullscreen);

	}
}
