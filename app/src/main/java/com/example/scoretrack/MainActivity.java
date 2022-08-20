package com.example.scoretrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    static MainActivity ma;

    ma = this;
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

                EditText txt1 = findViewById(R.id.new1);
                int temp1 = Integer.parseInt(txt1.getText().toString());

                ma.score1 = ma.score1 + temp1;

                TextView score1 = (TextView) findViewById(R.id.score1);
                score1.setText(""+score1);
            }
        });

        Button btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txt2 = findViewById(R.id.new2);
                int temp2 = Integer.parseInt(txt2.getText().toString());

                ma.score2 = ma.score2 + temp2;

                TextView score2 = (TextView) findViewById(R.id.score2);
                score2.setText(""+score2);
            }
        });

        Button btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txt3 = findViewById(R.id.new3);
                int temp3 = Integer.parseInt(txt3.getText().toString());

                ma.score3 = ma.score3 + temp3;

                TextView score3 = (TextView) findViewById(R.id.score3);
                score3.setText(""+score3);
            }
        });

        Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txt4 = findViewById(R.id.new4);
                int temp4 = Integer.parseInt(txt4.getText().toString());

                ma.score4 = ma.score4 + temp4;

                TextView score4 = (TextView) findViewById(R.id.score4);
                score4.setText(""+score4);
            }
        });

        Button btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText txt5 = findViewById(R.id.new5);
                int temp5 = Integer.parseInt(txt5.getText().toString());

                ma.score5 = ma.score5 + temp5;

                TextView score5 = (TextView) findViewById(R.id.score5);
                score5.setText(""+score5);
            }
        });
    }
}