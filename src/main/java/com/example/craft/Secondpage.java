package com.example.craft;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;

public class Secondpage extends AppCompatActivity {
    GridLayout mainGridlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);

        mainGridlayout=(GridLayout)findViewById(R.id.mainGridlayout);
        setSingleEvent(mainGridlayout);
    }
    private void setSingleEvent(GridLayout mainGridlayout)
    {
        for(int i=0;i<mainGridlayout.getChildCount();i++)
        {
            CardView cardView=(CardView)mainGridlayout.getChildAt(i);
            final int finalI=i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(finalI==0)
                    {
                        Intent intent = new Intent(Secondpage.this,Bag.class);
                        startActivity(intent);
                    }
                    else if(finalI==1)
                    {
                        Intent intent = new Intent(Secondpage.this,lion.class);
                        startActivity(intent);
                    }
                    else if(finalI==2)
                    {
                        Intent intent = new Intent(Secondpage.this,Owl.class);
                        startActivity(intent);
                    }
                    else if(finalI==3)
                    {
                        Intent intent = new Intent(Secondpage.this,Butterfly.class);
                        startActivity(intent);
                    }
                    else if(finalI==4)
                    {
                        Intent intent = new Intent(Secondpage.this,Cat.class);
                        startActivity(intent);
                    }
                    else if(finalI==5)
                    {
                        Intent intent = new Intent(Secondpage.this,Dog.class);
                        startActivity(intent);
                    }
                    else if(finalI==6)
                    {
                        Intent intent = new Intent(Secondpage.this,Tedpole.class);
                        startActivity(intent);
                    }
                    else if(finalI==7)
                    {
                        Intent intent = new Intent(Secondpage.this,Watermelon.class);
                        startActivity(intent);
                    }
                    else if(finalI==8)
                    {
                        Intent intent = new Intent(Secondpage.this,chick.class);
                        startActivity(intent);
                    }
                    else if(finalI==9)
                    {
                        Intent intent = new Intent(Secondpage.this,Bear.class);
                        startActivity(intent);
                    }

                }
            });
        }
    }
}