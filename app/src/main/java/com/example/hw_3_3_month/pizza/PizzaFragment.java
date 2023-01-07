package com.example.hw_3_3_month.pizza;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hw_3_3_month.databinding.FragmentPizzaBinding;


public class PizzaFragment extends Fragment {

    FragmentPizzaBinding binding;
    Pizza pizza;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentPizzaBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getExtraFragment();
        fillOurList();
    }

    private void getExtraFragment() {
        if (getArguments() != null) {
            pizza = (Pizza) getArguments().getSerializable("pizza");
        }
    }

    private void fillOurList() {
        binding.imagePizza.setImageResource(pizza.getImagePizza());
        binding.namePizza.setText(pizza.getName());
        binding.pricePizza.setText(pizza.getPrice());
    }
}
