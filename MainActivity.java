package com.example.amnahashim.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView View;
    TextView t1,t2,t3;
    Button b1,b2;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View=(ImageView) findViewById(R.id.imageView);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        b1=(Button) findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=counter+1;
                if  (counter==0)
                {
                    View.setImageResource(R.drawable.download);
                    t1.setText("Amna Hashim");
                    t2.setText("F16SW35");
                    t3.setText("amnahashim10@gmail.com");}
               if (counter==1)
                {
                    View.setImageResource(R.drawable.images);
                t1.setText("Anabia Saeed");
                t2.setText("F16SW29");
                t3.setText("anabiasaeed@gmail.com");
            }
                 else if(counter==2) {
                     View.setImageResource(R.drawable.image);
                     t1.setText("Umm-e-Hani Shaikh");
                     t2.setText("F16SW21");
                     t3.setText("Summehani79@gmail.com");

                }
              else  if(counter==3){
                    View.setImageResource(R.drawable.image1);
                    t1.setText("Touqeer Ranjhan");
                    t2.setText("F16SW25");
                    t3.setText("touqeerlangah@gmail.com");

                }
                 else if(counter==4){
                    View.setImageResource(R.drawable.images);
                    t1.setText("Ammarah Aftab");
                    t2.setText("F16SW19");
                    t3.setText("ammarrah.aftab@gmail.com");
                }


        }


    });




        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                if  (counter==0)
                { View.setImageResource(R.drawable.download);
                t1.setText("Amna Hashim");
                t2.setText("F16SW35");
                t3.setText("amnahashim10@gmail.com");}

               if (counter==1)
                {
                    View.setImageResource(R.drawable.images);
                    t1.setText("Anabia Saeed");
                    t2.setText("F16SW29");
                    t3.setText("anabiasaeed@gmail.com");
                }
               else if(counter==2) {
                    View.setImageResource(R.drawable.image);
                    t1.setText("Umm-e-Hani Shaikh");
                    t2.setText("F16SW21");
                    t3.setText("Summehani@gmail.com");

                }
                else if(counter==3){
                    View.setImageResource(R.drawable.image1);
                    t1.setText("Touqeer Ranjhan");
                    t2.setText("F16SW25");
                    t3.setText("touqeerlangah@gmail.com");

                }
              else  if(counter==4){
                    View.setImageResource(R.drawable.images);
                    t1.setText("Ammarah Aftab");
                    t2.setText("F16SW19");
                    t3.setText("ammarrah.aftab@gmail.com");
                }
                  counter=counter-1;

            }

});
    }}
