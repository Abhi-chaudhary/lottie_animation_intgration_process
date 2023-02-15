package com.example.lottie_intigration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // if wana run animation from java file
        // use setAnimation(R.raw.file_name)
        // then use playAnimation()
    }
}