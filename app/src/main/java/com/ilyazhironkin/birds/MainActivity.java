package com.ilyazhironkin.birds;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import androidx.recyclerview.widget.LinearLayoutManager;


public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private BirdAdapter birdAdapter;
    private List<Bird> birdList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        birdList.add(new Bird("Синица", "Маленькая птичка синего цвета"));
        birdList.add(new Bird("Дрозд", "Певчая птица с черным оперением"));

        birdAdapter = new BirdAdapter(birdList);
        recyclerView.setAdapter(birdAdapter);
    }
}