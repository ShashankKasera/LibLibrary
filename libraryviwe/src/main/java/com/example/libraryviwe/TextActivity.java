package com.example.libraryviwe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

public class TextActivity extends LinearLayout {

    TextView textView;

    public TextActivity(Context context,  AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public void init(Context context) {

        inflate(context,R.layout.activity_text,this);
        textView = findViewById(R.id.textvid);
    }

    public void setTextView(String text){
        textView.setText(text);
    }


}
