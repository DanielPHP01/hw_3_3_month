package second_example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.MainActivity2;
import com.example.hw_3_3_month.databinding.ItemPizzaBinding;

import java.util.ArrayList;

public class PizzaAdapter extends RecyclerView.Adapter<PizzaViewHolder> {
    ArrayList<Pizza> arrayList;
    OnItemClick onItemClick;


    public PizzaAdapter(ArrayList<Pizza> arrayList,OnItemClick onItemClick) {
        this.arrayList = arrayList;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public PizzaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PizzaViewHolder(ItemPizzaBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PizzaViewHolder holder, int position) {
        holder.OnBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.onClick(holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}




