package com.example.android.iak;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerviewActivity extends AppCompatActivity {

    private RecyclerView rv_recyclerview;
    private List<NewsPojo> newsList = new ArrayList<>();
    private RecyclerviewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        adapter = new RecyclerviewAdapter();

        rv_recyclerview = findViewById(R.id.rv_recyclerview);
        rv_recyclerview.setLayoutManager(new LinearLayoutManager(this, LinearLayout.VERTICAL, false));
        rv_recyclerview.setAdapter(adapter);

        isiDummyData();
    }

    private void isiDummyData() {
        NewsPojo pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-editable-700x200.png",
                "Ini Bebek",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/11/blog-4-700x200.png",
                "HP Bos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/11/blog-3-700x200.png",
                "Jam Bos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/03/blog-3-700x200.png",
                "Orang Bos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-5-700x200.png",
                "Gorila Bos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);

        pojo = new NewsPojo(
                "http://chopdawg.com/wp-content/uploads/2016/10/blog-1-700x200.png",
                "SuperHero Bos",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
        );

        newsList.add(pojo);



        adapter.setData(newsList);
    }
}
