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

public class FourInputSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four_input_sc);

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        ((EditText)findViewById(R.id.fourtf1)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.fourres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.fourtf2)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.fourres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.fourtf3)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.fourres)).setText("");
            }
        });


        ((EditText)findViewById(R.id.fourtf4)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.fourres)).setText("");
            }
        });




        findViewById(R.id.fourans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekEmpty()==0)
                {
                    ((TextView)findViewById(R.id.fourres)).setText(Integer.toString(Integer.parseInt(((EditText)findViewById(R.id.fourtf1)).getText().toString())+Integer.parseInt(((EditText)findViewById(R.id.fourtf2)).getText().toString())+Integer.parseInt(((EditText)findViewById(R.id.fourtf3)).getText().toString())+Integer.parseInt(((EditText)findViewById(R.id.fourtf4)).getText().toString())));
                }else alert();
            }

        });
    }


    public int chekEmpty(){
        if (((TextView)findViewById(R.id.fourtf1)).getText().toString().matches("")||((TextView)findViewById(R.id.fourtf2)).getText().toString().matches("")||((TextView)findViewById(R.id.fourtf3)).getText().toString().matches("")||((TextView)findViewById(R.id.fourtf4)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }

    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(FourInputSc.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(" Enter the Required Input");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }
}
