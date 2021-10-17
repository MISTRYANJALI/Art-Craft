package com.example.craft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    TextView textView1;
    float v=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.btnstart);
        textView=findViewById(R.id.txtabout);
        textView1=findViewById(R.id.textart);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,Secondpage.class);
                startActivity(intent);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Aboutus.class);
                startActivity(intent);
            }
        });

        textView1.setTranslationX(10);
        textView1.setAlpha(v);
        textView1.animate().alpha(1).setDuration(1000).setStartDelay(400).start();

        button.setTranslationX(10);
        button.setAlpha(v);
        button.animate().alpha(1).setDuration(1000).setStartDelay(400).start();

        textView.setTranslationX(10);
        textView.setAlpha(v);
        textView.animate().alpha(1).setDuration(1000).setStartDelay(400).start();


    }

}