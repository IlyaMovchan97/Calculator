package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static final char SUM = '+';
    private static final char DIFFERENCE = '-';
    private static final char MULTIPLY = '*';
    private static final char SHARE = '/';
    private static final char PERCENT = '%';
    private char CURRENT_ACTION;


    private TextView resultField; //Окно вывода результата
    private TextView numberField; // Окно ввода чисел
    private TextView operationField; // Окно ввода знаков

    private Button but_zero;
    private Button but_double_zero;
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
    private Button but_point;
    private Button but_back;
    private Button but_equally;



    private void computeCalculation(){
        Double num_1 = Double.parseDouble(numberField.getText().toString());
        Double num_2 = Double.parseDouble(operationField.getText().toString());

        if (CURRENT_ACTION == SUM){
            double Result = num_2 + num_1;
            String Res = (Result + "");
            resultField.setText(Res);

        } else if (CURRENT_ACTION == DIFFERENCE){
            double Result = num_2 - num_1;
            String Res = (Result + "");
            resultField.setText(Res);

        } else if (CURRENT_ACTION == MULTIPLY){
            double Result = num_2 * num_1;
            String Res = (Result + "");
            resultField.setText(Res);

        } else if (CURRENT_ACTION == SHARE){
            double Result = num_2 / num_1;
                String Res = (Result + "");
                resultField.setText(Res);

            if (num_1 == 0){
                resultField.setText("err");
            }
        }

    }

    private void procentClick(){
        Double num_1 = Double.parseDouble(numberField.getText().toString());
        if (CURRENT_ACTION == PERCENT){
            double Result = num_1 / 100;
            String Res = (Result + "");
            resultField.setText(Res);
        }
    }

    private void backPoint(){
        String back = numberField.getText().toString();
       numberField.setText(back.substring(0,back.length() -1));
       // numberField.setText(back);
    }
    


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.frame_and_lineal);





        /**
         * Текстовые поля
         */
        resultField = findViewById(R.id.resultField);
        operationField = findViewById(R.id.operationField);
        numberField= findViewById(R.id.numberField);


        /**
         * Кнопки ввода
         */

        but_zero = findViewById(R.id.but_zero);
        but_double_zero = findViewById(R.id.but_double_zero);
        but_1 = findViewById(R.id.but_1);
        but_2 = findViewById(R.id.but_2);
        but_3 = findViewById(R.id.but_3);
        but_4 = findViewById(R.id.but_4);
        but_5 = findViewById(R.id.but_5);
        but_6 = findViewById(R.id.but_6);
        but_7 = findViewById(R.id.but_7);
        but_8 = findViewById(R.id.but_8);
        but_9 = findViewById(R.id.but_9);
        but_point = findViewById(R.id.but_point);


        /**
         * Кнопки опараторов
         */

        but_clean = findViewById(R.id.but_clean);
        but_part = findViewById(R.id.but_part);
        but_mult = findViewById(R.id.but_mult);
        but_back = findViewById(R.id.but_back);
        but_share = findViewById(R.id.but_share);
        but_diff = findViewById(R.id.but_diff);
        but_sum = findViewById(R.id.but_sum);
        but_equally = findViewById(R.id.equally);


        /**
         * Обработка кнопок ввода
         */

        but_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numberField.getText() == null) {
                    numberField.setText(numberField.getText() +"0" + ".");
                } else {

                    numberField.setText(numberField.getText() + "0");

                }
            }
        });

        but_double_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "00");
            }
        });

        but_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "1");
            }
        });

        but_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "2");
            }
        });

        but_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "3");
            }
        });

        but_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "4");
            }
        });

        but_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "5");
            }
        });

        but_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "6");
            }
        });


        but_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "7");
            }
        });


        but_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "8");
            }
        });

        but_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + "9");
            }
        });


        /**
         * Обработка кнопок операторов:
         */

        but_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numberField.setText(numberField.getText() + ".");
            }
        });


        but_clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operationField.setText("");
                numberField.setText("");
                resultField.setText("");
            }
        });

        but_part.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = PERCENT;
                procentClick();
            }
        });

        but_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                CURRENT_ACTION = MULTIPLY;
                operationField.setText(numberField.getText());
                numberField.setText("");
            }
        });

        but_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backPoint();
            }
        });

        but_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //computeCalculation();
                CURRENT_ACTION = SHARE;
                operationField.setText(numberField.getText());
                numberField.setText("");
            }
        });

        but_diff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  computeCalculation();
                CURRENT_ACTION = DIFFERENCE;
                operationField.setText(numberField.getText());
                numberField.setText("");
            }
        });

        but_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CURRENT_ACTION = SUM;
                operationField.setText(numberField.getText());
                numberField.setText("");
            }
        });

        but_equally.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                computeCalculation();


            }
        });







    }
}