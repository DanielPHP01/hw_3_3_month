package com.example.hw_3_3_month;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.hw_3_3_month.databinding.ActivityChooserBinding;

import java.util.ArrayList;

import chooser_example.Chooser;
import chooser_example.ChooserAdapter;
import chooser_example.OnItemClicker;
import chooser_example.OnItemClicker;

public class ChooserActivity extends AppCompatActivity implements OnItemClicker {
    ActivityChooserBinding activityChooserBinding;
    ChooserAdapter chooserAdapter;
    RecyclerView recyclerView;
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
        chooserAdapter = new ChooserAdapter(arrayList,this);
        activityChooserBinding.recyclerViewChooser.setAdapter(chooserAdapter);
    }

    private void fillOurList() {
        arrayList.add(new Chooser("Planets",R.drawable.ic_launcher_background));
        arrayList.add(new Chooser("Pizza",R.drawable.ic_launcher_background));
    }


    @Override
    public void onClicker(int position) {
        Intent intent = null;
        if (position == 0) {
            intent = new Intent(ChooserActivity.this,MainActivity.class);
        } else if (position == 1){
            intent = new Intent(ChooserActivity.this,MainActivity2.class);
        }
        startActivity(intent);
    }
}