package com.example.braintraining;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvMain, tvResult;
    private ActionBar actionBar;
    private long start_time = 0;
    private long current_time = 0;
    private float time_result = 0;
    private int true_answer = 0;
    int max_true_answer = 3;
    private boolean is_true_answer = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        start_time = System.currentTimeMillis();
        tvMain = findViewById(R.id.tvMain);
        tvResult = findViewById(R.id.tvResult);
        actionBar = getSupportActionBar();
        numbers();
        tvResult.setText(String.valueOf(true_answer));
    }

    public void onClickTrue(View view) {
        if (is_true_answer) {
            ++true_answer;
            tvResult.setText(String.valueOf(true_answer));
            numbers();
            current_time = System.currentTimeMillis();
            time_result = (float) (current_time - start_time) / 1000;
            String time = "Time: " + time_result;
            actionBar.setTitle(time);
        } else {
            numbers();
            current_time = System.currentTimeMillis();
            time_result = (float) (current_time - start_time) / 1000;
            String time = "Time: " + time_result;
            actionBar.setTitle(time);
        }
    }

    public void onClickFalse(View view) {
        if (!is_true_answer) {
            ++true_answer;
            tvResult.setText(String.valueOf(true_answer));
            numbers();
            current_time = System.currentTimeMillis();
            time_result = (float) (current_time - start_time) / 1000;
            String time = "Time: " + time_result;
            actionBar.setTitle(time);
        } else {
            numbers();
            current_time = System.currentTimeMillis();
            time_result = (float) (current_time - start_time) / 1000;
            String time = "Time: " + time_result;
            actionBar.setTitle(time);
        }

    }

    private void numbers() {
        int max = 20;
        int min = 2;
        int number_1 = (int) (Math.random() * (max - min));
        int number_2 = (int) (Math.random() * (max - min));
        int number_index = (int) (Math.random() * (3 - 1));
        int max_false = 40;
        int min_false = 10;
        int number_false = (int) (Math.random() * (max_false - min_false));
        int number_result = number_1 + number_2;

        String text;
        if (number_index == 1) {
            text = number_1 + " + " + number_2 + " = " + number_result;
            is_true_answer = true;
        } else {
            text = number_1 + " + " + number_2 + " = " + number_false;
            is_true_answer = false;
        }
        tvMain.setText(text);


        if (true_answer>= max_true_answer) {
            Intent i = new Intent(this,FinalActivity.class);
            i.putExtra("time_result", time_result);
            startActivity(i);
        }
    }

}