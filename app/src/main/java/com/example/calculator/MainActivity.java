package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv_main_result;
    EditText et_main_first, et_main_second;
    Button bt_main_sum;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main_result = findViewById(R.id.tv_main_result);
        et_main_first = findViewById(R.id.et_main_first);
        et_main_second = findViewById(R.id.et_main_second);
        bt_main_sum = findViewById(R.id.bt_main_sum);

    }


    public void onClick(View view) {
        if (view == bt_main_sum) {
            if (et_main_first.getText().toString().equals("") || et_main_second.getText().toString().equals("")) {
                tv_main_result.setText("pls enter the numbers");
            } else {
                tv_main_result.setText("RESULT: " + (Integer.parseInt(et_main_first.getText().toString()) + Integer.parseInt(et_main_second.getText().toString())));

            }


        }


    }
}