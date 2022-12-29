package com.example.hw_3_3_month.pizza;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw_3_3_month.R;
import com.example.hw_3_3_month.databinding.ActivityBuyPizzaBinding;

public class BuyPizza extends AppCompatActivity {

    ActivityBuyPizzaBinding binding;

    Pizza pizza;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBuyPizzaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        onGetExtra();
    }


    public void onGetExtra() {
        pizza = (Pizza) getIntent().getSerializableExtra("pizza");

        PizzaFragment pizzaFragment = new PizzaFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("pizza", pizza);
        pizzaFragment.setArguments(bundle);
        getSupportFragmentManager().beginTransaction().replace(R.id.container_fragments, pizzaFragment).commit();
    }
}