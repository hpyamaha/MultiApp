// Palindrome Activity
package com.multipleapp.org;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.multipleapp.org.R;

public class PalActivity extends Activity implements android.view.View.OnClickListener {

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
		buttonCheck = (Button) findViewById(R.id.buttonCheck);
		input1 = (EditText) findViewById(R.id.input12);

		buttonCheck.setOnClickListener(this);

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
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}