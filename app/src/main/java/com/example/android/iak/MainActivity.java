package com.example.android.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    
    private final static String TAG = MainActivity.class.getSimpleName();

    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";

    private TextView tv_username;
    private TextView tv_password;
    private ImageView iv_picture;
    private String link_picture = "http://st.motortrend.com/uploads/sites/10/2016/08/2017_Nissan_GT_R_gray_11.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");

        tv_username = findViewById(R.id.tv_username);
        tv_password = findViewById(R.id.tv_password);
        iv_picture = findViewById(R.id.iv_picture);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);

        tv_username.setText(username_intent);
        tv_password.setText(password_intent);

        Picasso.with(this)
                .load(link_picture)
                .into(iv_picture, new Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "Berhasil", Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onError() {
                        Toast.makeText(MainActivity.this, "Gagal", Toast.LENGTH_SHORT).show();

                    }
                });
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
