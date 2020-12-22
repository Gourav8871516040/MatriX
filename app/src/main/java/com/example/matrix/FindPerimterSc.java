package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class FindPerimterSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_find_perimter_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" Perimeter");

        findViewById(R.id.psquare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,OneInputSc.class);
                i.putExtra("id",8);
                startActivity(i);
            }
        });

        findViewById(R.id.prhombus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,OneInputSc.class);
                i.putExtra("id",9);
                startActivity(i);
            }
        });



        findViewById(R.id.pcircle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,OneInputSc.class);
                i.putExtra("id",10);
                startActivity(i);
            }
        });



        //**************************** START OF TWO **************************


        findViewById(R.id.prectangle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,TwoInputSc.class);
                i.putExtra("id",11);
                startActivity(i);
            }
        });



        findViewById(R.id.pparallelogram).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,TwoInputSc.class);
                i.putExtra("id",12);
                startActivity(i);
            }
        });

        //**************************** END OF TWO *******************************



        //*************************  START OF THREE ****************************

        findViewById(R.id.ptriangle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,ThreeInputSc.class);
                i.putExtra("id",5);
                startActivity(i);
            }
        });

        //*********************** END OF THREE *******************************


        findViewById(R.id.ptrapezium).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindPerimterSc.this,FourInputSc.class);
                startActivity(i);
            }
        });
    }
}
