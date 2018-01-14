package com.example.ahmedmamdouh.mudloggingcalculations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;
import android.support.v7.appcompat.R;
import android.support.v7.app.AppCompatActivity;
import java.text.DecimalFormat;





/**
 * Created by Ahmed Mamdouh on 13/09/2016.
 */

public class Activity5 extends android.support.v7.app.AppCompatActivity {
    android.widget.EditText mEditText1;
    android.widget.EditText mEditText2;
    android.widget.EditText mEditText3;
    android.widget.EditText mEditText4;
    android.widget.Button mButton;
    android.widget.TextView mTextView1;
    android.widget.TextView mTextView2;
    double result;


    @Override
    protected void onCreate(android.os.Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.ahmedmamdouh.mudloggingcalculations.R.layout.layout5);


        mEditText1= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.output);
        mEditText2= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.output1);
        mEditText3= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.output2);
        mEditText4= (android.widget.EditText)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.output3);
        mTextView1= (android.widget.TextView)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.volume);
        mTextView2= (android.widget.TextView)findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.lagtime);
        mButton=(android.widget.Button) findViewById(com.example.ahmedmamdouh.mudloggingcalculations.R.id.lag);



        mButton.setOnClickListener(new android.view.View.OnClickListener() {

            @Override
            public void onClick(android.view.View v) {
                //When the button is clicked, call the calucate method.
                calculate();
            }
        });

    }


    public void calculate() {
        //get entered texts from the edittexts,and convert to integers.
        Double value1 = Double.parseDouble(mEditText1.getText().toString());
        Double value2 = Double.parseDouble(mEditText2.getText().toString());
        Double value3 = Double.parseDouble(mEditText3.getText().toString());
        Double value4 = Double.parseDouble(mEditText4.getText().toString());
        //do the calculation
        Double calculatedValue = ((Math.pow(value2, 2)-(Math.pow(value3, 2))/1029.4));
        Double result = calculatedValue*0.45686006*value4;
        //set the value to the textview, to display on screen.
        mTextView1.setText(result.toString());
        mTextView1.setText(String.format("%.2f", result));

        Double CalculatedValue1 = (result/value1);
        mTextView2.setText(CalculatedValue1.toString());
        mTextView2.setText(String.format("%.2f", CalculatedValue1));

    }}