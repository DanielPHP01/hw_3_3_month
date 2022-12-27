package com.example.hw_3_3_month.chooser_example;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.databinding.ItemChooserBinding;

public class ChooserViewHolder extends RecyclerView.ViewHolder {
    ItemChooserBinding itemChooserBinding;

    public ChooserViewHolder(@NonNull ItemChooserBinding itemChooserBinding) {
        super(itemChooserBinding.getRoot());
        this.itemChooserBinding = itemChooserBinding;
    }

    void OnBind(Chooser chooser) {
        itemChooserBinding.textAppName.setText(chooser.getName());
        itemChooserBinding.imageApp.setImageResource(chooser.getImage());
    }
}
