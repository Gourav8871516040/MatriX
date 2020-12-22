package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumTableSc extends AppCompatActivity {

    EditText nume,table;
    Button ok;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_table_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle(" Number Table");

        ok=findViewById(R.id.ok);
        nume=findViewById(R.id.num);
        table=(EditText) findViewById(R.id.tab);
        table.setKeyListener(null);

        ((EditText)findViewById(R.id.num)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                ((EditText)findViewById(R.id.tab)).setText("");

            }
        });



        findViewById(R.id.reset).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nume.setText("");
                table.setText("");
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!nume.getText().toString().matches("")) {
                    int n;
                    n = Integer.parseInt(String.valueOf(nume.getText()));
                    table.setText("");
                    for (int i = 1; i < 11; i++)
                        table.setText(table.getText() + Integer.toString(n) + " x " + Integer.toString(i) + " = " + Integer.toString(n * i) + "\n");
                }
                else
                    alert();
            }
        });

    }

    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(NumTableSc.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Required Input is Empty");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }
}
