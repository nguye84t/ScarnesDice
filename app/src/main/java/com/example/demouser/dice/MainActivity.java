package com.example.demouser.dice;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

import static android.view.animation.Animation.RELATIVE_TO_PARENT;

public class MainActivity extends AppCompatActivity {

    private int userScore;
    private int comScore;
    private int userTurnScore;
    private int comTurnScore;
    private ImageView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = findViewById(R.id.imageView3); // Identifying the ImageView object

         // Identifying a drawable thing
        TextView textView = findViewById(R.id.textView);
        View button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                randomDice();
            }
        });

    }

    private void randomDice(){

        Resources res = getResources();
        Drawable dice1 = res.getDrawable(R.drawable.dice1);
        Drawable dice2 = res.getDrawable(R.drawable.dice2);
        Drawable dice3 = res.getDrawable(R.drawable.dice3);
        Drawable dice4 = res.getDrawable(R.drawable.dice4);
        Drawable dice5 = res.getDrawable(R.drawable.dice5);
        Drawable dice6 = res.getDrawable(R.drawable.dice6);
        Random ran = new Random();
        int ranNumber = ran.nextInt(6);
        //Log.i("Dice", "number" + ranNumber);
        if (ranNumber==1){
            view.setImageDrawable(dice1);
        }
        else if (ranNumber==2){
            view.setImageDrawable(dice2);
        }
        else if (ranNumber==3){
            view.setImageDrawable(dice3);
        }
        else if (ranNumber==4){
            view.setImageDrawable(dice4);
        }
        else if (ranNumber==5){
            view.setImageDrawable(dice5);
        }
        else if (ranNumber==6){
            view.setImageDrawable(dice6);
        }
    }


}
