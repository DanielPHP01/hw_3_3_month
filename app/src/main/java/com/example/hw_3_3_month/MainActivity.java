package com.example.hw_3_3_month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

import first_example.Planet;
import first_example.PlanetsAdapter;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PlanetsAdapter planetsAdapter;
    ArrayList<Planet> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        fillOurList();
        initRecycler();
    }

    private void fillOurList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Planet("Earth", R.mipmap.ic_launcher_foreground,"15","11"));
        arrayList.add(new Planet("Venera",R.mipmap.ic_foreground,"40","11"));
        arrayList.add(new Planet("Neptune",R.mipmap.ic_neptune_foreground,"50","11"));
        arrayList.add(new Planet("Saturn",R.mipmap.ic_saturn_foreground,"50","11"));
        arrayList.add(new Planet("Jupiter",R.mipmap.ic_jupiter_foreground,"1000000000","11"));
        arrayList.add(new Planet("Mars",R.mipmap.ic_mars_foreground,"20000","11"));
        arrayList.add(new Planet("Mercury",R.mipmap.ic_mercury_foreground,"50000","11"));
    }

    private void initRecycler (){
        planetsAdapter = new PlanetsAdapter(arrayList);
        recyclerView.setAdapter(planetsAdapter);
    }
}