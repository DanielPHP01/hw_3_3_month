package chooser_example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.databinding.ItemChooserBinding;

import java.util.ArrayList;

public class ChooserAdapter extends RecyclerView.Adapter<ChooserViewHolder> {
    ArrayList<Chooser> arrayList;
    OnItemClicker onItemClicker;

    public ChooserAdapter(ArrayList<Chooser> arrayList, OnItemClicker onItemClicker) {
        this.arrayList = arrayList;
        this.onItemClicker = onItemClicker;
    }

    @NonNull
    @Override
    public ChooserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ChooserViewHolder(ItemChooserBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ChooserViewHolder holder, int position) {
        holder.OnBind(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClicker.onClicker(holder.getAdapterPosition());
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
