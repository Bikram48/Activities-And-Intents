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
        Intent intent=new Intent(MainActivity.this,SecondActivity.class);
        switch (v.getId()){
            case R.id.textOneBtn:
                intent.putExtra("text_one","paragraph1");
                startActivity(intent);
                break;
            case R.id.textTwoBtn:
                intent.putExtra("text_two","paragraph2");
                startActivity(intent);
                break;
            case R.id.textThreeBtn:
                intent.putExtra("text_three","paragraph3");
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}