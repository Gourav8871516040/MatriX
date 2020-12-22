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

public class TwoInputSc extends AppCompatActivity {

    public int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_input_sc);


        Bundle b = getIntent().getExtras();
         id=b.getInt("id");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        ((EditText)findViewById(R.id.twotf1)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
             }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.twores)).setText("");
            }
        });

        ((EditText)findViewById(R.id.twotf2)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.twores)).setText("");
            }
        });

        if(id==1)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.atriangle);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Triangle");
            ((TextView)findViewById(R.id.twot1)).setText("Height");
            ((TextView)findViewById(R.id.twot2)).setText("Base");
        }else if(id==2)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.arectangle);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Rectangle");
            ((TextView)findViewById(R.id.twot1)).setText("Width");
            ((TextView)findViewById(R.id.twot2)).setText("Length");
        }else if(id==3)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.aparallelogram);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Parallelogram");
            ((TextView)findViewById(R.id.twot1)).setText("Base :");
            ((TextView)findViewById(R.id.twot2)).setText("Height :");
        }else if(id==5)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.arightangtri);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Right Angle Triangle");
            ((TextView)findViewById(R.id.twot1)).setText("Base :");
            ((TextView)findViewById(R.id.twot2)).setText("Height :");
        }else if(id==6)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.arhombus);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Rhombus");
            ((TextView)findViewById(R.id.twot1)).setText("Diagonal 1:");
            ((TextView)findViewById(R.id.twot2)).setText("Diagonal 2:");
        }else if(id==7)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.aellipse);
            ((TextView)findViewById(R.id.twohead)).setText("Area of Ellipse");
            ((TextView)findViewById(R.id.twot1)).setText("a Axis:");
            ((TextView)findViewById(R.id.twot2)).setText("b Axis :");
        }else if(id==8)
        {
            getSupportActionBar().setTitle(" Surface Area");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.sacylinder);
            ((TextView)findViewById(R.id.twohead)).setText("Surface Area of Cylinder");
            ((TextView)findViewById(R.id.twot1)).setText("Radius :");
            ((TextView)findViewById(R.id.twot2)).setText("Height :");
        }else if(id==9)
        {
            getSupportActionBar().setTitle(" Volume");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.vcone);
            ((TextView)findViewById(R.id.twohead)).setText("Volume of Cone");
            ((TextView)findViewById(R.id.twot1)).setText("Radius :");
            ((TextView)findViewById(R.id.twot2)).setText("Height :");
        }else if(id==10)
        {
            getSupportActionBar().setTitle(" Volume");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.sacylinder);
            ((TextView)findViewById(R.id.twohead)).setText("Volume of Cylinder");
            ((TextView)findViewById(R.id.twot1)).setText("Radius :");
            ((TextView)findViewById(R.id.twot2)).setText("Height :");
        }else if(id==11)
        {
            getSupportActionBar().setTitle(" Perimeter");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.arectangle);
            ((TextView)findViewById(R.id.twohead)).setText("Perimeter of Rectangle");
            ((TextView)findViewById(R.id.twot1)).setText("Lenght :");
            ((TextView)findViewById(R.id.twot2)).setText("Width :");
        }else if(id==12)
        {
            getSupportActionBar().setTitle(" Perimeter");
            ((ImageView)findViewById(R.id.twoimg)).setImageResource(R.drawable.aparallelogram);
            ((TextView)findViewById(R.id.twohead)).setText("Perimeter of Parallelogram");
            ((TextView)findViewById(R.id.twot1)).setText("Base :");
            ((TextView)findViewById(R.id.twot2)).setText("Side :");
        }

        findViewById(R.id.twoans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chekEmpty()==0) {
                    if (id == 1)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aTriangle(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 2)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aRectangle(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 3)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aParallelogram(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 5)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aRightanglTriangle(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 6)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aRhombus(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 7)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().aEllipse(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 8)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().saCylinder(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 9)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().vCone(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 10)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().vCylinder(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 11)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().pRectangle(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                    else if (id == 12)
                        ((TextView) findViewById(R.id.twores)).setText(Double.toString(new Geometry().pParallelogram(Double.parseDouble(((EditText) findViewById(R.id.twotf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.twotf2)).getText().toString()))));
                }else
                    alert();
            }
        });
    }


    public int chekEmpty(){
        if (((TextView)findViewById(R.id.twotf1)).getText().toString().matches("")||((TextView)findViewById(R.id.twotf2)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }

    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(TwoInputSc.this).create();
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
