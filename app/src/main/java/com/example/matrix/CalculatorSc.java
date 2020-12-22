package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CalculatorSc extends AppCompatActivity {

    public String que="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_sc);
        Calculator c=new Calculator();

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        //getSupportActionBar().setTitle(Html.fromHtml("<font color='#000000'>"+"Matrix"+"</font>"));
        getSupportActionBar().setTitle("Calculator");

        (findViewById(R.id.one)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"1");
                que+="e";

            }
        });


        (findViewById(R.id.two)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"2");
                que+="f";


            }
        });


        (findViewById(R.id.three)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"3");
                que+="g";
            }
        });


        (findViewById(R.id.four)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"4");
                que+="i";
            }
        });


        (findViewById(R.id.five)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"5");
                que+="j";
            }
        });


        (findViewById(R.id.six)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"6");
                que+="k";
            }
        });


        (findViewById(R.id.seven)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"7");
                que+="m";
            }
        });


        (findViewById(R.id.eight)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"8");
                que+="n";
            }
        });


        (findViewById(R.id.nine)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"9");
                que+="o";
            }
        });


        (findViewById(R.id.zero)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"0");
                que+="b";
            }
        });


        (findViewById(R.id.sqr)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"sqr");
                que+="q";
            }
        });


        (findViewById(R.id.onex)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                que+="r";
            }
        });


        (findViewById(R.id.clr)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ((TextView)findViewById(R.id.calque)).setText("");
                ((TextView)findViewById(R.id.calans)).setText("");
                que="";
            }
        });


        (findViewById(R.id.divide)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+" / ");
                que+="t";
            }
        });


        (findViewById(R.id.multi)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+" x ");
                que+="p";
            }
        });


        (findViewById(R.id.sub)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+" - ");
                que+="l";
            }
        });


        (findViewById(R.id.add)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+" + ");
                que+="h";
            }
        });


        (findViewById(R.id.root)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+"sqrt");
                que+="a";
            }
        });


        (findViewById(R.id.point)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView)findViewById(R.id.calque)).setText(((TextView)findViewById(R.id.calque)).getText()+".");
                que+="c";
            }
        });


        (findViewById(R.id.equal)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!((TextView)findViewById(R.id.calque)).getText().toString().matches("")) {
                    que += "d";
                    char chek[] = que.toCharArray();
                    if (chek[1] == 'd' || chek.length == 1) {
                        ((TextView) findViewById(R.id.calque)).setText("");
                        ((TextView) findViewById(R.id.calans)).setText("");

                    } else if (chek[0] == 't' || chek[0] == 'p' || chek[0] == 'l' || chek[0] == 'h' || chek[0] == 'c' || chek[0] == 'r' || chek[0] == 'q' || chek[0] == 'a' || chek[chek.length - 2] == 't' || chek[chek.length - 2] == 'p' || chek[chek.length - 2] == 'l' || chek[chek.length - 2] == 'h' || chek[chek.length - 2] == 'c') {
                        alert(0);
                    } else {
                        double n = new Calculator().calci(que);
                        if (n!=-1)
                        ((TextView) findViewById(R.id.calans)).setText(Double.toString(n));
                        else
                            alert(1);
                    }
                    }else
                {

                }
            }
        });



    }

    public void alert(int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(CalculatorSc.this).create();
        alertDialog.setTitle("Alert");
        if (n==0)
        alertDialog.setMessage("Invalid Input..!!!");
        else alertDialog.setMessage("Input must be in the form of a+b");

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        ((TextView)findViewById(R.id.calque)).setText("");
                        ((TextView)findViewById(R.id.calans)).setText("");
                    }
                });
        alertDialog.show();
    }
}
