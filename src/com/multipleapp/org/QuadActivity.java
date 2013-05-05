//Quadratic Equation Activity
package com.multipleapp.org;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.multipleapp.org.R;

public class QuadActivity extends Activity implements android.view.View.OnClickListener {

	EditText a, b, c;
	Button delta, root;
	TextView output;

	String result;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quad);

		a = (EditText) findViewById(R.id.input1);
		b = (EditText) findViewById(R.id.input2);
		c = (EditText) findViewById(R.id.input3);
		delta = (Button) findViewById(R.id.buttonDelta);
		root = (Button) findViewById(R.id.buttonRoot);
		// output = (TextView)findViewById(R.id.textOutput);

		output.setText("");
		delta.setOnClickListener(this);
		root.setOnClickListener(this);

	}

	@Override
	public void onClick(View src) {
		int x = 1, y = 1, z = 1;
		if ((a.getText().toString()) == " ")
			x = 1;
		else
			x = Integer.parseInt(a.getText().toString());
		if ((b.getText().toString()) == " ")
			y = 1;
		else
			y = Integer.parseInt(b.getText().toString());
		if ((c.getText().toString()) == " ")
			z = 1;
		else
			z = Integer.parseInt(c.getText().toString());

		switch (src.getId()) {

		case R.id.buttonDelta: {
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
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
