package com.example.relieved;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RefreshActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView birdgame,ballgame,fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refresh);

        birdgame=(CardView) findViewById(R.id.birdgame);
        ballgame=(CardView) findViewById(R.id.ballgame);
        fun=(CardView) findViewById(R.id.fun);



        birdgame.setOnClickListener(this);
        ballgame.setOnClickListener(this);
        fun.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch(v.getId()){
            case R.id.birdgame:
                i=new Intent(this, BirdSplashActivity.class);
                startActivity(i);
                break;
            case R.id.ballgame:
                i= new Intent(this,BallSplashActivity.class);
                startActivity(i);
                break;
            case R.id.fun:
                i=new Intent(this,FunActivity.class);
                startActivity(i);
                break;

        }
    }
}