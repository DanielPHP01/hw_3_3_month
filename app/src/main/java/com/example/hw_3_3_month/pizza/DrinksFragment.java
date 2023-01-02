package com.example.hw_3_3_month.pizza;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hw_3_3_month.databinding.FragmentDrinksBinding;

import java.util.ArrayList;

public class DrinksFragment extends Fragment implements OnItemClick {

    FragmentDrinksBinding binding;
    Drinks drinks;
    PizzaAdapter adapter;
    ArrayList<Drinks> arrayList = new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = FragmentDrinksBinding.inflate(getLayoutInflater());
        binding.getRoot();
        fillOurList();
        inisRecycler();
    }

    private void inisRecycler() {
        adapter = new PizzaAdapter(arrayList, this);
        binding.recyclerViewDrinks.setAdapter(adapter);
    }

    private void fillOurList() {
        arrayList.add(new Drinks("COLA",200));
        arrayList.add(new Drinks("COLA",200));
        arrayList.add(new Drinks("COLA",200));
        arrayList.add(new Drinks("COLA",200));
        arrayList.add(new Drinks("COLA",200));
        arrayList.add(new Drinks("COLA",200));
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fillOurList();
        inisRecycler();
    }

    @Override
    public void onClick(Pizza pizza) {

    }
}
