package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class APseriesSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_pseries_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" APseries");
        ((EditText)findViewById(R.id.fstnum)).setTextSize(18);
        ((EditText)findViewById(R.id.diffnum)).setTextSize(18);
        ((EditText)findViewById(R.id.totlnum)).setTextSize(18);
        ((EditText)findViewById(R.id.reqnum2)).setTextSize(18);


        ((EditText) findViewById(R.id.fstnum)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                ((EditText)findViewById(R.id.fstnum)).setTextSize(22);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (((EditText)findViewById(R.id.fstnum)).getText().toString().matches(""))
                    ((EditText)findViewById(R.id.fstnum)).setTextSize(18);
                ((EditText)findViewById(R.id.seriestxt)).setText("");
                ((EditText)findViewById(R.id.reqnum)).setText("");



            }
        });
        ((EditText)findViewById(R.id.seriestxt)).setKeyListener(null);
        ((EditText)findViewById(R.id.reqnum)).setKeyListener(null);




        ((EditText) findViewById(R.id.diffnum)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                ((EditText)findViewById(R.id.diffnum)).setTextSize(22);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (((EditText)findViewById(R.id.diffnum)).getText().toString().matches(""))
                    ((EditText)findViewById(R.id.diffnum)).setTextSize(18);
                ((EditText)findViewById(R.id.seriestxt)).setText("");
                ((EditText)findViewById(R.id.reqnum)).setText("");


            }
        });





        ((EditText) findViewById(R.id.totlnum)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                ((EditText)findViewById(R.id.totlnum)).setTextSize(22);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (((EditText)findViewById(R.id.totlnum)).getText().toString().matches(""))
                    ((EditText)findViewById(R.id.totlnum)).setTextSize(18);
                ((EditText)findViewById(R.id.seriestxt)).setText("");
                ((EditText)findViewById(R.id.reqnum)).setText("");


            }
        });




        ((EditText) findViewById(R.id.reqnum2)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                ((EditText)findViewById(R.id.reqnum2)).setTextSize(22);
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (((EditText)findViewById(R.id.reqnum2)).getText().toString().matches(""))
                    ((EditText)findViewById(R.id.reqnum2)).setTextSize(18);
                ((EditText)findViewById(R.id.seriestxt)).setText("");
                ((EditText)findViewById(R.id.reqnum)).setText("");


            }
        });


        findViewById(R.id.apreset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText) findViewById(R.id.fstnum)).setText("");
                ((EditText) findViewById(R.id.totlnum)).setText("");
                ((EditText) findViewById(R.id.diffnum)).setText("");
                ((EditText) findViewById(R.id.reqnum2)).setText("");
                ((EditText) findViewById(R.id.seriestxt)).setText("");
                ((EditText) findViewById(R.id.reqnum)).setText("");
            }
        });

        findViewById(R.id.enter).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chekEmpty()==0) {

                    int i, a, b, c, d;

                    a = Integer.parseInt(((EditText) findViewById(R.id.fstnum)).getText().toString());

                    b = Integer.parseInt(((EditText) findViewById(R.id.totlnum)).getText().toString());

                    c = Integer.parseInt(((EditText) findViewById(R.id.diffnum)).getText().toString());
                    if(c>0) {

                        if (!((EditText) findViewById(R.id.reqnum2)).getText().toString().matches(""))
                            d = Integer.parseInt(((EditText) findViewById(R.id.reqnum2)).getText().toString());
                        else
                            d = 0;

                        ((EditText) findViewById(R.id.seriestxt)).setText("");
                        for (i = a; i <= a + (b - 1) * c; i = i + c) {
                            if (i != a + (b - 1) * c)
                                ((EditText) findViewById(R.id.seriestxt)).setText(((EditText) findViewById(R.id.seriestxt)).getText().toString() + Integer.toString(i) + " , ");
                            else
                                ((EditText) findViewById(R.id.seriestxt)).setText(((EditText) findViewById(R.id.seriestxt)).getText().toString() + Integer.toString(i) + "");
                        }
                        if (((EditText) findViewById(R.id.reqnum2)).getText().toString().matches(""))
                            ((EditText) findViewById(R.id.reqnum)).setText("");
                        else

                            ((EditText) findViewById(R.id.reqnum)).setText(Integer.toString(a + (d - 1) * c));
                    }else alert(2);
                    }
                else
                    alert(1);
            }
        });



    }


    public int chekEmpty(){
        if (((EditText)findViewById(R.id.fstnum)).getText().toString().matches("")||((EditText)findViewById(R.id.diffnum)).getText().toString().matches("")||((EditText)findViewById(R.id.totlnum)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }

    public void alert(int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(APseriesSc.this).create();
        alertDialog.setTitle("Alert");
        if(n==1)
        alertDialog.setMessage("Enter the Required Input");
        else alertDialog.setMessage("Difference must be greater than 0");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }

}
