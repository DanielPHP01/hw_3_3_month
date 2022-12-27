package com.example.hw_3_3_month.planets.planets;

import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.R;

public class PlanetsViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewPlanets;
    TextView textViewPlanets;
    TextView radiusView;
    TextView booleanView;
    TextView check;
    TextView age;
    TextView life;

    public PlanetsViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPlanets = itemView.findViewById(R.id.name_text_view);
        imageViewPlanets = itemView.findViewById(R.id.image_main);
        radiusView = itemView.findViewById(R.id.name_text_view_center_for_radius);
        //check = itemView.findViewById(R.id.name_text_view_down_for_boolean);
        life = itemView.findViewById(R.id.name_text_view_down_for_boolean);
    }

    void onBind(Planet planet) {
        textViewPlanets.setText(planet.getName());
        imageViewPlanets.setImageResource(planet.getImage());
        radiusView.setText(planet.getRadius());
        life.setText(planet.getLife());
    }
}

