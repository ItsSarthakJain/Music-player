package com.example.android.musicalapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton i=(ImageButton)findViewById(R.id.now_icon);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),NowPlaying.class);
                startActivity(i);
            }
        });

        ImageButton i2=(ImageButton)findViewById(R.id.buy);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Payment.class);
                startActivity(i);
            }
        });
        ImageButton i3=(ImageButton)findViewById(R.id.search);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Search.class);
                startActivity(i);
            }
        });
        ImageButton i4=(ImageButton)findViewById(R.id.artist);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Artist.class);
                startActivity(i);
            }
        });
        ImageButton i5=(ImageButton)findViewById(R.id.librarylink);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Library.class);
                startActivity(i);
            }
        });
    }

}
