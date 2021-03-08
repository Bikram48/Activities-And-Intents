ackage com.project.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.project.twoactivities.R;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY="com.project.android.twoactivities.extra.REPLY";
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
            String first=intent.getStringExtra("text_one");
            String second=intent.getStringExtra("text_two");
            String third=intent.getStringExtra("text_three");
            if(first!=null) {
                if (first.equals("paragraph1")) {
                    title.setText(getResources().getString(R.string.article_title_textone));
                    subTitle.setText(getResources().getString(R.string.article_subtitle_textone));
                    paragraph.setText(getResources().getString(R.string.article_text_textone));
                }
            }

        if(second!=null) {
            if (second.equals("paragraph2")) {
                title.setText(getResources().getString(R.string.article_title_texttwo));
                subTitle.setText(getResources().getString(R.string.article_subtitle_texttwo));
                paragraph.setText(getResources().getString(R.string.article_text_texttwo));
            }
        }

        if(third!=null) {
            if (third.equals("paragraph3")) {
                title.setText(getResources().getString(R.string.article_title_textthree));
                subTitle.setText(getResources().getString(R.string.article_subtitle_textthree));
                paragraph.setText(getResources().getString(R.string.article_text_textthree));
            }
        }

    }


}