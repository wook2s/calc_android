package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView resultView;
    String temp, number;
    String tempB;
    String preNum;

    double num1, num2;
    int flag = 0;
    int flag2 =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultView = findViewById(R.id.result_text);
    }

    public void getNumber (String temp, String number)
    {
        if(temp.equals("0"))
            resultView.setText(number);
        else
            resultView.setText(temp+number);
    }

    public void buttonClick(View view)
    {
        Button button = findViewById(view.getId());

        switch (button.getId())
        {
            case R.id.num_0_button :
                temp = resultView.getText().toString();
                number = button.getText().toString();
                if(temp.equals("0"))
                    resultView.setText("0");
                else
                    getNumber(temp, number);
                break;
            case R.id.num_1_button :
            case R.id.num_2_button :
            case R.id.num_3_button :
            case R.id.num_4_button :
            case R.id.num_5_button :
            case R.id.num_6_button :
            case R.id.num_7_button :
            case R.id.num_8_button :
            case R.id.num_9_button :
                    temp = resultView.getText().toString();
                    number = button.getText().toString();
                    getNumber(temp, number);
                    break;
            case R.id.plus_button :
                preNum = resultView.getText().toString();
                resultView.setText("0");
                flag = 1;
                break;
            case R.id.minus_button :
                preNum = resultView.getText().toString();
                resultView.setText("0");
                flag = 2;
                break;
            case R.id.multiply_button :
                preNum = resultView.getText().toString();
                resultView.setText("0");
                flag = 3;
                break;
            case R.id.div_button :
                preNum = resultView.getText().toString();
                resultView.setText("0");
                flag = 4;
                break;
            case R.id.all_clear_button :
                resultView.setText("0");
                flag = 0;
                break;
            case R.id.back_space :
                temp = resultView.getText().toString();
                tempB = temp.substring(0, temp.length()-1);
                resultView.setText(tempB);
                break;

            case R.id.result_button :
                num1 = Double.parseDouble(preNum);
                num2 = Double.parseDouble(resultView.getText().toString());
                double num3;
                if(flag ==1)
                {
                    num3 = num1 + num2;
                    resultView.setText(String.valueOf(num3));
                    flag2 = 1;
                }else if(flag ==2)
                {
                    num3 = num1 - num2;
                    resultView.setText(String.valueOf(num3));
                    flag2 = 1;
                }else if(flag ==3)
                {
                    num3 = num1 * num2;
                    resultView.setText(String.valueOf(num3));
                    flag2 = 1;
                }else if(flag ==4)
                {
                    num3 = num1 / num2;
                    resultView.setText(String.valueOf(num3));
                    flag2 = 1;
                }
                temp = "0";

        }
    }
}













