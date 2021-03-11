package com.project.hellotoast;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    private int mCount=0;
    private Button sayHelloBtn;
    private TextView mShowCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount=(TextView) findViewById(R.id.show_count);
        sayHelloBtn=findViewById(R.id.button_toast);
    }

    public void showToast(View view) {
        Intent intent=SecondActivity.makeIntent(MainActivity.this,mCount);
        startActivity(intent);
    }

    public void countUp(View view) {
        mCount++;
        if(mShowCount!=null)
            mShowCount.setText(Integer.toString(mCount));
    }
}
