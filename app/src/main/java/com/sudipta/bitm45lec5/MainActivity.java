package com.sudipta.bitm45lec5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inputEt;
        Button nextBtn;

        inputEt = findViewById(R.id.inputEt);
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = inputEt.getText().toString();
                if (input.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter Something", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent goToHome = new Intent(MainActivity.this , HomeActivity.class);
                    goToHome.putExtra("userInput", input);
                    startActivity(goToHome);

                }
            }
        });

    }
}
