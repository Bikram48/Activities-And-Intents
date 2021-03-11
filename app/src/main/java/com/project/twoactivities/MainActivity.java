package com.project.twoactivities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button textOneBtn;
    private Button textTwoBtn;
    private Button textThreeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textOneBtn=findViewById(R.id.textOneBtn);
        textOneBtn.setOnClickListener(this::onClick);
        textTwoBtn=findViewById(R.id.textTwoBtn);
        textTwoBtn.setOnClickListener(this::onClick);
        textThreeBtn=findViewById(R.id.textThreeBtn);
        textThreeBtn.setOnClickListener(this::onClick);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.textOneBtn:
                Intent intent=SecondActivity.setIntent(MainActivity.this,"paragraph1");
                startActivity(intent);
                break;
            case R.id.textTwoBtn:
                Intent intent1=SecondActivity.setIntent(MainActivity.this,"paragraph2");
                startActivity(intent1);
                break;
            case R.id.textThreeBtn:
                Intent intent2=SecondActivity.setIntent(MainActivity.this,"paragraph3");
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
}