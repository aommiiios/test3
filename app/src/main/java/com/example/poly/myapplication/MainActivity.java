package com.example.poly.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private AppCompatEditText etNumberOne;
    private AppCompatEditText etNumberTwo;
    private AppCompatButton btnPlus;
    private AppCompatButton btnMinus;
    private AppCompatButton btnMultiply;
    private AppCompatButton btnDivide;
    private AppCompatTextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumberOne = findViewById(R.id.etNberOne);
        etNumberTwo = findViewById(R.id.etNberTwo);
        btnDivide = findViewById(R.id.btnDivide);
        btnMinus = findViewById(R.id.btnMinus);
        btnPlus = findViewById(R.id.btnPlus);
        btnMultiply = findViewById(R.id.btnMultiply);
        tvResult = findViewById(R.id.tvResult);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int result = plus(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));

            }
        });
        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int result = multiply(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));


            }
        });
        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int result = minus(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));

            }
        });
        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
                int result = divide(Integer.parseInt(numberOne),Integer.parseInt(numberTwo));
                tvResult.setText(String.valueOf(result));


            }
        });



    }
    private int plus (int x, int y){
        return x + y;
    }
    private int minus (int x, int y){
        return x - y;
    }
    private int multiply (int x, int y){
        return x * y;
    }
    private int divide (int x, int y) {
        if (y == 0){
        return 0;
    } else {
        return x/y;
       }
    }

}
