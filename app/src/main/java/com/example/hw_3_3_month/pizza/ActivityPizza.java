package com.example.hw_3_3_month.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw_3_3_month.databinding.ActivityPizzaBinding;

import java.util.ArrayList;

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
        getIntentOur();
        binding.btnPizzaBuy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityPizza.this, BuyPizza.class);
                intent.putExtra("pizza", pizza);
                startActivity(intent);
            }
        });
    }

    private void getIntentOur() {
        pizza = (Pizza) getIntent().getSerializableExtra("pizza");
    }

    private void getExtra() {
        Intent intent = getIntent();
        String title = intent.getStringExtra("name");
        String desc = intent.getStringExtra("desc");
        int img = intent.getIntExtra("image", 0);
        binding.namePizza.setText(title);
        binding.descriptionPizza.setText(desc);
        binding.pizzaImage.setImageResource(img);
    }

}
