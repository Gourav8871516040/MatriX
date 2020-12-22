package com.example.matrix;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import static android.app.PendingIntent.getActivity;

public class CheckNumberSc extends AppCompatActivity {
    public int res;
    public int numchk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_number_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        getSupportActionBar().setTitle("Check Number");

        ((EditText)findViewById(R.id.num)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                    ((TextView)findViewById(R.id.result)).setText("");

            }
        });


        findViewById(R.id.primebt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(chekNum()==0) {
                    res=new CheckNumber().prime(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Prime Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Prime Number");
                    }
                }else {
                   alert();
                }

            }
        });


        findViewById(R.id.perfectbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().perfect(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Perfect Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Perfect Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.armstrongbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().armstrong(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Armstrong Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Armstrong Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.pallindrombt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().pallindrom(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Pallindrom Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Pallindrom Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.finonaccibt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(chekNum()==0) {
                    res=new CheckNumber().fibonacci(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Fibonacci Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Fibonacci Number");
                    }
                }else {
                    alert();
                }




            }
        });


        findViewById(R.id.evenoddbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().evenOrOdd(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Number is Even");
                    } else {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Number is Odd");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.happybt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().happy(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Happy Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Happy Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.twistedprimebt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().twistedPrime(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Twisted Prime Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Twisted Prime Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.abundantbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().abundant(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Abundant Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Abundant Number");
                    }
                }else {
                    alert();
                }


            }

        });


        findViewById(R.id.disariumbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().disarium(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Disarium Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Disarium Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.harshadbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().harshad(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Harshad Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Harshad Number");
                    }
                }else {
                    alert();
                }


            }
        });


        findViewById(R.id.defficientbt).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekNum()==0) {
                    res=new CheckNumber().deficient(Integer.parseInt(((EditText)findViewById(R.id.num)).getText().toString()));
                    if (res == 0) {
                        setResultTextColor(0);
                        ((TextView) findViewById(R.id.result)).setText("Deficient Number");
                    } else {
                        setResultTextColor(1);
                        ((TextView) findViewById(R.id.result)).setText("Not a Deficient Number");
                    }
                }else {
                    alert();
                }


            }
        });




    }
    public int chekNum(){
        if (((TextView)findViewById(R.id.num)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }
    public void setResultTextColor(int n){
        if(n==1)
        ((TextView)findViewById(R.id.result)).setTextColor(Color.RED);
        else
            ((TextView)findViewById(R.id.result)).setTextColor(Color.GREEN);
    }
    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(CheckNumberSc.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage("Enter any Number");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }


}
