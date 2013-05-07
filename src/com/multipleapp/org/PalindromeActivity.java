package com.multipleapp.org;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.v4.app.NavUtils;
import android.annotation.TargetApi;
import android.os.Build;

public class PalindromeActivity extends Activity implements android.view.View.OnClickListener {

	
	Button buttonCheck;
	EditText input1;
	TextView textResult;
	String count = "";
	String result = "";
	int len;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pal);
		// Show the Up button in the action bar.
		setupActionBar();
		buttonCheck = (Button) findViewById(R.id.buttonCheck);
		input1 = (EditText) findViewById(R.id.input12);

		buttonCheck.setOnClickListener(this);

	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.palindrome, menu);
		return true;
	}
	
	@Override
	public void onClick(View arg0) {

		String uname1;
		uname1 = input1.getText().toString();

		len = uname1.length();

		input1.setText("");

		for (int i = len - 1; i >= 0; i--) {
			String c = uname1;
			count = count + c.charAt(i);

		}

		this.setContentView(R.layout.main);

		textResult = (TextView) findViewById(R.id.resulter);

		if (uname1.equalsIgnoreCase(count)) {
			result = "Palindrome";
		} else {
			result = "Not a Palindrome";
		}

		textResult.setText(uname1 + " is a " + result);

		uname1 = "";
		count = "";

	}
	

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
