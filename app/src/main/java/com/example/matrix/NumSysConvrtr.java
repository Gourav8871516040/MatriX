package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NumSysConvrtr extends AppCompatActivity {

    public int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_num_sys_convrtr);
        Bundle b=getIntent().getExtras();
        id=b.getInt("id");
        ((EditText)findViewById(R.id.conrestxt)).setKeyListener(null);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        ((EditText) findViewById(R.id.conqtext)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {
                ((EditText) findViewById(R.id.conrestxt)).setText("");
            }
        });


        if(id==1)
        {

            ((TextView)findViewById(R.id.conhead)).setText("Decimal Conversion");
            ((TextView)findViewById(R.id.conqhead)).setText("Decimal Number :");
            ((EditText)findViewById(R.id.conqtext)).setHint("Enter Number in decimal");
            ((Button)findViewById(R.id.conbt1)).setText("Binary");
            ((Button)findViewById(R.id.conbt2)).setText("Octal");
            ((Button)findViewById(R.id.conbt3)).setText("Hexadecimal");


        }else if (id==2)
        {
            ((TextView)findViewById(R.id.conhead)).setText("Binary Conversion");
            ((TextView)findViewById(R.id.conqhead)).setText("Binary Number :");
            ((EditText)findViewById(R.id.conqtext)).setHint("Enter binary number");
            ((Button)findViewById(R.id.conbt1)).setText("Decimal");
            ((Button)findViewById(R.id.conbt2)).setText("Octal");
            ((Button)findViewById(R.id.conbt3)).setText("Hexadecimal");

        }else if (id==3)
        {
            ((EditText)findViewById(R.id.conqtext)).setInputType(InputType.TYPE_CLASS_TEXT);
            ((EditText)findViewById(R.id.conrestxt)).setInputType(InputType.TYPE_CLASS_NUMBER);
            ((EditText)findViewById(R.id.conrestxt)).setKeyListener(null);
            ((TextView)findViewById(R.id.conhead)).setText("Hexadec. Conversion");
            ((TextView)findViewById(R.id.conqhead)).setText("Hexadecimal Number :");
            ((EditText)findViewById(R.id.conqtext)).setHint("Enter Number in hexadec.");
            ((Button)findViewById(R.id.conbt1)).setText("Binary");
            ((Button)findViewById(R.id.conbt2)).setText("Decimal");
            ((Button)findViewById(R.id.conbt3)).setText("Octal");

        }else if (id==4)
        {
            ((TextView)findViewById(R.id.conhead)).setText("Octal Conversion");
            ((TextView)findViewById(R.id.conqhead)).setText("Octal Number :");
            ((EditText)findViewById(R.id.conqtext)).setHint("Enter Octal number");
            ((Button)findViewById(R.id.conbt1)).setText("Binary");
            ((Button)findViewById(R.id.conbt2)).setText("Decimal");
            ((Button)findViewById(R.id.conbt3)).setText("Hexadecimal");
        }

        //********************************* BUTTON 1 *****************************


        findViewById(R.id.conbt1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id==1)
                {
                    if(chekEmpty()==0){
                        // DEC TO BIN
                        if(((EditText)findViewById(R.id.conqtext)).getText().toString().length()<20)
                        ((EditText)findViewById(R.id.conrestxt)).setText(new NumberSystem().decToBin(((EditText)findViewById(R.id.conqtext)).getText().toString()));
                        else
                            alert(1);
                    }else alert(0);
                }else if (id==2)
                {
                    if(chekEmpty()==0){

                        // BIN TO DEC
                        if(((EditText)findViewById(R.id.conqtext)).getText().toString().length()<64) {
                            if(checkBinaryInput(((EditText)findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(Long.toString(new NumberSystem().binToDec(((EditText) findViewById(R.id.conqtext)).getText().toString())));
                            else alert(6);
                        }else alert(2);
                    }else alert(0);

                }else if (id==3)
                {
                    if(chekEmpty()==0){

                        // HEX TO BIN
                        if(((EditText)findViewById(R.id.conqtext)).getText().toString().length()<17) {
                            if(checkHexaInput(((EditText)findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().hexToBin(((EditText) findViewById(R.id.conqtext)).getText().toString()));
                            else alert(7);
                        }
                        else alert(4);
                        }else alert(0);
                }else if (id==4)
                {
                    if(chekEmpty()==0) {

                        // OCT TO BIN
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length() <22){
                            if(checkOctalInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().octToBin(((EditText) findViewById(R.id.conqtext)).getText().toString()));
                            else alert(5);
                        }else alert(3);
                    }else alert(0);
                }
            }
        });



        //********************************* BUTTON 2 *****************************


        findViewById(R.id.conbt2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id==1)
                {
                    if(chekEmpty()==0){
                        // DEC TO OCT
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<20)
                        ((EditText)findViewById(R.id.conrestxt)).setText(new NumberSystem().decToOct(((EditText)findViewById(R.id.conqtext)).getText().toString()));
                        else alert(1);
                    }else alert(0);
                }else if (id==2)
                {
                    if(chekEmpty()==0){

                        // BIN TO OCT
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<64) {
                            if (checkBinaryInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                                ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().binToOctal(((EditText) findViewById(R.id.conqtext)).getText().toString()));
                            else alert(6);
                        }else alert(2);
                        }else alert(0);

                }else if (id==3)
                {
                    if(chekEmpty()==0){

                        // HEX TO DEC
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<17) {
                            if (checkHexaInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(Long.toString(new NumberSystem().hexToDec(((EditText) findViewById(R.id.conqtext)).getText().toString())));
                            else alert(7);
                        }else alert(4);
                        }else alert(0);
                }else if (id==4)
                {
                    if(chekEmpty()==0){

                        // OCT TO DEC
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<22) {
                          if (checkOctalInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(Long.toString(new NumberSystem().octToDec(((EditText) findViewById(R.id.conqtext)).getText().toString())));
                          else alert(5);
                        }else alert(3);
                        }else alert(0);

                }
            }
        });




        //********************************* BUTTON 3 *****************************


        findViewById(R.id.conbt3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (id==1)
                {
                    if(chekEmpty()==0){
                        // DEC TO HEXA
                        ((EditText)findViewById(R.id.conrestxt)).setInputType(InputType.TYPE_CLASS_TEXT);
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<20)
                        ((EditText)findViewById(R.id.conrestxt)).setText(new NumberSystem().decToHex(((EditText)findViewById(R.id.conqtext)).getText().toString()).toUpperCase());
                    else alert(1);
                    }else alert(0);
                }else if (id==2)
                {
                    if(chekEmpty()==0){

                        // BIN TO HEXA
                        ((EditText)findViewById(R.id.conrestxt)).setInputType(InputType.TYPE_CLASS_TEXT);
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<64) {
                            if (checkBinaryInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().binToHexa(((EditText) findViewById(R.id.conqtext)).getText().toString()).toUpperCase());
                            else alert(6);
                        }else alert(2);
                        }else alert(0);

                }else if (id==3)
                {
                    if(chekEmpty()==0){

                        // HEX TO OCT
                        if(((EditText) findViewById(R.id.conqtext)).getText().toString().length()<17) {
                         if (checkHexaInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().hexToOct(((EditText) findViewById(R.id.conqtext)).getText().toString()));
                         else alert(7);
                        }else alert(4);
                        }else alert(0);

                }else if (id==4)
                {
                    if(chekEmpty()==0){

                        // OCT TO HEXA
                        ((EditText)findViewById(R.id.conrestxt)).setInputType(InputType.TYPE_CLASS_TEXT);
                        if (((EditText) findViewById(R.id.conqtext)).getText().toString().length()<22) {
                         if (checkOctalInput(((EditText) findViewById(R.id.conqtext)).getText().toString())==0)
                            ((EditText) findViewById(R.id.conrestxt)).setText(new NumberSystem().octToHexa(((EditText) findViewById(R.id.conqtext)).getText().toString()).toUpperCase());
                         else alert(5);
                        }else alert(3);
                        }else alert(0);
                }
            }
        });


    }

    public int chekEmpty()
    {
        if(((EditText)findViewById(R.id.conqtext)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }
    public int checkBinaryInput(String s)
    {
        int flag=0;
        char st[]=s.toCharArray();
        for (int i=0;i<st.length;i++)
        {
            if (Integer.parseInt(String.valueOf(st[i]))>1||Integer.parseInt(String.valueOf(st[i]))<0) {
        return 1;
            }
        }

        return 0;
    }


    public int checkOctalInput(String s)
    {
        char st[]=s.toCharArray();
        for (int i=0;i<st.length;i++)
        {
            if (Integer.parseInt(String.valueOf(st[i]))>7||Integer.parseInt(String.valueOf(st[i]))<0) {
            return 1;
            }
        }
        return 0;
    }

    public  int checkHexaInput(String s)
    {
        String stnum=s.toUpperCase();
        String Str= stnum.replaceAll("[^A-Z]", "");
        char st[]=Str.toCharArray();
        for(int i=0;i<st.length;i++)
            if(st[i]>'F') {
            return 1;
            }

        return 0;
    }

    public void alert(int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(NumSysConvrtr.this).create();
        alertDialog.setTitle("Alert");
        if(n==0)
            alertDialog.setMessage("Required Input is Empty");
        else if(n==1)// decimal limit
            alertDialog.setMessage("Maximum Input Limit is 19");
        else if(n==2)// binary limit
            alertDialog.setMessage("Maximum Input Limit is 63");
        else if(n==3)// octal limit
            alertDialog.setMessage("Maximum Input Limit is 21");
        else if(n==4)// hexadecimal limit
            alertDialog.setMessage("Maximum Input Limit is 16");
        else if(n==5)// octal number range
            alertDialog.setMessage("Enter digit Between 1-7");
        else if(n==6)// binary number range
            alertDialog.setMessage("Input digit is Either 1 or 0");
        else if(n==7)// hexa number range
            alertDialog.setMessage("Hexadec. Range is Between 1 to 9 or A to F");

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
            alertDialog.show();
    }

}
