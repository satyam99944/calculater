package com.example.calculater;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private EditText et1;
private EditText et2;
private TextView text;
private int num1;
private  int num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getNumber(){
        et1=findViewById(R.id.t1);
        et2=findViewById(R.id.t2);
        text=findViewById(R.id.solt);
        String str1=et1.getText().toString();
        String str2=et2.getText().toString();
        if((str1==null && str2==null) || (str1.length()==0 && str2.length()==0)){
            text.setText("enter valid no:");
            return false;
        }else{
            try {
                num1 = Integer.parseInt(str1);
                num2 = Integer.parseInt(str2);
                return true;
            }catch (Exception e){
                text.setText("enter number:");
                return false;
            }
        }
    }
    public void funSum(View view){
        if(getNumber()){
            int res=num1+num2;
            text.setText(Integer.toString(res));
        }
    }

    public void funsub(View view) {
        if(getNumber()){
            int res=num1-num2;
            text.setText(Integer.toString(res));
        }
    }

    public void funMul(View view) {
        if(getNumber()){
            int res=num1*num2;
            text.setText(Integer.toString(res));
        }
    }

    public void funDiv(View view) {
        if(getNumber()){
            if(num2==0){
                text.setText("can't divide by 0:");
            }else{
                double res=num1*1.0/num2;
                text.setText(Double.toString(res));
            }
        }
    }

    public void funMod(View view) {
        if(getNumber()){
            if(num2!=0) {
                int res = num1 % num2;
                text.setText(Integer.toString(res));
            }else{
                text.setText("can't divide by 0:");
            }
        }
    }

    public void fumPow(View view) {
        if(getNumber()){
            double res=Math.pow(num1,num2);
            text.setText(Double.toString(res));
        }
    }
}