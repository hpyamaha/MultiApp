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

public class SIActivity extends Activity implements android.view.View.OnClickListener {


	EditText p, t, r;
	Button buttonFind, buttonReset;
	TextView Result;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.si);
		// Show the Up button in the action bar.
		setupActionBar();

		p = (EditText) findViewById(R.id.inputP);
		t = (EditText) findViewById(R.id.inputT);
		r = (EditText) findViewById(R.id.inputR);
		buttonFind = (Button) findViewById(R.id.buttonFind);
		buttonReset = (Button) findViewById(R.id.buttonReseters);

		buttonFind.setOnClickListener(this);
		buttonReset.setOnClickListener(this);

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
	public void onClick(View src) {

		switch (src.getId()) {

		case R.id.buttonFind: {
			// Intent myIntent = new Intent(this, MainActivity.class);

			double pi = 0.0, tm = 0.0, rt = 0.0;

			String si;

			pi = Double.valueOf(p.getText().toString());
			tm = Double.valueOf(t.getText().toString());
			rt = Double.valueOf(r.getText().toString());

			double SI;

			SI = (pi * tm * rt) / 100;

			si = String.valueOf(SI);
			// */
			// myIntent.putExtra("unamesi", si);
			// this.startActivity(myIntent);
			this.setContentView(R.layout.main);
			Result = (TextView) findViewById(R.id.resulter);
			Result.setText(si);

		}
			break;
		case R.id.buttonReseters: {
			p.setText("");
			t.setText("");
			r.setText("");
		}
			break;
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.si, menu);
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
