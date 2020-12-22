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
import android.widget.ImageView;
import android.widget.TextView;

public class OneInputSc extends AppCompatActivity {

    public int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_input_sc);
        Bundle b=getIntent().getExtras();
         id =b.getInt("id");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        ((EditText)findViewById(R.id.onetf)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

}

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.oneres)).setText("");


            }
        });

        if(id==1)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.squareimg);
            ((TextView)findViewById(R.id.onehead)).setText("Area of Square");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");

        }else if(id==2)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.azcircle);
            ((TextView)findViewById(R.id.onehead)).setText("Area of Circle");
            ((TextView)findViewById(R.id.onet1)).setText("Radius :");
        }else if(id==3)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.aequitriangle);
            ((TextView)findViewById(R.id.onehead)).setText("Area of Equilateral Triangle");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }else if(id==4)
        {
            getSupportActionBar().setTitle(" Surface Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.sasphere);
            ((TextView)findViewById(R.id.onehead)).setText("Surface Area of Sphere");
            ((TextView)findViewById(R.id.onet1)).setText("Radius :");
        }else if(id==5)
        {
            getSupportActionBar().setTitle(" Surface Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.sacube);
            ((TextView)findViewById(R.id.onehead)).setText("Surface Area of Cube");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }else if(id==6)
        {
            getSupportActionBar().setTitle(" Volume");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.sasphere);
            ((TextView)findViewById(R.id.onehead)).setText("Volume of Sphere");
            ((TextView)findViewById(R.id.onet1)).setText("Radius :");
        }else if(id==7)
        {
            getSupportActionBar().setTitle(" Volume");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.sacube);
            ((TextView)findViewById(R.id.onehead)).setText("Volume of Cube");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }else if(id==8)
        {
            getSupportActionBar().setTitle(" Perimeter");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.squareimg);
            ((TextView)findViewById(R.id.onehead)).setText("Perimeter of Square");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }else if(id==9)
        {
            getSupportActionBar().setTitle(" Perimeter");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.arhombus);
            ((TextView)findViewById(R.id.onehead)).setText("Perimeter of Rhombus");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }else if(id==10)
        {
            getSupportActionBar().setTitle("Perimeter");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.azcircle);
            ((TextView)findViewById(R.id.onehead)).setText("Perimeter of Circle");
            ((TextView)findViewById(R.id.onet1)).setText("Radius :");
        }else if(id==11)
        {
            getSupportActionBar().setTitle("Area");
            ((ImageView)findViewById(R.id.oneimg)).setImageResource(R.drawable.apentagon);
            ((TextView)findViewById(R.id.onehead)).setText("Area of Pentagon");
            ((TextView)findViewById(R.id.onet1)).setText("Side :");
        }


        findViewById(R.id.oneans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        findViewById(R.id.oneans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekEmpty()==0) {
                    if (id == 1)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().aSquare(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 2)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().aCircle(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 3)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().aEquiTriangle(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 4)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().saSphere(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 5)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().saCube(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 6)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().vSphere(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 7)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().vCube(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 8)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().pSquare(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 9)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().pRhombus(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 10)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().pCircle(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                    else if (id == 11)
                        ((TextView) findViewById(R.id.oneres)).setText(Double.toString(new Geometry().aPentagon(Double.parseDouble(((EditText) findViewById(R.id.onetf)).getText().toString()))));
                }
                else
                    alert();
            }
        });



    }
    public int chekEmpty(){
        if (((TextView)findViewById(R.id.onetf)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }

    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(OneInputSc.this).create();
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
