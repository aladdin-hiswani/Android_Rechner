package com.example.rechner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView result;
Button sum, sub, mul, div;
EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
sum = findViewById(R.id.sum);
sub = findViewById(R.id.sub);
mul = findViewById(R.id.mul);
div = findViewById(R.id.div);
result = findViewById(R.id.result);
number1 = findViewById(R.id.number1);
number2 = findViewById(R.id.number2) ;

    }
    public void clickSum (View view){
        double mynumber1 = Double.parseDouble(number1.getText().toString());
        double mynumber2 = Double.parseDouble(number2.getText().toString());
        result.setText((mynumber1 + mynumber2) + "");
    }

    public void clickSub(View view){
        double mynumber1 = Double.parseDouble(number1.getText().toString());
        double mynumber2 = Double.parseDouble(number2.getText().toString());
        result.setText(mynumber1 - mynumber2 + "");
    }

    public void clickMul (View view){
        double mynumber1 = Double.parseDouble(number1.getText().toString());
        double mynumber2 = Double.parseDouble(number2.getText().toString());
        result.setText(mynumber1 * mynumber2 + "");
    }
    public void  clickDiv(View view){
        double mynumber1 = Double.parseDouble(number1.getText().toString());
        double mynumber2 = Double.parseDouble(number2.getText().toString());
        if (mynumber2 !=0) {

            result.setText(mynumber1 / mynumber2 + "");
        }else result.setText("0");
    }
    public void clickResult (View view){
        double mynumber1 = Double.parseDouble(number1.getText().toString());
        double mynumber2 = Double.parseDouble(number2.getText().toString());
        result.setText(mynumber1 + mynumber2 + "");
    }
}