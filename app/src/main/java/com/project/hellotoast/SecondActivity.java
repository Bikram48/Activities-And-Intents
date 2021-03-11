package com.project.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView mCount;
    public static final String COUNT="com.project.hellotoast.count";
    private int counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mCount=(TextView)findViewById(R.id.mCount);
        counter=getIntent().getIntExtra(COUNT,0);
        mCount.setText(String.valueOf(counter));
    }

    public static Intent makeIntent(Context context,int count){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra(COUNT,count);
        return intent;
    }
}