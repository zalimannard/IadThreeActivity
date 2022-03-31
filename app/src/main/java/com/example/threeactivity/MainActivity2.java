package com.example.threeactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        try
        {
            Bundle extras = getIntent().getExtras();
            String login = extras.getString(MainActivity.LOGIN_KEY);
            TextView loginView = findViewById(R.id.login);
            loginView.setText("Вы вошли как " + login);
        } catch (Exception e)
        {

        }
    }

    public void onClickKot(View view) {
        Intent intent = new Intent(this, MainActivity3.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}