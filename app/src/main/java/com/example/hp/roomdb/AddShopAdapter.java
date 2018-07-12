package com.example.hp.roomdb;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class AddShopAdapter extends RecyclerView.Adapter<AddShopAdapter.ViewHolder> {

    ArrayList<Shop> shops;

    public AddShopAdapter(ArrayList<Shop> shops) {
        this.shops = shops;
    }

    @NonNull
    @Override
    public AddShopAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.shop_row,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull AddShopAdapter.ViewHolder holder, int position) {
        holder.shop_title.setText(shops.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return shops.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView shop_title;

        public ViewHolder(View itemView) {
            super(itemView);

            shop_title = itemView.findViewById(R.id.shop_title);
        }
    }
}