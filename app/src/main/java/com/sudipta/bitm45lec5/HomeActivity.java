package com.sudipta.bitm45lec5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Intent intent = getIntent();
        String userInput = intent.getStringExtra("userInput");
        TextView outputTv;
        outputTv = findViewById(R.id.outputTv);
        outputTv.setText(userInput);
    }
}
