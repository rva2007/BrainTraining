package com.example.braintraining;

import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class AnimalsActivity extends AppCompatActivity {
    private int soundID1, soundID2, soundID3, soundID4, soundID5, soundID6, soundID7,
            soundID8, soundID9, soundID10, soundID11, soundID12, soundID13, soundID14,
            soundID15, soundID16, soundID17, soundID18, soundID19;
    private ImageView imV11, imV12, imV13, imV21, imV22, imV23,
            imV31, imV32, imV33, imV41, imV42, imV43, imV51, imV52, imV53;
    private SoundPool soundPool;
    private boolean loaded = false;
    private int[] animal_voice = {R.raw.kolokolchik, R.raw.watch_fkblk3vu,
            R.raw.begemot, R.raw.burunduk, R.raw.djatel,
            R.raw.dolphin_, R.raw.enot, R.raw.ezik,
            R.raw.golub, R.raw.guse, R.raw.kaza,
            R.raw.krolik, R.raw.kukushka, R.raw.kuriza,
            R.raw.kuznechik, R.raw.loshad, R.raw.medved};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        init();

    }

    public void init() {
        imV11 = findViewById(R.id.imV11);
        imV12 = findViewById(R.id.imV12);
        imV13 = findViewById(R.id.imV13);
        imV21 = findViewById(R.id.imV21);
        imV22 = findViewById(R.id.imV22);
        imV23 = findViewById(R.id.imV23);
        imV31 = findViewById(R.id.imV31);
        imV32 = findViewById(R.id.imV32);
        imV33 = findViewById(R.id.imV33);
        imV41 = findViewById(R.id.imV41);
        imV42 = findViewById(R.id.imV42);
        imV43 = findViewById(R.id.imV43);
        imV51 = findViewById(R.id.imV51);
        imV52 = findViewById(R.id.imV52);
        imV53 = findViewById(R.id.imV53);

        imV11.setImageResource(R.drawable.begemot2);
        imV12.setImageResource(R.drawable.burunduk);
        imV13.setImageResource(R.drawable.djatel);
        imV21.setImageResource(R.drawable.enot);
        imV22.setImageResource(R.drawable.dolphin);
        imV23.setImageResource(R.drawable.ezik);
        imV31.setImageResource(R.drawable.golub);
        imV32.setImageResource(R.drawable.gusy);
        imV33.setImageResource(R.drawable.koza);
        imV41.setImageResource(R.drawable.krolik);
        imV42.setImageResource(R.drawable.kukushka);
        imV43.setImageResource(R.drawable.kuriza);
        imV51.setImageResource(R.drawable.kuznechik);
        imV52.setImageResource(R.drawable.loshad);
        imV53.setImageResource(R.drawable.medved);

        // связываем кнопку громкости с нашим приложением
        this.setVolumeControlStream(AudioManager.STREAM_MUSIC);

        // создаем SoundPool
        soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);

        // вызываем call-back функцию, которая вызывается по завершении загрузки файла в память
        soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
                Log.e("Test", "sampleId=" + sampleId + " status=" + status);
            }
        });
        loadSounds();
//        soundID1 = soundPool.load(this, animal_voice[3], 1);
//        soundPool.play(soundID1, 1.0f, 1.0f, 1, 0, 1.0f);


    }

    public void loadSounds() {
        soundID1 = soundPool.load(this, animal_voice[2], 1);
        soundID2 = soundPool.load(this, animal_voice[3], 1);
        soundID3 = soundPool.load(this, animal_voice[4], 1);
        soundID4 = soundPool.load(this, animal_voice[5], 1);
        soundID5 = soundPool.load(this, animal_voice[6], 1);
        soundID6 = soundPool.load(this, animal_voice[7], 1);
        soundID7 = soundPool.load(this, animal_voice[8], 1);
        soundID8 = soundPool.load(this, animal_voice[9], 1);
        soundID9 = soundPool.load(this, animal_voice[10], 1);
        soundID10 = soundPool.load(this, animal_voice[11], 1);
        soundID11 = soundPool.load(this, animal_voice[12], 1);
        soundID12 = soundPool.load(this, animal_voice[13], 1);
        soundID13 = soundPool.load(this, animal_voice[14], 1);
        soundID14 = soundPool.load(this, animal_voice[15], 1);
        soundID15 = soundPool.load(this, animal_voice[16], 1);
    }


    public void onClick11(View view) {
        soundPool.play(soundID1, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void onClick12(View view) {
        soundPool.play(soundID2, 1.0f, 1.0f, 1, 0, 1.0f);
    }

    public void onClick13(View view) {
        soundPool.play(soundID3, 1.0f, 1.0f, 1, 0, 1.0f);
    }


    public void onClick21(View view) {
        soundPool.play(soundID4, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick22(View view) {
        soundPool.play(soundID5, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick23(View view) {
        soundPool.play(soundID6, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick31(View view) {
        soundPool.play(soundID7, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick32(View view) {
        soundPool.play(soundID8, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick33(View view) {
        soundPool.play(soundID9, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick41(View view) {
        soundPool.play(soundID10, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick42(View view) {
        soundPool.play(soundID11, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick43(View view) {
        soundPool.play(soundID12, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick51(View view) {
        soundPool.play(soundID13, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick52(View view) {
        soundPool.play(soundID14, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClick53(View view) {
        soundPool.play(soundID15, 1.0f, 1.0f, 1, 0, 1.0f);

    }

    public void onClickNext(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        soundPool.release();
        soundPool = null;
    }

}
