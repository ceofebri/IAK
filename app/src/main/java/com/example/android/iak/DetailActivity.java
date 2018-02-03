package com.example.android.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final  String INTENT_DETAIL = "detail_news";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tv_details = findViewById(R.id.tv_detail);
        String detail_news = getIntent().getStringExtra(INTENT_DETAIL);
        tv_details.setText(detail_news);

    }
}
