package com.example.helloworld;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener; 

public class MainActivity extends Activity {

	private Button myButton=null;
	private EditText userName;
	private EditText passWord;
	private TextView text1;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton=(Button)findViewById(R.id.myButton);
        userName=(EditText)findViewById(R.id.editText1);
        passWord=(EditText)findViewById(R.id.editText2);
        text1=(TextView)findViewById(R.id.textView1);
        myButton.setOnClickListener(new MyButtonListener());
   }
    
   @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
	    menu.add(0, 1, 1, R.string.exit);
	    menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}
   @Override
   public boolean onOptionsItemSelected(MenuItem item) {
   	// TODO Auto-generated method stub
	   if(item.getItemId()==1)
	   {
		   finish();
	   }
   	return super.onOptionsItemSelected(item);
   }


public class MyButtonListener implements OnClickListener{
    	
	   @Override
	    public void onClick(View v){
		   String username=userName.getText().toString();
		   String password=passWord.getText().toString();
		   if(username.equals("admin")&&password.equals("111111"))
		   {
	    		Intent intent=new Intent();
	    		intent.putExtra("UserName", username);
	    		intent.setClass(MainActivity.this, SecondActivity.class);
	    		MainActivity.this.startActivity(intent);
		   }
		   else
		   {
			   text1.setText("用户名或密码错误！");
		   }

    	}
    }
}
