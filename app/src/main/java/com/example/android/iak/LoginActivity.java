package com.example.android.iak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText et_username;
    private EditText et_password;
    private Button btn_cancel;
    private Button btn_login;


    //static final nama variabel huruf besar
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_cancel = findViewById(R.id.btn_cancel);
        btn_login = findViewById(R.id.btn_login);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //short/long untuk durasi

                Toast.makeText(LoginActivity.this, "Keluar dari Aplikasi", Toast.LENGTH_SHORT).show();


            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String username = et_username.getText().toString();
                String password = et_password.getText().toString();

                if (TextUtils.isEmpty(username)) {
                    et_username.setError("Username Harus Diisi!");
                }

                if (TextUtils.isEmpty(password)) {
                    et_password.setError("Username Harus Diisi!");
                }

                if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    finish();
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Username dan Password Salah", Toast.LENGTH_SHORT).show();
                    et_password.getText().clear();
                    et_username.getText().clear();
                }
            }
        });

    }
}
