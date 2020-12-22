package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class WelomeSc extends AppCompatActivity {

    private FirebaseDatabase mdb;
    private DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welome_sc);
        String nam=getIntent().getExtras().getString("name");
        String sn[]=nam.split(" ");
        ((TextView)findViewById(R.id.welt)).setText("Hello "+sn[0]);
        mdb=FirebaseDatabase.getInstance();
        dbref=mdb.getReference("Name");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        if (isConnected())
        {
            dbref.child(getIntent().getExtras().getString("nameid")).setValue("Done");
        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(WelomeSc.this,Dashboard.class));
                finish();
            }
        },2500);
    }

    public boolean isConnected()
    {
        ConnectivityManager c=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo n = c.getActiveNetworkInfo();
        return n!=null && n.isConnected();
    }

}
