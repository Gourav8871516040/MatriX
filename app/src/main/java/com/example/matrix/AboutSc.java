package com.example.matrix;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.EditText;

import com.uncopt.android.widget.text.justify.JustifiedEditText;
import com.uncopt.android.widget.text.justify.JustifiedTextView;

public class AboutSc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_sc);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#00e5ff")));

        /*String sourceString = "<b>" + id + "</b> " + name;
        mytextview.setText(Html.fromHtml(sourceString));*/

        JustifiedTextView t2 = (JustifiedTextView)findViewById(R.id.about2);

        t2.setText("Matrix is a  application developed  to calculate some  basic mathematics problem. \n" +
                "\n" +
                "\n" +
                "It is developed by Gourav Shrinivas , a engineering student of Computer Science.\n" +
                "\n" +
                "The main purpose behind to develop this application is to ease the work of students and help them to save there time. Many time students often get  confused while solving mathematic problems. This app intended to help them by solving there problem   in just few clicks. \n" +
                "\n" +
                "Matrix is the type of application in which you don’t need to remember any kind of formula or method to solve the problem , you just put your input and get output on one click as the result.\n" +
                "\n" +
                "You can use this application to solve the problems without internet connection. But if you want to send any kind of  feedback about the application , then internet connection is required.\n" +
                "\n" +
                "Function of the application :-\n" +
                "\n" +
                "AP Series : In this function you just put the required input and get the Arithmetic Progression Series of the numbers.\n" +
                "\n" +
                "Geometry Operations : This operation is divided into four parts are: Find Area , Surface Area , Find Perimeter and Find Volume. Using this functions you can find the area , surface area , volume and perimeter of all the types of geometry shapes.\n" +
                "\n" +
                "Check Number : In this function you can check the input number is armstrong or not , dissarium or not , perfect or not ,etc.\n" +
                "\n" +
                "Calculator : It is a simple calculator by which you perform arithmetic operations on numbers.\n" +
                "\n" +
                "Number Table : Using this function you will find the table of any number.\n" +
                "\n" +
                "Matrix Operations : It is the very different function of the application . Using this function you can perform different kinds of matrix operation on any kind of ordered matrix.\n" +
                "\n" +
                "Number System : This function can perform all the 12 types of conversions of Number System.\n" +
                "\n" +
                "I hope this  application will help you. \n" +
                "\n" +
                "Note: Student  should first  try to solve problem by themselves. \n\nThank you.");



    }
}
