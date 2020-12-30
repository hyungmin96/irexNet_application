package com.example.irexnet;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> _lst = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _lst.add("아이템 1");
        _lst.add("아이템 2");
        _lst.add("아이템 3");
        _lst.add("아이템 4");
        _lst.add("아이템 5");
        _lst.add("아이템 6");
        _lst.add("아이템 7");
        _lst.add("아이템 8");

        Adapter adapter = new Adapter(_lst);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

}
