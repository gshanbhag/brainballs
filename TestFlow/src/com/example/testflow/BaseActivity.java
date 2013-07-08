package com.example.testflow;

import android.app.Activity;

public class BaseActivity extends Activity {
    // Game preference values
    public static final String GAME_PREFERENCES = "GamePrefs";
    public static final String GAME_PREFERENCES_NICKNAME = "Nickname"; // String

    public static final String DEBUG_TAG = "BB Log";
    
    //TODO: Move this to a fully qualified User class later
	String userName;
	String email;
}