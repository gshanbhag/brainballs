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
public class RegistrationActivity extends Activity {
	String userName;
	String email;
	ArrayList<String> emailList;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		this.requestWindowFeature(Window.FEATURE_NO_TITLE); 
		super.onCreate(savedInstanceState);

		setContentView(R.layout.registration);
		
		initNextButton();
		initEmailSpinner();

	}
	
	private void initNextButton() {
		// Handle password setting dialog
        Button nextButton = (Button) findViewById(R.id.button1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	EditText nicknameText = (EditText) findViewById(R.id.editText1); 
            	userName = nicknameText.getText().toString();
            	
                Toast.makeText(RegistrationActivity.this, "TODO: Launch Avatar Activity \r\n[" + userName +", " + email +"]", Toast.LENGTH_LONG).show();
            }
        });
	}
	
    /**
     * Initialize the nickname entry
     */
    private void initNicknameEntry() {
        // Save Nickname
        final EditText nicknameText = (EditText) findViewById(R.id.editText1);
        //if (mGameSettings.contains(GAME_PREFERENCES_NICKNAME)) {
        //    nicknameText.setText(mGameSettings.getString(GAME_PREFERENCES_NICKNAME, ""));
        //}
        nicknameText.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((event.getAction() == KeyEvent.ACTION_DOWN) && (keyCode == KeyEvent.KEYCODE_ENTER)) {
                    userName = nicknameText.getText().toString();
                    //Editor editor = mGameSettings.edit();
                    //editor.putString(GAME_PREFERENCES_NICKNAME, strNickname);
                    //editor.commit();
                    return true;
                }
                return false;
            }
        });
    }

    private void initEmailSpinner() {
        // Populate Spinner control with email accounts on the device
        final Spinner spinner = (Spinner) findViewById(R.id.spinner1);
        
        //retrieve all registered users on the device
        AccountManager am = AccountManager.get(this); // "this" references the current Context
      	Account[] list = am.getAccountsByType("com.google");
      	emailList = new ArrayList<String>();

      	for(Account account: list) {
      			emailList.add(account.name);
      		}
      		
      	ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this, 
      													android.R.layout.simple_spinner_dropdown_item, emailList);
      	spinner.setAdapter(spinnerArrayAdapter);
        //if (mGameSettings.contains(GAME_PREFERENCES_GENDER)) {
        //    spinner.setSelection(mGameSettings.getInt(GAME_PREFERENCES_GENDER, 0));
        //}
        // Handle spinner selections
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View itemSelected, int selectedItemPosition,
                    long selectedId) {
                //Editor editor = mGameSettings.edit();
                //editor.putInt(GAME_PREFERENCES_GENDER, selectedItemPosition);
                //editor.commit();
            	
            	//pop up the selection
            	//Toast.makeText(RegistrationActivity.this, 
            	//		itemSelected.toString(), 
				//		Toast.LENGTH_LONG).show();
            	
            	email = emailList.get(selectedItemPosition);
            }

            public void onNothingSelected(AdapterView<?> parent) {
            	email = emailList.get(0);
            }
        });
    }
}
