package com.example.harry.tujuhkeajaibandunia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKeajaibanAdapter extends RecyclerView.Adapter<GridKeajaibanAdapter.GridViewHolder>{
    private Context context;
    private ArrayList<Keajaiban> listKeajaiban;


    public ArrayList<Keajaiban> getListKeajaiban() {
        return listKeajaiban;
    }

    public void setListKeajaiban(ArrayList<Keajaiban> listKeajaiban) {
        this.listKeajaiban = listKeajaiban;
    }

    public GridKeajaibanAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_keajaiban, parent, false);
        return new GridViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GridViewHolder holder, int position) {
        holder.tvName.setText(getListKeajaiban().get(position).getName());
        Glide.with(context)
                .load(getListKeajaiban().get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListKeajaiban().size();
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
        }
    }
}
