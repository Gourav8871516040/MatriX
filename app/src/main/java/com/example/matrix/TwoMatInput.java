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
import android.widget.Button;
import android.widget.EditText;

public class TwoMatInput extends AppCompatActivity {

    public int id,flag=0, count=0;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_mat_input);
        ((EditText)findViewById(R.id.tmatres)).setKeyListener(null);
        ((EditText)findViewById(R.id.row)).requestFocus();
        Bundle b = getIntent().getExtras();
        id=b.getInt("id");
        ((EditText)findViewById(R.id.row)).requestFocus();
        ((EditText)findViewById(R.id.tmatres)).setKeyListener(null);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        if(id==1)
        {
            ((Button)findViewById(R.id.tmatok)).setText("Add");
        }else if(id==2)
        {
            ((Button)findViewById(R.id.tmatok)).setText("Subtract");
        }else if(id==3)
        {
            ((Button)findViewById(R.id.tmatok)).setText("Product");
        }

        ((EditText)findViewById(R.id.col)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ((EditText)findViewById(R.id.tmatres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.row)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ((EditText)findViewById(R.id.tmatres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.fmattxt)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(((EditText)findViewById(R.id.row)).getText().toString().matches("")||((EditText)findViewById(R.id.col)).getText().toString().matches(""))
                {
                    if (flag==0) {
                     flag=1;
                        alert(1);
                    }
                    }
                flag=0;
                ((EditText)findViewById(R.id.tmatres)).setText("");
            }
        });

        ((EditText)findViewById(R.id.smattxt)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(((EditText)findViewById(R.id.row)).getText().toString().matches("")||((EditText)findViewById(R.id.col)).getText().toString().matches(""))
                {
                    if (flag==0) {
                        flag=1;
                        alert(2);
                    }
                }
                flag=0;
                ((EditText)findViewById(R.id.tmatres)).setText("");
            }
        });

        ((Button)findViewById(R.id.tmatok)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    if (chekEmpty() == 0) {

                        if (chekInput(((EditText) findViewById(R.id.fmattxt)).getText().toString(), Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()) * Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())) == 0 && chekInput(((EditText) findViewById(R.id.smattxt)).getText().toString(), Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()) * Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())) == 0) {
                            int fmat[][] = new int[Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString())][Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())];
                            int smat[][] = new int[Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString())][Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())];
                            int ans[][] = new int[Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString())][Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())];
                            String mat1[] = ((EditText) findViewById(R.id.fmattxt)).getText().toString().split("-");
                            String mat2[] = ((EditText) findViewById(R.id.smattxt)).getText().toString().split("-");

                            count=0;
                            for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                    fmat[i][j] = Integer.parseInt(mat1[count]);
                                    smat[i][j] = Integer.parseInt(mat2[count]);
                                    count++;

                                }

                            }
                            if (id == 1) {
                                for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                    for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                        ans[i][j] = fmat[i][j] + smat[i][j];
                                    }
                                }
                            } else if (id == 2) {
                                for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                    for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                        ans[i][j] = fmat[i][j] - smat[i][j];
                                    }
                                }
                            } else if (id == 3) {
                                if(Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString())>Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString())) {
                                    count = 0;
                                    for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                        for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                            for (int k = 0; k < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); k++) {
                                                count += fmat[i][k] * smat[k][j];
                                            }
                                            ans[i][j] = count;
                                            count = 0;
                                        }
                                    }
                                }else
                                {
                                    count = 0;
                                    for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                        for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                            for (int k = 0; k < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); k++) {
                                                count += fmat[i][k] * smat[k][j];
                                            }
                                            ans[i][j] = count;
                                            count = 0;
                                        }
                                    }
                                }
                            }
                            ((EditText) findViewById(R.id.tmatres)).setText("");
                            for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row)).getText().toString()); i++) {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col)).getText().toString()); j++) {
                                    ((EditText) findViewById(R.id.tmatres)).setText(((EditText) findViewById(R.id.tmatres)).getText() + Integer.toString(ans[i][j]) + "   ");

                                }
                                ((EditText) findViewById(R.id.tmatres)).setText(((EditText) findViewById(R.id.tmatres)).getText() + "\n");

                            }


                        } else alert(4);

                    } else alert(3);

            }
        });


        ((Button)findViewById(R.id.matreset)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText)findViewById(R.id.row)).setText("");
                ((EditText)findViewById(R.id.col)).setText("");
                flag=1;
                ((EditText)findViewById(R.id.fmattxt)).setText("");
                ((EditText)findViewById(R.id.smattxt)).setText("");
                ((EditText)findViewById(R.id.tmatres)).setText("");
                flag=0;
            }
        });





    }
    public void alert(final int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(TwoMatInput.this).create();
        alertDialog.setTitle("Alert");
        if(n==1) {
            alertDialog.setMessage("Set the Order of Matrix");
            ((EditText)findViewById(R.id.fmattxt)).setText("");
        }
        else if (n==2)
        {
            alertDialog.setMessage("Set the Order of Matrix");
            ((EditText)findViewById(R.id.smattxt)).setText("");
        }else if (n==3)
        {
            alertDialog.setMessage("Required Input is Empty");
        }else if (n==4)
        {
            alertDialog.setTitle("Input Error !!");
            alertDialog.setMessage("Something went Wrong , enter the matrix in valid manner.");
        }

        alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        dialog.dismiss();
                    }
                });
        alertDialog.show();
    }

    public int chekInput(String in ,int n)
    {
        String mat[]=in.split("-");
        if(mat.length==n)
            return 0;
        else
            return 1;

    }
    public int chekEmpty()
    {
        if(((EditText)findViewById(R.id.fmattxt)).getText().toString().matches("")||((EditText)findViewById(R.id.smattxt)).getText().toString().matches(""))
            return 1;
        else return 0;
    }

}
