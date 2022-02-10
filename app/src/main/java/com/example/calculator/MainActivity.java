package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double valueOne = Double.NaN;
    private double valueTwo;

    private static final char SUM = '+';
    private static final char DIFFERENCE = '-';
    private static final char MULTIPLY = '*';
    private static final char SHARE = '/';
    private char CURRENT_ACTION;


    private TextView window, signbox;

    private Button but_zero;
    private Button but_1;
    private Button but_2;
    private Button but_3;
    private Button but_4;
    private Button but_5;
    private Button but_6;
    private Button but_7;
    private Button but_8;
    private Button but_9;

    private Button but_clean;
    private Button but_part;
    private Button but_mult;
    private Button but_share;
    private Button but_diff;
    private Button but_sum;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frame_and_lineal);

        window = findViewById(R.id.window);
        signbox = findViewById(R.id.window);



        but_zero = findViewById(R.id.but_zero);
        but_1 = findViewById(R.id.but_1);
        but_2 = findViewById(R.id.but_2);
        but_3 = findViewById(R.id.but_3);
        but_4 = findViewById(R.id.but_4);
        but_5 = findViewById(R.id.but_5);
        but_6 = findViewById(R.id.but_6);
        but_7 = findViewById(R.id.but_7);
        but_8 = findViewById(R.id.but_8);
        but_9 = findViewById(R.id.but_9);

        but_clean = findViewById(R.id.but_clean);
        but_part = findViewById(R.id.but_part);
        but_mult = findViewById(R.id.but_mult);
        but_share = findViewById(R.id.but_share);
        but_diff = findViewById(R.id.but_diff);
        but_sum = findViewById(R.id.but_sum);



        but_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "0");
            }
        });

        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "1");
            }
        });

        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "2");
            }
        });

        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "3");
            }
        });

        but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "4");
            }
        });

        but_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "5");
            }
        });

        but_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "6");
            }
        });


        but_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "7");
            }
        });


        but_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "8");
            }
        });

        but_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "9");
            }
        });


        but_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText("");
            }
        });

        but_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "%");
            }
        });

        but_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "*");
            }
        });

        but_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "/");
            }
        });

        but_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "-");
            }
        });

        but_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                window.setText(window.getText() + "+");
            }
        });











        /*
         but_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String a = window.get;
                window.setText(a);
                //window.setText(window.getText() + "5");
               // window.setText((window.setText() * ;));
            }
        });
         */
















      /*  Object binding;
        binding.buttonZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.editText.setText(binding.editText.getText() + "0");
            }
        });

       */

    }
}