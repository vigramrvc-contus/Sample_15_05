package com.example.sample_15_05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

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


        // smaple changes by viki

        Timestamp timestamp=new Timestamp(System.currentTimeMillis());
        Toast.makeText(this, timestamp.toString(), Toast.LENGTH_SHORT).show();

    }
}
