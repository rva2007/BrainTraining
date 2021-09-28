package com.example.braintraining;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FinalActivity extends AppCompatActivity {
    private TextView tvTitle, tvFinalResult, tvBestResult;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        init();
    }

    public void init() {
        tvTitle = findViewById(R.id.tvTitle);
        tvFinalResult = findViewById(R.id.tvFinalResult);
        tvBestResult = findViewById(R.id.tvBestResult);
    }

    public void onClickBack(View view) {
        Intent i = new Intent(this,StartActivity.class);
        startActivity(i);
    }
}
