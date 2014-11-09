package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

	private TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);
        textview=(TextView)findViewById(R.id.otherPage);
        Intent intent=getIntent();
        String userName=intent.getStringExtra("UserName")+"ÒÑµÇÂ¼£¡";
        textview.setText(userName);
        }
    }
