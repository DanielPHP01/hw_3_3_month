package com.example.hw_3_3_month.pizza;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.hw_3_3_month.databinding.FragmentDrinksBinding;

public class DrinksFragment extends Fragment {

    FragmentDrinksBinding binding;
    Pizza pizza;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getExtraFragment();
    }

    private void getExtraFragment() {

    }
}