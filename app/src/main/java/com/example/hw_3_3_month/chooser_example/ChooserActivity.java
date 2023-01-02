package com.example.hw_3_3_month.chooser_example;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hw_3_3_month.R;
import com.example.hw_3_3_month.databinding.ActivityChooserBinding;
import com.example.hw_3_3_month.pizza.MainPizzaActivity;
import com.example.hw_3_3_month.planets.planets.PlanetsActivity;

import java.util.ArrayList;


public class ChooserActivity extends AppCompatActivity implements OnItemClicker {
    ActivityChooserBinding activityChooserBinding;
    ChooserAdapter chooserAdapter;
    ArrayList<Chooser> arrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityChooserBinding = ActivityChooserBinding.inflate(getLayoutInflater());
        setContentView(activityChooserBinding.getRoot());
        fillOurList();
        initRecycler();
    }

    private void initRecycler() {
        chooserAdapter = new ChooserAdapter(arrayList, this);
        activityChooserBinding.recyclerViewChooser.setAdapter(chooserAdapter);
    }

    private void fillOurList() {
        arrayList.add(new Chooser("Planets", R.mipmap.ic_launcher_foreground));
        arrayList.add(new Chooser("Pizza", R.mipmap.ic_margherita));
    }

    @Override
    public void onClicker(int position) {
        chooseIntent(position);
    }

    public void chooseIntent(int position) {
        Intent intent;
        if (position == 0) {
            intent = new Intent(ChooserActivity.this, PlanetsActivity.class);
        } else if (position == 1) {
            intent = new Intent(ChooserActivity.this, MainPizzaActivity.class);
        } else {
            intent = new Intent(ChooserActivity.this, PlanetsActivity.class);
        }
        startActivity(intent);
    }
}
