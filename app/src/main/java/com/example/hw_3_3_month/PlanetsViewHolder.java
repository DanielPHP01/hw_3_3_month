package com.example.hw_3_3_month;

import android.os.Build;
import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PlanetsViewHolder extends RecyclerView.ViewHolder {
    ImageView imageViewPlanets;
    TextView textViewPlanets;
    TextView radiusView;
    TextView booleanView;

    public PlanetsViewHolder(@NonNull View itemView) {
        super(itemView);
        textViewPlanets = itemView.findViewById(R.id.name_text_view);
        imageViewPlanets = itemView.findViewById(R.id.image_main);
        radiusView = itemView.findViewById(R.id.name_text_view_center_for_radius);
        booleanView = itemView.findViewById(R.id.name_text_view_down_for_boolean);

    }

    void onBind(Planet planet) {
        textViewPlanets.setText(planet.getName());
        imageViewPlanets.setImageResource(planet.getImage());
        radiusView.setText(planet.getRadius());
        booleanView.setText(planet.getLife());
    }

}

