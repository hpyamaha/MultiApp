package com.multipleapp.org;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements android.view.View.OnClickListener {

	Button SI, Multi, Quad, Pal, Sort;
	EditText p, t, r;
	Button buttonFind, buttonReset;
	EditText input1, input2, input3, input4, input5;
	String si;
	String uname1, uname2, uname3, uname4, uname5;
	int i, j;
	String temp;
	TextView textResult;
	TextView result;
	String ressult;
	Button buttonCheck;
	String reesult;
	EditText input12;
	EditText a, b, c;
	Button delta, root;
	TextView output;

	String resultt;

	String count = "";

	int len;
	EditText uname;

	Button buttonShow;

	String no;
	int num = 0;
	int n;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.coption);

		SI = (Button) findViewById(R.id.buttonSI);
		Multi = (Button) findViewById(R.id.buttonMul);
		Quad = (Button) findViewById(R.id.buttonQuad);
		Pal = (Button) findViewById(R.id.buttonPal);
		Sort = (Button) findViewById(R.id.buttonSort);

		SI.setOnClickListener(this);
		Multi.setOnClickListener(this);
		Quad.setOnClickListener(this);
		Pal.setOnClickListener(this);
		Sort.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {

		switch (arg0.getId()) {
		case R.id.buttonSI: {
			this.setContentView(R.layout.si);

			p = (EditText) findViewById(R.id.inputP);
			t = (EditText) findViewById(R.id.inputT);
			r = (EditText) findViewById(R.id.inputR);
			buttonFind = (Button) findViewById(R.id.buttonFind);
			buttonReset = (Button) findViewById(R.id.buttonReseters);

			buttonFind.setOnClickListener(this);
			buttonReset.setOnClickListener(this);
		}
			break;
		case R.id.buttonFind: {

			double pi = 0.0, tm = 0.0, rt = 0.0;

			pi = Double.valueOf(p.getText().toString());
			tm = Double.valueOf(t.getText().toString());
			rt = Double.valueOf(r.getText().toString());

			double SI;

			SI = (pi * tm * rt) / 100;

			si = String.valueOf(SI);

			this.setContentView(R.layout.main);
			result = (TextView) findViewById(R.id.resulter);

		}
			result.setText(si);
			break;
		case R.id.buttonReseters: {
			p.setText("");
			t.setText("");
			r.setText("");
		}
			break;

		case R.id.buttonSort: {
			this.setContentView(R.layout.sort);

			input1 = (EditText) findViewById(R.id.input1);
			input2 = (EditText) findViewById(R.id.input2);
			input3 = (EditText) findViewById(R.id.input3);
			input4 = (EditText) findViewById(R.id.input4);
			input5 = (EditText) findViewById(R.id.input5);
			// result = (TextView) findViewById(R.id.resulter);
			Button buttonSort = (Button) findViewById(R.id.buttonmake);
			Button buttonReseter = (Button) findViewById(R.id.buttonReseter);

			// result.setText("");

			buttonSort.setOnClickListener(this);
			buttonReseter.setOnClickListener(this);

		}
			break;

		case R.id.buttonmake: {

			uname1 = input1.getText().toString();
			uname2 = input2.getText().toString();
			uname3 = input3.getText().toString();
			uname4 = input4.getText().toString();
			uname5 = input5.getText().toString();

			String a[] = new String[5];

			a[0] = (uname1.toString());
			a[1] = (uname2.toString());
			a[2] = (uname3.toString());
			a[3] = (uname4.toString());
			a[4] = (uname5.toString());

			for (i = 0; i < 5; i++) {
				for (j = 0; j < 4; j++) {
					if (a[j].compareTo(a[j + 1]) >= 1) {
						temp = a[j];
						a[j] = a[j + 1];
						a[j + 1] = temp;
					}

				}
			}

			this.setContentView(R.layout.main);
			result = (TextView) findViewById(R.id.resulter);
			for (i = 0; i < 5; i++)
				result.append("\n" + a[i]);
		}
			break;
		case R.id.buttonReseter: {
			result.setText("");
		}
			break;
		case R.id.buttonPal: {
			setContentView(R.layout.pal);
			buttonCheck = (Button) findViewById(R.id.buttonCheck);
			input1 = (EditText) findViewById(R.id.input1);

			buttonCheck.setOnClickListener(this);

		}
			break;
		case R.id.buttonCheck: {
			String uname12;
			uname12 = input1.getText().toString();

			len = uname1.length();

			input1.setText("");

			for (int i = len - 1; i >= 0; i--) {
				String c = uname1;
				count = count + c.charAt(i);

			}
			if (uname1.equalsIgnoreCase(count)) {
				ressult = "Palindrome";
			} else {
				ressult = "Not a Palindrome";
			}

			this.setContentView(R.layout.main);
			result = (TextView) findViewById(R.id.resulter);
			result.setText(uname12 + " is a " + ressult);
			uname1 = "";
			count = "";

		}
			break;

		case R.id.buttonQuad: {
			setContentView(R.layout.quad);

			a = (EditText) findViewById(R.id.input1);
			b = (EditText) findViewById(R.id.input2);
			c = (EditText) findViewById(R.id.input3);
			delta = (Button) findViewById(R.id.buttonDelta);
			root = (Button) findViewById(R.id.buttonRoot);

			delta.setOnClickListener(this);
			root.setOnClickListener(this);

		}
			break;
		case R.id.buttonDelta: {
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

			long re;

			re = (y * y) - (4 * x * z);

			if (re > 0)
				reesult = "The roots are real and distinct";
			else if (re == 0)
				reesult = "The roots are equal";
			else
				reesult = "The roots are imaginary";

			this.setContentView(R.layout.main);
			result = (TextView) findViewById(R.id.resulter);
			result.setText(reesult);
			re = 0;
			reesult = "";

		}
			break;

		case R.id.buttonRoot: {

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

			double re1 = ((-y) + Math.sqrt((y * y) - (4 * x * z))) / (2 * x);
			double re2 = ((-y) + Math.sqrt((y * y) - (4 * x * z))) / (2 * x);
			reesult = "(x" + re1 + "),(x" + re2 + ")";
			this.setContentView(R.layout.main);
			result = (TextView) findViewById(R.id.resulter);
			result.setText(reesult);
			reesult = "";

		}
			break;

		case R.id.buttonMul: {
			setContentView(R.layout.multiplication);

			uname = (EditText) findViewById(R.id.inputMul);

			buttonShow = (Button) findViewById(R.id.buttonShow);
			

			buttonShow.setOnClickListener(this);
			buttonReset.setOnClickListener(this);
		}
			break;
		case R.id.buttonShow: {

			no = uname.getText().toString();
			n = (int) (no.charAt(0));
			if (n >= 48 && n <= 57) {

				num = Integer.parseInt(no);
				/*
				 * int l=no.length(); for(int j=0;j<l;j++){
				 * 
				 * num=num + (int)(no.charAt(j)); if(l>=1) num=num*10; }
				 */

				int re;

				this.setContentView(R.layout.main);
				result = (TextView) findViewById(R.id.resulter);

				for (int i = 1; i <= 10; i++) {

					re = 0;
					re = num * i;
					result.append("\n" + num + " x " + i + " = " + re);

				}

			} else
				result.setText("please enter some value");
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
