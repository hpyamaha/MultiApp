// Sorter Activity
package com.multipleapp.org;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.multipleapp.org.R;

public class SortActivity extends Activity implements android.view.View.OnClickListener {

	EditText input1, input2, input3, input4, input5;
	Button buttonSort;

	String a[] = new String[5];
	int i, j;
	String temp;
	TextView Result;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.main);

		buttonSort = (Button) findViewById(R.id.buttonSort);
		input1 = (EditText) findViewById(R.id.input1);
		input2 = (EditText) findViewById(R.id.input2);
		input3 = (EditText) findViewById(R.id.input3);
		input4 = (EditText) findViewById(R.id.input4);
		input5 = (EditText) findViewById(R.id.input5);

		buttonSort.setOnClickListener(this);

	}

	@Override
	public void onClick(View arg0) {

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
		
		for(int i=0;i<5;i++)
			Result.setText(a[i]);
			
	}

}
