package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

public class FindVolumeSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_volume_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" Volume");


        //*************************START OF ONE ****************


        findViewById(R.id.vsphere).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindVolumeSc.this,OneInputSc.class);
                i.putExtra("id",6);
                startActivity(i);
            }
        });


        findViewById(R.id.vcube).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(FindVolumeSc.this,OneInputSc.class);
                i.putExtra("id",7);
                startActivity(i);
            }
        });

        //*************************** END OF ONE **********************



        //**************************** START OF TWO **************************


        findViewById(R.id.vcone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindVolumeSc.this,TwoInputSc.class);
                i.putExtra("id",9);
                startActivity(i);
            }
        });



        findViewById(R.id.vcylinder).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindVolumeSc.this,TwoInputSc.class);
                i.putExtra("id",10);
                startActivity(i);
            }
        });

        //**************************** END OF TWO *******************************


        //************************ START OF THREE **********************************


        findViewById(R.id.vcuboid).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(FindVolumeSc.this,ThreeInputSc.class);
                i.putExtra("id",4);
                startActivity(i);
            }

        });

        //************************ END OF THREE *********************************


    }
}
