package com.example.android.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    
    private final static String TAG = MainActivity.class.getSimpleName();

    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";

    private TextView tv_username;
    private TextView tv_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");

        tv_username = findViewById(R.id.tv_username);
        tv_password = findViewById(R.id.tv_password);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);

        tv_username.setText(username_intent);
        tv_password.setText(password_intent);
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }
}
