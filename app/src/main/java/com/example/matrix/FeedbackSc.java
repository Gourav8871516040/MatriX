package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FeedbackSc extends AppCompatActivity {

    private FirebaseDatabase mdb;
    private DatabaseReference dbref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_sc);
        mdb=FirebaseDatabase.getInstance();
        dbref=mdb.getReference("Comments");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        findViewById(R.id.send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!((EditText)findViewById(R.id.fedbt)).getText().toString().matches("")) {
                    if (isConnected()) {
                        String data = ((EditText) findViewById(R.id.fedbt)).getText().toString();
                        DataBaseHelper db =new DataBaseHelper(FeedbackSc.this);
                        Cursor cr=db.getName();
                        String nam="Unknown";
                        while(cr.moveToNext())
                            nam=cr.getString(1);

                        dbref.child(nam + Integer.toString(new GetRandomNum().getRanNum()) + Integer.toString(new GetRandomNum().getRanNum())).setValue(data);
                        Toast.makeText(FeedbackSc.this, "Feedback Sent", Toast.LENGTH_LONG).show();
                        ((EditText) findViewById(R.id.fedbt)).setText("");
                    } else
                        alert(1);
                }else alert(0);

            }
        });
    }
    public void alert(int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(FeedbackSc.this).create();
        alertDialog.setTitle("Alert");
        if (n==1)
            alertDialog.setMessage("Check Your Internet Connection !!");
        else
            alertDialog.setMessage("Feedback is Empty");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }
    public boolean isConnected()
    {
        ConnectivityManager c=(ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo n = c.getActiveNetworkInfo();
        return n!=null && n.isConnected();
    }
}
