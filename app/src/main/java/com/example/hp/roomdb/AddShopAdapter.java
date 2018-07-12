package com.example.hp.roomdb;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class AddShopAdapter extends RecyclerView.Adapter<AddShopAdapter.ViewHolder> {

    List<Shop> shops;

    public AddShopAdapter(List<Shop> shops) {
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
        holder.shop_address.setText(shops.get(position).getAddress());
        holder.shop_title.setText(shops.get(position).getTitle());
        holder.shop_tel.setText(shops.get(position).getTel());
        holder.shop_contact_name.setText(shops.get(position).getContact_name());
        holder.shop_worktime.setText(shops.get(position).getWorktime());
    }

    @Override
    public int getItemCount() {
        return shops.size();
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView shop_title;
        public TextView shop_address;
        public TextView shop_tel;
        public TextView shop_contact_name;
        public TextView shop_worktime;

        public ViewHolder(View itemView) {
            super(itemView);

            shop_address = itemView.findViewById(R.id.shop_address);
            shop_title = itemView.findViewById(R.id.shop_title);
            shop_tel = itemView.findViewById(R.id.shop_tel);
            shop_contact_name= itemView.findViewById(R.id.shop_contact_name);
            shop_worktime= itemView.findViewById(R.id.shop_worktime);
        }
    }
}