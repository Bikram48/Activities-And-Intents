package com.project.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.project.twoactivities.R;

public class SecondActivity extends AppCompatActivity {
    private TextView title;
    private TextView subTitle;
    private TextView paragraph;
    private EditText mReply;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        title=findViewById(R.id.articleTitle);
        subTitle=findViewById(R.id.subTitle);
        paragraph=findViewById(R.id.paragraph);
        setParagraphs();
    }

    private void setParagraphs() {
            Intent intent=getIntent();
            String btnText=intent.getStringExtra("btn_text");
            if(btnText!=null) {
                if (btnText.equals("paragraph1")) {
                    title.setText(getResources().getString(R.string.article_title_textone));
                    subTitle.setText(getResources().getString(R.string.article_subtitle_textone));
                    paragraph.setText(getResources().getString(R.string.article_text_textone));
                }
            }

        if(btnText!=null) {
            if (btnText.equals("paragraph2")) {
                title.setText(getResources().getString(R.string.article_title_texttwo));
                subTitle.setText(getResources().getString(R.string.article_subtitle_texttwo));
                paragraph.setText(getResources().getString(R.string.article_text_texttwo));
            }
        }

        if(btnText!=null) {
            if (btnText.equals("paragraph3")) {
                title.setText(getResources().getString(R.string.article_title_textthree));
                subTitle.setText(getResources().getString(R.string.article_subtitle_textthree));
                paragraph.setText(getResources().getString(R.string.article_text_textthree));
            }
        }

    }

    public static Intent setIntent(Context context,String value){
        Intent intent=new Intent(context,SecondActivity.class);
        intent.putExtra("btn_text",value);
        return intent;
    }


}