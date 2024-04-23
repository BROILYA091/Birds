package com.ilyazhironkin.birds;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
public class BirdAdapter extends RecyclerView.Adapter<BirdAdapter.BirdViewHolder> {
    private List<Bird> birds;

    public BirdAdapter(List<Bird> birds) {
        this.birds = birds;
    }

    @Override
    public BirdViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_bird, parent, false);
        return new BirdViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BirdViewHolder holder, int position) {
        Bird bird = birds.get(position);
        holder.textView.setText(bird.getName());
    }

    @Override
    public int getItemCount() {
        return birds.size();
    }

    static class BirdViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public BirdViewHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textView);
        }
    }
}