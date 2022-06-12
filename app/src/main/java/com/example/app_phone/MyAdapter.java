package com.example.app_phone;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {


    Context context;
    List<Phone> phone;

    public MyAdapter (Context context, List<Phone> phone){
        this.phone = phone;
        this.context = context;
    }

    @Override
    public int getCount() {
        return phone.size();
    }

    @Override
    public Object getItem(int position) {
        return phone.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
        ImageView potoIm = convertView.findViewById(R.id.imageView);
        TextView namePhone = convertView.findViewById(R.id.namePhone);
        TextView relesYear = convertView.findViewById(R.id.relesYear);
        TextView pricTv = convertView.findViewById(R.id.pricTv);
        Phone p = phone.get(position);
        potoIm.setImageResource(p.getPhotoIm());
        namePhone.setText(p.getName());
        relesYear.setText(p.getModel());
        pricTv.setText(p.getPrice() + "");

        return convertView;

    }
}
