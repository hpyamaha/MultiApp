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

public class SortingActivity extends Activity implements android.view.View.OnClickListener{

	EditText input1, input2, input3, input4, input5;
	Button buttonSort;

	String a[] = new String[5];
	int i, j;
	String temp;
	TextView Result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sort);
		// Show the Up button in the action bar.
		setupActionBar();

		buttonSort = (Button) findViewById(R.id.buttonmake);
		input1 = (EditText) findViewById(R.id.input1);
		input2 = (EditText) findViewById(R.id.input2);
		input3 = (EditText) findViewById(R.id.input3);
		input4 = (EditText) findViewById(R.id.input4);
		input5 = (EditText) findViewById(R.id.input5);

		buttonSort.setOnClickListener(this);

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
	public void onClick(View arg0) {
		switch (arg0.getId()) {

		case R.id.buttonReseter:
		{
			input1.setText("");
			input2.setText("");
			input3.setText("");
			input4.setText("");
			input5.setText("");
		}
			break;

		
		case R.id.buttonmake: {
			a[0] = input1.getText().toString();
			a[1] = input2.getText().toString();
			a[2] = input3.getText().toString();
			a[3] = input4.getText().toString();
			a[4] = input5.getText().toString();

			for (i = 0; i < 5; i++) {
				for (j = 0; j < 4; j++) {
					if (a[j].compareToIgnoreCase(a[j + 1]) >= 1) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				}
			}
			this.setContentView(R.layout.main);
			Result = (TextView) findViewById(R.id.resulter);
			Result.setText("");
			for (int i = 0; i < 5; i++)
				Result.append("\n"+a[i]);

		}
		break;
		
		
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sorting, menu);
		return true;
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
