package com.example.a5j5_exp5;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void Show_main(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
