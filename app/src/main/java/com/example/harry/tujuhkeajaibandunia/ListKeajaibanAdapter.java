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

public class ListKeajaibanAdapter extends RecyclerView.Adapter<ListKeajaibanAdapter.CategoryViewHolder> {
    private Context context;

    public ArrayList<Keajaiban> getListKeajaiban() {
        return listKeajaiban;
    }

    public void setListKeajaiban(ArrayList<Keajaiban> listKeajaiban) {
        this.listKeajaiban = listKeajaiban;
    }

    public ListKeajaibanAdapter(Context context) {
        this.context = context;
    }

    private ArrayList<Keajaiban> listKeajaiban;

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_keajaiban, viewGroup, false);
        return new CategoryViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder categoryViewHolder, int position) {
        categoryViewHolder.tvName.setText(getListKeajaiban().get(position).getName());
        categoryViewHolder.tvRemarks.setText(getListKeajaiban().get(position).getRemarks());
        Glide.with(context)
                .load(getListKeajaiban().get(position).getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(categoryViewHolder.imgPhoto);
    }

    @Override
    public int getItemCount() {
        return getListKeajaiban().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvRemarks;
        ImageView imgPhoto;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvRemarks = itemView.findViewById(R.id.tv_item_remarks);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
