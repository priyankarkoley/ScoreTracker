package com.example.scoretrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int score1 = 0;
    int score2 = 0;
    int score3 = 0;
    int score4 = 0;
    int score5 = 0;
  //  MainActivity ma = new MainActivity();
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText new1 = findViewById(R.id.new1);
                int temp1 = Integer.parseInt(new1.getText().toString());

                score1 = score1 + temp1;

                TextView text1 = (TextView) findViewById(R.id.score1);
                text1.setText(""+score1);
                Log.v("myapppp", "\n\nhellllooooooo"+score1);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText new2 = findViewById(R.id.new2);
                int temp2 = Integer.parseInt(new2.getText().toString());

                score2 = score2 + temp2;

                TextView text2 = (TextView) findViewById(R.id.score2);
                text2.setText(""+score2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText new3 = findViewById(R.id.new3);
                int temp3 = Integer.parseInt(new3.getText().toString());

                score3 = score3 + temp3;

                TextView text3 = (TextView) findViewById(R.id.score3);
                text3.setText(""+score3);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText new4 = findViewById(R.id.new4);
                int temp4 = Integer.parseInt(new4.getText().toString());

                score4 = score4 + temp4;

                TextView text4 = (TextView) findViewById(R.id.score4);
                text4.setText(""+score4);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText new5 = findViewById(R.id.new5);
                int temp5 = Integer.parseInt(new5.getText().toString());

                score5 = score5 + temp5;

                TextView text5 = (TextView) findViewById(R.id.score5);
                text5.setText(""+score5);
            }
        });
    }
}