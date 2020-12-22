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

public class OneMatInput extends AppCompatActivity {

    public int id,flag=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_mat_input);
        ((EditText)findViewById(R.id.matres)).setKeyListener(null);
        ((EditText)findViewById(R.id.col2)).setKeyListener(null);

        Bundle b = getIntent().getExtras();
        id=b.getInt("id");
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));
        ((EditText)findViewById(R.id.row2)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ((EditText)findViewById(R.id.matres)).setText("");
                ((EditText)findViewById(R.id.col2)).setText(((EditText)findViewById(R.id.row2)).getText().toString());

            }
        });

        ((EditText)findViewById(R.id.mattxt)).addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                ((EditText)findViewById(R.id.matres)).setText("");
                if(((EditText)findViewById(R.id.row2)).getText().toString().matches(""))
                {
                    if (flag==0) {
                        flag=1;
                        alert(1);
                    }
                }
                flag=0;
            }
        });

        (findViewById(R.id.matreset2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((EditText)findViewById(R.id.row2)).setText("");
                ((EditText)findViewById(R.id.col2)).setText("");
                flag=1;
                ((EditText)findViewById(R.id.mattxt)).setText("");
                ((EditText)findViewById(R.id.matres)).setText("");
                flag=0;
            }
        });

        (findViewById(R.id.tmatok2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(chekEmpty()==0)
                {
                    if (chekInput(((EditText) findViewById(R.id.mattxt)).getText().toString(), Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString()) * Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString())) == 0) {
                        int mat[][] = new int[Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString())][Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString())];
                        String mate[]=((EditText)findViewById(R.id.mattxt)).getText().toString().split("-");

                        int count=0;
                        for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString()); i++) {
                            for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                mat[i][j] = Integer.parseInt(mate[count]);
                                count++;
                            }
                        }
                        if (id==1)
                        {
                            int fd=0,rd=0;
                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                if(i==j)
                                    fd=fd+mat[i][j];
                                if (i+j==Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString())-1)
                                    rd=rd+mat[i][j];
                                }
                            }
                            ((EditText)findViewById(R.id.matres)).setText("Sum of First Diagonal : "+Integer.toString(fd)+"\n\n"+"Sum of Second Diagonal : "+Integer.toString(rd));

                        }else if (id==2)
                        {
                            int fd=0,rd=0;
                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    if(i==j)
                                        fd=fd*mat[i][j];
                                    if (i+j==Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString())-1)
                                        rd=rd*mat[i][j];
                                }
                            }
                            ((EditText)findViewById(R.id.matres)).setText("Product of First Diagonal : "+Integer.toString(fd)+"\n\n"+"Product of Second Diagonal : "+Integer.toString(rd));

                        }else if (id==3)
                        {
                            int fd=0;
                            ((EditText) findViewById(R.id.matres)).setText("* * * * Entered Matrix * * * *\n\n");
                            for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString()); i++) {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    ((EditText) findViewById(R.id.matres)).setText(((EditText) findViewById(R.id.matres)).getText() + Integer.toString(mat[i][j]) + "   ");

                                }
                                ((EditText) findViewById(R.id.matres)).setText(((EditText) findViewById(R.id.matres)).getText() + "\n");
                            }
                            ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"\n* * * * * Sum of Rows * * * * *\n\n");

                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                fd=fd+mat[i][j];
                                }
                                ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"Sum of "+Integer.toString(i+1)+" Row :"+Integer.toString(fd)+"\n");
                                fd=0;
                            }
                            ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"\n* * * * Sum of Columns * * * *\n\n");

                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    fd=fd+mat[j][i];
                                }
                                ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"Sum of "+Integer.toString(i+1)+" Column :"+Integer.toString(fd)+"\n");
                                fd=0;
                            }


                        }else if (id==4)
                        {
                            int fd=1;
                            ((EditText) findViewById(R.id.matres)).setText("* * * * Entered Matrix * * * *\n\n");
                            for (int i = 0; i < Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString()); i++) {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    ((EditText) findViewById(R.id.matres)).setText(((EditText) findViewById(R.id.matres)).getText() + Integer.toString(mat[i][j]) + "   ");

                                }
                                ((EditText) findViewById(R.id.matres)).setText(((EditText) findViewById(R.id.matres)).getText() + "\n");
                            }
                            ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"\n* * * * Product of Rows * * * *\n\n");

                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    fd=fd*mat[i][j];
                                }
                                ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"Product of "+Integer.toString(i+1)+" Row :"+Integer.toString(fd)+"\n");
                                fd=1;
                            }
                            ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"\n* * * Product of Columns * * *\n\n");

                            for (int i=0;i<Integer.parseInt(((EditText) findViewById(R.id.row2)).getText().toString());i++)
                            {
                                for (int j = 0; j < Integer.parseInt(((EditText) findViewById(R.id.col2)).getText().toString()); j++) {
                                    fd=fd*mat[j][i];
                                }
                                ((EditText)findViewById(R.id.matres)).setText(((EditText)findViewById(R.id.matres)).getText().toString()+"Product of "+Integer.toString(i+1)+" Column :"+Integer.toString(fd)+"\n");
                                fd=1;
                            }
                        }

                    }else alert(3);

                }else alert(2);

            }
        });

    }
    public void alert(final int n)
    {
        AlertDialog alertDialog = new AlertDialog.Builder(OneMatInput.this).create();
        alertDialog.setTitle("Alert");
        if(n==1) {
            alertDialog.setMessage("Set the Order of Matrix");
            ((EditText)findViewById(R.id.mattxt)).setText("");
        }
        else if (n==2)
        {
            alertDialog.setMessage("Required Input is Empty");
        }else if (n==3)
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
        if(((EditText)findViewById(R.id.mattxt)).getText().toString().matches(""))
            return 1;
        else return 0;
    }
}
