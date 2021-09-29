package com.example.braintraining;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {
    private SharedPreferences pref;
    private final String save_key = "save_key";
    private TextView tvFinalResult, tvBestResult;
    private float final_result;
    private float save_result = 100f;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        init();
    }

    public void init() {
        tvFinalResult = findViewById(R.id.tvFinalResult);
        tvBestResult = findViewById(R.id.tvBestResult);
        pref = getSharedPreferences("Game_result", MODE_PRIVATE);
        Intent intent = getIntent();
        final_result = intent.getFloatExtra("time_result", 100);
        save_result = getData();
        tvBestResult.setText(String.valueOf(save_result));
        tvFinalResult.setText(String.valueOf(final_result));

        if (final_result < save_result || save_result == 0) {
            tvFinalResult.setText("Новый рекорд: " + final_result + " сек.");
            tvBestResult.setText("Лучший результат: " + final_result + " сек.");
            saveData();
        } else {

            tvFinalResult.setText("Ваш результат: " + final_result + " сек.");
            tvBestResult.setText("Лучший результат: " + save_result + " сек.");
        }
    }

    public void saveData() {
        SharedPreferences.Editor editor = pref.edit();
        editor.putFloat(save_key, final_result);
        editor.apply();
    }

    public float getData() {
        return pref.getFloat(save_key, 0);
    }

    public void onClickBack(View view) {
        Intent i = new Intent(this, StartActivity.class);
        startActivity(i);
    }
}
