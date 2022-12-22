package first_example;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw_3_3_month.R;

import java.util.ArrayList;

public class PlanetsAdapter extends RecyclerView.Adapter<PlanetsViewHolder> {
    ArrayList<Planet>arrayListName;
    public PlanetsAdapter(ArrayList<Planet> arrayList) {
        this.arrayListName = arrayList;
    }


    @Override
    public PlanetsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PlanetsViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_planets,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetsViewHolder holder, int position) {
        holder.onBind(arrayListName.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayListName.size();
    }
}
