package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class MatrixOprtnSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matrix_oprtn_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        findViewById(R.id.summat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,TwoMatInput.class);
                i.putExtra("id",1);
                startActivity(i);
            }
        });
        findViewById(R.id.submat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,TwoMatInput.class);
                i.putExtra("id",2);
                startActivity(i);
            }
        });
        findViewById(R.id.prodmat).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,TwoMatInput.class);
                i.putExtra("id",3);
                startActivity(i);
            }
        });

        findViewById(R.id.sumdiag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,OneMatInput.class);
                i.putExtra("id",1);
                startActivity(i);
            }
        });

        findViewById(R.id.prodiag).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,OneMatInput.class);
                i.putExtra("id",2);
                startActivity(i);
            }
        });

        findViewById(R.id.sumrowcol).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,OneMatInput.class);
                i.putExtra("id",3);
                startActivity(i);
            }
        });
        findViewById(R.id.prorowcol).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MatrixOprtnSc.this,OneMatInput.class);
                i.putExtra("id",4);
                startActivity(i);
            }
        });


    }
}
