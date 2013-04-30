package com.multipleapp.org;

import com.multipleapp.org.R;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity  extends Activity implements android.view.View.OnClickListener{
	
	
	Button SI, Multi, Quad, Pal, Sort;
	EditText p, t ,r;
	Button buttonFind, buttonReset;
	EditText input1, input2, input3, input4, input5;
	
	String uname1,uname2,uname3,uname4,uname5;
	int i,j;
	String temp;
	TextView textResult;
	TextView result; 
    
    
	@Override
	public void onCreate(Bundle savedInstanceState) {
		 super.onCreate(savedInstanceState);
		 this.setContentView(R.layout.coption);
		 
		 SI = (Button)findViewById(R.id.buttonSI);
		 Multi = (Button)findViewById(R.id.buttonMul);
		 Quad = (Button)findViewById(R.id.buttonQuad);
		 Pal = (Button)findViewById(R.id.buttonPal);
		 Sort = (Button)findViewById(R.id.buttonSort);
		 result = (TextView)findViewById(R.id.resulter);	 
		 SI.setOnClickListener(this);
		 Multi.setOnClickListener(this);
		 Quad.setOnClickListener(this);
		 Pal.setOnClickListener(this);
		 Sort.setOnClickListener(this);
		 
	}
	@Override
	public void onClick(View arg0) {
		switch(arg0.getId()){
		case R.id.buttonSI:{
		class SI  extends Activity implements android.view.View.OnClickListener{
			
			public void onCreate(Bundle savedInstanceState) {
				super.onCreate(savedInstanceState);
				this.setContentView(R.layout.si);
			
			p = (EditText)findViewById(R.id.inputP);
			 t = (EditText)findViewById(R.id.inputT);
			 r = (EditText)findViewById(R.id.inputR);
			 buttonFind = (Button)findViewById(R.id.buttonFind);
			 buttonReset = (Button)findViewById(R.id.buttonReset);
			 
			 buttonFind.setOnClickListener(this);
			 buttonReset.setOnClickListener(this);
			 
			
			
			}	
		public void onClick(View arg0) {
		switch(arg0.getId()){


		 case R.id.buttonFind:{
					
				double pi=0.0,tm=0.0,rt=0.0;
			
			     String si;
			
				 pi=Double.valueOf(p.getText().toString());
			     tm=Double.valueOf(t.getText().toString());
			     rt=Double.valueOf(r.getText().toString());
			     
			     double SI;
			     
			     			     
			     SI=(pi*tm*rt)/100;
			     
			    si=String.valueOf(SI);
			 
		this.setContentView(R.layout.main);
			    
			    result.setText(si);
		 	 }
			 		break;
		 case R.id.buttonReset:
			 {
			 p.setText("");
			 t.setText("");
			 r.setText("");
			 }
			 break;
			}
			}
		}
					
		}
		break;
		
		case R.id.buttonSort:{
			
			class Sort  extends Activity implements android.view.View.OnClickListener{
				public void onCreate(Bundle savedInstanceState) {
					 super.onCreate(savedInstanceState);
					 this.setContentView(R.layout.sort);
							
			
			
			
			 input1 = (EditText)findViewById(R.id.input1);
			 input2 = (EditText)findViewById(R.id.input2);
			 input3 = (EditText)findViewById(R.id.input3);
			 input4 = (EditText)findViewById(R.id.input4);
			 input5 = (EditText)findViewById(R.id.input5);
		
			 Button buttonSort = (Button)findViewById(R.id.buttonmake);
			 Button buttonReset = (Button)findViewById(R.id.buttonReset);	
			 		 

			 
			 buttonSort.setOnClickListener(this);
			 buttonReset.setOnClickListener(this);
				}
		
			 public void onClick(View arg0) {		
			switch(arg0.getId()){
			
			case R.id.buttonmake:{
				
			uname1 = input1.getText().toString();
			uname2 = input2.getText().toString();
			uname3 = input3.getText().toString();
			uname4 = input4.getText().toString();
			uname5 = input5.getText().toString();

			String a[] = new String [5];	
			
			
			a[0]=(uname1.toString());
			a[1]=(uname2.toString());
			a[2]=(uname3.toString());
			a[3]=(uname4.toString());
			a[4]=(uname5.toString());
			
			
			for(i=0;i<5;i++){
				for(j=0;j<4;j++){
					if(a[j].compareTo(a[j+1])>=1)
					{
						temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				
				}
			}
			
			
				this.setContentView(R.layout.main);


			for (i=0;i<5;i++)
				result.append("\n" + a[i]);
			}
			break;
			case R.id.buttonReset:{
				result.setText("");
			}
			
			}

			
		}
		}
			
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
