package com.example.craft;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Aboutus extends AppCompatActivity {
     float v=0;
     TextView textView;
     TextView textView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        textView=findViewById(R.id.textart);
        textView1=findViewById(R.id.txtabout);

        textView.setTranslationX(10);
        textView.setAlpha(v);
        textView.animate().alpha(1).setDuration(1000).setStartDelay(400).start();

        textView1.setTranslationX(10);
        textView1.setAlpha(v);
        textView1.animate().alpha(1).setDuration(1000).setStartDelay(400).start();
    }
}