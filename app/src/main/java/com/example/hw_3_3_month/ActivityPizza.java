package com.example.hw_3_3_month;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw_3_3_month.databinding.ActivityPizzaBinding;

import java.util.ArrayList;

import second_example.Pizza;

public class ActivityPizza extends AppCompatActivity {
    ActivityPizzaBinding binding;
    Pizza pizza;
    ArrayList<Pizza> arrayList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityPizzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
getExtra();
    }



    private void getExtra() {
        Intent intent = getIntent();
        String title = intent.getStringExtra("key");
        String desc = intent.getStringExtra("key1");
       int img = intent.getIntExtra("key3",0);
binding.namePizza.setText(title);
binding.descriptionPizza.setText(desc);
binding.pizzaImage.setImageResource(img);
    }

}
