package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class SurfaceAreaSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surface_area_sc);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" Surface Area");
        //******************* START OF ONE *********************

        findViewById(R.id.sasphere).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SurfaceAreaSc.this,OneInputSc.class);
                i.putExtra("id",4);
                startActivity(i);
            }
        });

        findViewById(R.id.sacube).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SurfaceAreaSc.this,OneInputSc.class);
                i.putExtra("id",5);
                startActivity(i);
            }
        });

        //********************* END OF ONE ************************









        //********************* START OF TWO ************************

        findViewById(R.id.sacylinder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SurfaceAreaSc.this,TwoInputSc.class);
                i.putExtra("id",8);
                startActivity(i);
            }
        });


        //**************************END OF TWO *****************************



        //****************** START OF THREE ******************************


        findViewById(R.id.sacuboid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SurfaceAreaSc.this,ThreeInputSc.class);
                i.putExtra("id",2);
                startActivity(i);
            }

            });


        findViewById(R.id.satriangprism).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SurfaceAreaSc.this,ThreeInputSc.class);
                i.putExtra("id",3);
                startActivity(i);
            }

        });

        //*************************** END OF THREE *******************************


    }
}
