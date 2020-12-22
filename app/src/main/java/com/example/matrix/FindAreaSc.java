package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class FindAreaSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_area_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" Area");

       //************* START OF ONE ****************

        findViewById(R.id.asquare).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindAreaSc.this,OneInputSc.class);
                i.putExtra("id",1);
                startActivity(i);
            }
        });

        findViewById(R.id.acircle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindAreaSc.this,OneInputSc.class);
                i.putExtra("id",2);
                startActivity(i);
            }
        });

        findViewById(R.id.aequitri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindAreaSc.this,OneInputSc.class);
                i.putExtra("id",3);
                startActivity(i);
            }
        });


        findViewById(R.id.apentagon).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,OneInputSc.class);
                i.putExtra("id",11);
                startActivity(i);

            }
        });

        //************* END OF ONE ****************



        //************* START OF TWO ****************
        findViewById(R.id.atriangle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",1);
                startActivity(i);

            }
        });


        findViewById(R.id.arectangle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",2);
                startActivity(i);

            }
        });



        findViewById(R.id.aparallelogram).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",3);
                startActivity(i);

            }
        });



        findViewById(R.id.arightangtri).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",5);
                startActivity(i);

            }
        });

        findViewById(R.id.arhombus).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",6);
                startActivity(i);

            }
        });

        findViewById(R.id.aellipse).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindAreaSc.this,TwoInputSc.class);
                i.putExtra("id",7);
                startActivity(i);

            }
        });

        //****************** END OF TWO *******************************


        //******************* START OF THREE ****************************


        findViewById(R.id.atrapezium).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindAreaSc.this,ThreeInputSc.class);
                i.putExtra("id",1);
                startActivity(i);
            }

            //******************* END OF THREE ****************************
        });





    }
}
