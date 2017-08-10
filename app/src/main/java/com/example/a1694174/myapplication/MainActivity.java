package com.example.a1694174.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    String display = "0";
    String stored;
    String operation;

    TextView storedTv;
    TextView displayTv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.textView);
        storedTv = (TextView) findViewById(R.id.storedTV);
        displayTv= (TextView) findViewById(R.id.displayTV);


    }

    public void clickOne(View v) {
        display = display + "1";
        displayTv.setText(display);

        tv.setText(display);
    }

    public void clickTwo(View v) {
        display = display + "2";
        displayTv.setText(display);
        tv.setText(display);
    }

    public void clickThree(View v) {
        display = display + "3";
        displayTv.setText(display);
        tv.setText(display);
    }

    public void clickFour(View v) {
        display = display + "4";
        tv.setText(display);
    }

    public void clickFive(View v) {
        display = display + "5";
        tv.setText(display);
    }

    public void clickSix(View v) {
        display = display + "6";
        tv.setText(display);
    }

    public void clickSeven(View v) {
        display = display + "7";
        tv.setText(display);
    }

    public void clickEight(View v) {
        display = display + "8";
        tv.setText(display);
    }

    public void clickNine(View v) {
        display = display + "9";
        tv.setText(display);
    }

    public void clickZero(View v) {
        display = display + "0";
        displayTv.setText(display);
        tv.setText(display);
    }

    public void clickDivision(View v) {
        stored = display;

        display = "0";
        displayTv.setText(display);
        storedTv.setText(stored);
        tv.setText(display);
        operation = "/";
    }

    public void clickPlus(View v) {
        stored = display;
        display = "0";
        displayTv.setText(display);
        storedTv.setText(stored);
        tv.setText(display);
        operation = "+";
    }

    public void clickClear(View v) {
        display = "0";
        displayTv.setText(display);
        storedTv.setText(stored);
        tv.setText(display);
    }

    public void clickMinus(View v) {
        stored = display;
        display = "0";
        displayTv.setText(display);
        storedTv.setText(stored);
        tv.setText(display);
        operation = "-";
    }

    public void Multiplication(View v) {
    stored  = display;
    display = "0";
    tv.setText(display);
        operation = "*";
    }

    public void clickEquals(View v) {
        int lhs = Integer.parseInt(stored);
        int rhs = Integer.parseInt(display);
        int numberResult = 0;

        if (operation.equals("+")) {
            numberResult = lhs + rhs;
        } else if (operation.equals("-")) {
            numberResult = lhs - rhs;
        }

        if (operation.equals("*")) {
            numberResult = lhs * rhs;
        } else if (operation.equals("/")) {
            numberResult = lhs/rhs;
        }

        String result = "" + numberResult;
        tv.setText(result);
        display = result;
        displayTv.setText(display);
        storedTv.setText(stored);
    }
}
