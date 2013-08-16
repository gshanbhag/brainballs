package com.example.testflow;

import android.app.Activity;

public class BaseActivity extends Activity {
    // Game preference values
    public static final String GAME_PREFERENCES = "GamePrefs";
    public static final String GAME_PREFERENCES_NICKNAME = "Nickname"; // String

    public static final String DEBUG_TAG = "BB Log";
    
    //TODO: Move this to a fully qualified User class later
	static String userName;
	static String userStd = "";
	static String email;
	static int avatarId;
	static int syllabusId;
	static int standardId;
}