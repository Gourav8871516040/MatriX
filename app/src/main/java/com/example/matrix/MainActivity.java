package com.example.matrix;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static int SPLASH_SCREEN=4500;



    Animation topAnim;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();



        topAnim= AnimationUtils.loadAnimation(this, R.anim.top_animation);
        image=findViewById(R.id.imageView);
        image.setAnimation(topAnim);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {

                Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE).getBoolean("isFirstRun", true);


                if (isFirstRun) {
                    //show start activity

                    startActivity(new Intent(MainActivity.this, GetName.class));



                }else startActivity(new Intent(MainActivity.this, Dashboard.class));


                finish();

            }
        },SPLASH_SCREEN);





    }
}
