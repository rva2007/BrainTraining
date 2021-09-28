package com.example.braintraining;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private final String save_key = "save_key";
    private TextView tvMain, tvResult;
    private ActionBar actionBar;
    private int number_1;
    private int number_2;
    private int number_false;
    private int number_index;
    private int number_result;
    private int max = 20;
    private int min = 2;
    private int max_fals = 40;
    private int min_fals = 10;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        pref = getSharedPreferences("Test", MODE_PRIVATE);
        tvMain = findViewById(R.id.tvMain);
        tvResult = findViewById(R.id.tvResult);
        actionBar = getSupportActionBar();
    }

    public void onClickTrue(View view) {
        numbers();
    }

    public void onClickFalse(View view) {
        numbers();
    }

    private void numbers() {
        number_1 = (int) (Math.random() * (max - min));
        number_2 = (int) (Math.random() * (max - min));
        number_index = (int) (Math.random() * (3 - 1));
        number_false = (int) (Math.random() * (max_fals - min_fals));
        number_result = number_1 + number_2;

        tvResult.setText(String.valueOf(number_1));
        String text;
        if (number_index == 1) {
            text = number_1 + " + " + number_2 + " = " + number_result; 
        }else {
            text = number_1 + " + " + number_2 + " = " + number_false;
        }
        tvMain.setText(text);

    }
}