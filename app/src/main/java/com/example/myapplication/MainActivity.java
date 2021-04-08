package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText number1;
    EditText number2;
    Button Add_button,subtract,divide,multiply;
    TextView result;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        number2=(EditText) findViewById(R.id.editText_second_no);
        Add_button=(Button) findViewById(R.id.add_button);
        result = (TextView) findViewById(R.id.textView_answer);
        subtract = (Button) findViewById(R.id.sub1);
        divide = (Button) findViewById(R.id.div);
        multiply = (Button) findViewById(R.id.multi);


        Add_button.setOnClickListener(v -> {


            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());

            double sum = num1 + num2;

            result.setText(Double.toString(sum));
        });

        subtract.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double subs = num1-num2;

            result.setText(Double.toString(subs));
        });

        divide.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double div = num1/num2;

            result.setText(Double.toString(div));
        });

        multiply.setOnClickListener(v -> {
            double num1 = Double.parseDouble(number1.getText().toString());
            double num2 = Double.parseDouble(number2.getText().toString());
            double mul = num1*num2;
            result.setText(Double.toString(mul));
        });
    }
}