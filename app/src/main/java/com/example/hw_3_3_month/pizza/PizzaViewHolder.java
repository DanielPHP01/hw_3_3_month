package com.example.hw_3_3_month.pizza;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.databinding.ItemDrinksBinding;
import com.example.hw_3_3_month.databinding.ItemPizzaBinding;

public class PizzaViewHolder extends RecyclerView.ViewHolder {
    ItemPizzaBinding itemPizzaBinding;
    ItemDrinksBinding itemDrinksBinding;

    public PizzaViewHolder(@NonNull ItemDrinksBinding itemDrinksBinding) {
        super(itemDrinksBinding.getRoot());
        this.itemDrinksBinding = itemDrinksBinding;
    }

    public PizzaViewHolder(ItemPizzaBinding itemPizzaBinding) {
        super(itemPizzaBinding.getRoot());
        this.itemPizzaBinding = itemPizzaBinding;
    }

    void OnBind(Pizza pizza) {
        itemPizzaBinding.pricePizza.setText(pizza.getPrice());
        itemPizzaBinding.textViewPizzaName.setText(pizza.getName());
        itemPizzaBinding.pizzaDescription.setText(pizza.getDescription());
        itemPizzaBinding.imagePizza.setImageResource(pizza.getImagePizza());
    }

    void OnDrinkBind (Drinks drinks) {
        itemDrinksBinding.drinksPrice.setText(drinks.getPrice());
        itemDrinksBinding.nameDrinks.setText(drinks.getName());
    }
}
