package com.nurayim.mybuttonpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public Button button1;
    public Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button2 = findViewById(R.id.onMyButton_click);

        button1 = findViewById(R.id.SetOnClickListener);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Зачем вы нажали ", Toast.LENGTH_SHORT).show();


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Зачем нажали",Toast.LENGTH_SHORT).show();
            }
        });
    }



}





