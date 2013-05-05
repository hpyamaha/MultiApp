//Simple Interest Activity
package com.multipleapp.org;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SIFinder extends Activity implements android.view.View.OnClickListener {

	EditText p, t, r;
	Button buttonFind, buttonReset;
	TextView Result;

	// String uname1, uname2, uname3;
	@SuppressLint("NewApi")
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.si);

		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {

			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
		p = (EditText) findViewById(R.id.inputP);
		t = (EditText) findViewById(R.id.inputT);
		r = (EditText) findViewById(R.id.inputR);
		buttonFind = (Button) findViewById(R.id.buttonFind);
		buttonReset = (Button) findViewById(R.id.buttonReseters);

		buttonFind.setOnClickListener(this);
		buttonReset.setOnClickListener(this);

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
	 public boolean onOptionsItemSelected(MenuItem item) {
	        switch (item.getItemId()) {
	        case android.R.id.home:
	            NavUtils.navigateUpFromSameTask(this);
	            return true;
	        }
	        return super.onOptionsItemSelected(item);
	    }
}
