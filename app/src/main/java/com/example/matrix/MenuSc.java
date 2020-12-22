package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static com.example.matrix.R.layout.activity_menu_sc;

public class MenuSc extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_menu_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        findViewById(R.id.calci).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,CalculatorSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.findarea)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,FindAreaSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.surfacearea)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,SurfaceAreaSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.findvolume)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,FindVolumeSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.findperimeter)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,FindPerimterSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.checknumb)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,CheckNumberSc.class);
                startActivity(i);
            }
        });

        (findViewById(R.id.numtab)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,NumTableSc.class);
                startActivity(i);
            }
        });

        findViewById(R.id.apseries).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,APseriesSc.class);
                startActivity(i);
            }
        });

        findViewById(R.id.numsys).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,NumSysSc.class);
                startActivity(i);
            }
        });
        findViewById(R.id.matoprtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MenuSc.this,MatrixOprtnSc.class);
                startActivity(i);
            }
        });


    }
}
