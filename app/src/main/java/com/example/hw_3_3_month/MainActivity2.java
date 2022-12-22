package com.example.hw_3_3_month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw_3_3_month.databinding.ActivityMain2Binding;

import java.util.ArrayList;

import second_example.OnItemClick;
import second_example.Pizza;
import second_example.PizzaAdapter;

public class MainActivity2 extends AppCompatActivity implements OnItemClick {
    ActivityMain2Binding activityMain2Binding;
    PizzaAdapter pizzaAdapter;
    RecyclerView recyclerView;
    ArrayList<Pizza> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMain2Binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(activityMain2Binding.getRoot());
        fillOurList();
        initRecycler();
    }

    private void initRecycler() {
        pizzaAdapter = new PizzaAdapter(arrayList,this);
        recyclerView.setAdapter(pizzaAdapter);
        activityMain2Binding.recyclerViewPizza.setAdapter(pizzaAdapter);
    }

    private void fillOurList() {
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
        arrayList.add(new Pizza("Маргарита", "400 Сом", "Очень зороошая пицца", R.drawable.ic_launcher_foreground));
    }

    @Override
    public void onClick(int position) {
        Intent intent = new Intent(MainActivity2.this, ActivityPizza.class);
        startActivity(intent);
    }

}