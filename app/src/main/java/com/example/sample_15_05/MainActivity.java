package com.example.sample_15_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        samplemethod();
    }

    private void samplemethod() {

        String a;
        a="Mahmuthulhasan";
        System.out.println("This is Myname ");

    }
}
