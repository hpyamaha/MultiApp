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

public class QuadraticActivity extends Activity implements android.view.View.OnClickListener {

	EditText a, b, c;
	Button delta, root;
	TextView output;

	String result;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quad);
		// Show the Up button in the action bar.
		setupActionBar();

		a = (EditText) findViewById(R.id.inputa);
		b = (EditText) findViewById(R.id.inputb);
		c = (EditText) findViewById(R.id.inputc);
		delta = (Button) findViewById(R.id.buttonDelta);
		root = (Button) findViewById(R.id.buttonRoot);
		// output = (TextView)findViewById(R.id.textOutput);

		
		delta.setOnClickListener(this);
		root.setOnClickListener(this);

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

		case R.id.buttonDelta: {
			int x, y , z;
			
			String d,e,f;
			d=a.getText().toString();
			e=b.getText().toString();
			f=c.getText().toString();
			
			x=Integer.parseInt(d);
			y=Integer.parseInt(e);
			z=Integer.parseInt(f);
			
			long re;

			re = (y * y) - (4 * x * z);

			if (re > 0)
				result = "The roots are real and distinct";
			else if (re == 0)
				result = "The roots are equal";
			else
				result = "The roots are imaginary";
			this.setContentView(R.layout.main);
			output = (TextView) findViewById(R.id.resulter);
			output.setText(result);

			re = 0;
			result = "";
		}

			break;
		case R.id.buttonRoot: {

			int x = 1, y = 1, z = 1;
			
			x = Integer.parseInt(a.getText().toString());
			y = Integer.parseInt(b.getText().toString());
			z = Integer.parseInt(c.getText().toString());

			double re1 = ((-y) + Math.sqrt((y * y) - (4 * x * z))) / (2 * x);
			double re2 = ((-y) + Math.sqrt((y * y) - (4 * x * z))) / (2 * x);
			result = "(x" + re1 + "),(x" + re2 + ")";
			this.setContentView(R.layout.main);
			output = (TextView) findViewById(R.id.resulter);
			output.setText(result);
			result = "";
		}
			break;
		}

	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quadratic, menu);
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
