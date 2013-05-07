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

public class MultiplyActivity extends Activity implements android.view.View.OnClickListener  {

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
        // Show the Up button in the action bar.
        setupActionBar();
        
        

    	
		uname = (EditText)findViewById(R.id.inputMul);
		//result = (TextView)findViewById(R.id.result);
		buttonShow = (Button)findViewById(R.id.buttonShow);
		buttonReset = (Button)findViewById(R.id.buttonRES);
		
		
		
		
		buttonShow.setOnClickListener(this);
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
