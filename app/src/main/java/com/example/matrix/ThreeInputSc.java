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

public class ThreeInputSc extends AppCompatActivity {

    public int id;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three_input_sc);

        Bundle b = getIntent().getExtras();
         id = b.getInt("id");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));


        ((EditText)findViewById(R.id.threetf1)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.threeres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.threetf2)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.threeres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.threetf3)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }

            @Override
            public void afterTextChanged(Editable s) {

                ((TextView)findViewById(R.id.threeres)).setText("");
            }
        });


        if(id==1)
        {
            getSupportActionBar().setTitle(" Area");
            ((ImageView)findViewById(R.id.threeimg)).setImageResource(R.drawable.atrapezium);
            ((TextView)findViewById(R.id.threehead)).setText("Area of Trapezium");
            ((TextView)findViewById(R.id.threet1)).setText("Base 1 :");
            ((TextView)findViewById(R.id.threet2)).setText("Base 2 :");
            ((TextView)findViewById(R.id.threet3)).setText("Height :");

        }else if(id==2)
        {
            getSupportActionBar().setTitle(" Surface Area");
            ((ImageView)findViewById(R.id.threeimg)).setImageResource(R.drawable.acuboid);
            ((TextView)findViewById(R.id.threehead)).setText("Surface area of Cuboid");
            ((TextView)findViewById(R.id.threet1)).setText("Length :");
            ((TextView)findViewById(R.id.threet2)).setText("Width :");
            ((TextView)findViewById(R.id.threet3)).setText("Height :");

        }else if(id==3)
        {
            getSupportActionBar().setTitle(" Surface Area");
            ((ImageView)findViewById(R.id.threeimg)).setImageResource(R.drawable.satriangulrprism);
            ((TextView)findViewById(R.id.threehead)).setText("Surface Area of Triangular Prism");
            ((TextView)findViewById(R.id.threet1)).setText("Base 1 :");
            ((TextView)findViewById(R.id.threet2)).setText("Base 2 :");
            ((TextView)findViewById(R.id.threet3)).setText("Height :");

        }else if(id==4)
        {
            getSupportActionBar().setTitle(" Volume");
            ((ImageView)findViewById(R.id.threeimg)).setImageResource(R.drawable.acuboid);
            ((TextView)findViewById(R.id.threehead)).setText("Volume of Cuboid");
            ((TextView)findViewById(R.id.threet1)).setText("Length :");
            ((TextView)findViewById(R.id.threet2)).setText("Width :");
            ((TextView)findViewById(R.id.threet3)).setText("Height :");

        }else if(id==5)
        {
            getSupportActionBar().setTitle(" Perimeter");
            ((ImageView)findViewById(R.id.threeimg)).setImageResource(R.drawable.atriangle);
            ((TextView)findViewById(R.id.threehead)).setText("Perimeter of Triangle");
            ((TextView)findViewById(R.id.threet1)).setText("Side 1 :");
            ((TextView)findViewById(R.id.threet2)).setText("Side 2 :");
            ((TextView)findViewById(R.id.threet3)).setText("Base :");

        }


        findViewById(R.id.threeans).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chekEmpty()==0) {
                    if (id == 1)
                        ((TextView) findViewById(R.id.threeres)).setText(Double.toString(new Geometry().aTrapezium(Double.parseDouble(((EditText) findViewById(R.id.threetf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf2)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf3)).getText().toString()))));
                    else if (id == 2)
                        ((TextView) findViewById(R.id.threeres)).setText(Double.toString(new Geometry().saCuboid(Double.parseDouble(((EditText) findViewById(R.id.threetf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf2)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf3)).getText().toString()))));
                    else if (id == 3)
                        ((TextView) findViewById(R.id.threeres)).setText(Double.toString(new Geometry().saTeiangularPrism(Double.parseDouble(((EditText) findViewById(R.id.threetf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf2)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf3)).getText().toString()))));
                    else if (id == 4)
                        ((TextView) findViewById(R.id.threeres)).setText(Double.toString(new Geometry().vCuboid(Double.parseDouble(((EditText) findViewById(R.id.threetf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf2)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf3)).getText().toString()))));
                    else
                        ((TextView) findViewById(R.id.threeres)).setText(Double.toString(new Geometry().pTriangle(Double.parseDouble(((EditText) findViewById(R.id.threetf1)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf2)).getText().toString()), Double.parseDouble(((EditText) findViewById(R.id.threetf3)).getText().toString()))));
                }else
                    alert();
            }
        });

    }


    public int chekEmpty(){
        if (((TextView)findViewById(R.id.threetf1)).getText().toString().matches("")||((TextView)findViewById(R.id.threetf2)).getText().toString().matches("")||((TextView)findViewById(R.id.threetf3)).getText().toString().matches(""))
            return 1;
        else
            return 0;
    }

    public void alert()
    {
        AlertDialog alertDialog = new AlertDialog.Builder(ThreeInputSc.this).create();
        alertDialog.setTitle("Alert");
        alertDialog.setMessage(" Required Input is Empty");
        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();

                    }
                });
        alertDialog.show();
    }

}
