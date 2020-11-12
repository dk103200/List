package com.example.lists;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Profile> arrayPro;

    public Adapter(Context context, int layout, ArrayList<Profile> listPro) {
        this.context = context;
        this.layout = layout;
        this.arrayPro = listPro;
    }


    @Override
    public int getCount() {
        return arrayPro.size() ;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null,true);

        TextView txtName = (TextView) convertView.findViewById(R.id.pro_name);
        txtName.setText(arrayPro.get(position).getName());

//        TextView txtDetail = (TextView) convertView.findViewById(R.id.pro_detail);
//        txtDetail.setText(arrayPro.get(position).getDetail());

        ImageView img = (ImageView) convertView.findViewById(R.id.pro_img);
        img.setImageResource(arrayPro.get(position).getHinh());

        return convertView;

    }


}
