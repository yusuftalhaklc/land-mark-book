package com.yusuftalhaklc.landmarkbook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yusuftalhklc.landmarkbook.Singleton;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yusuftalhaklc.landmarkbook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class LandMarkAdapter extends RecyclerView.Adapter<LandMarkAdapter.LandMarkHolder> {

    ArrayList<LandMark> landMarkArrayList;
    private DetailsActivity binding;

    public LandMarkAdapter(ArrayList<LandMark> landMarkArrayList) {
        this.landMarkArrayList = landMarkArrayList;
    }

    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new LandMarkHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull LandMarkAdapter.LandMarkHolder holder, int position) {
        holder.binding.rcyclerViewTextView.setText(landMarkArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                Singleton singleton = Singleton.getInstance();
                singleton.setChosenLandmark(landMarkArrayList.get(position));
                //intent.putExtra("landmark",landmarkList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return landMarkArrayList.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public LandMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}
