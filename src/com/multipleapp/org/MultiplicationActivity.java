//Multiplication Table Activity
package com.multipleapp.org;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.multipleapp.org.R;

public class MultiplicationActivity extends Activity implements android.view.View.OnClickListener {


	EditText uname;
	TextView result;
	Button buttonShow,buttonReset;
	
	String no;
	int num=0;
	int n;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.multiplication);
	
	
		uname = (EditText)findViewById(R.id.inputMul);
		//result = (TextView)findViewById(R.id.result);
		buttonShow = (Button)findViewById(R.id.buttonShow);
		buttonReset = (Button)findViewById(R.id.buttonRES);
		
		result.setText("");
		
		
		buttonShow.setOnClickListener(this);
		buttonReset.setOnClickListener(this);
	
	
	}



	@Override
	public void onClick(View src) {
switch(src.getId()){
	case R.id.buttonShow:{
		
	no=uname.getText().toString();
	n=(int)(no.charAt(0));
	if(n>=48 && n<=57){
	
	num=Integer.parseInt(no);
	/*int l=no.length();
	for(int j=0;j<l;j++){
 
		num=num + (int)(no.charAt(j));
		if(l>=1)
			num=num*10;
	}*/

	
	this.setContentView(R.layout.main);
	result = (TextView) findViewById(R.id.resulter);
		int re;
		
		for (int i=1;i<=10;i++){
			
			re=0;
			re=num*i;	
			
		result.append("\n"+num+" x "+i+" = "+re);
			
		}
		
		}
	else
		result.setText("please enter some value");
	}
	
	break;
	
	case R.id.buttonRES:{
	uname.setText("");
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