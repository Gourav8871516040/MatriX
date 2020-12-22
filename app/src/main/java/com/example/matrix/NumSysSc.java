package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class NumSysSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_sys_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        findViewById(R.id.decto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NumSysSc.this,NumSysConvrtr.class);
                i.putExtra("id",1);
                startActivity(i);
            }
        });


        findViewById(R.id.binto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NumSysSc.this,NumSysConvrtr.class);
                i.putExtra("id",2);
                startActivity(i);
            }
        });


        findViewById(R.id.hexto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NumSysSc.this,NumSysConvrtr.class);
                i.putExtra("id",3);
                startActivity(i);
            }
        });


        findViewById(R.id.octto).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(NumSysSc.this,NumSysConvrtr.class);
                i.putExtra("id",4);
                startActivity(i);
            }
        });

    }
}
