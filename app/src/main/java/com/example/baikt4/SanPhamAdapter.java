package com.example.baikt4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SanPhamAdapter extends BaseAdapter {

    Context context;
    ArrayList<SanPham> list;

    public SanPhamAdapter(Context context, ArrayList<SanPham> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
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
        View row = inflater.inflate(R.layout.item_row, null);

        TextView txtId = row.findViewById(R.id.id_sanpham);
        TextView txtTen = row.findViewById(R.id.id_ten);
        TextView txtGia = row.findViewById(R.id.id_gia);
        ImageView img = row.findViewById(R.id.img_sanpham);

        SanPham sanPham = list.get(position);
        txtId.setText(sanPham.id + "");
        txtTen.setText(sanPham.ten);
        txtGia.setText(sanPham.gia);

        Bitmap bm = BitmapFactory.decodeByteArray(sanPham.anh, 0, sanPham.anh.length);
        img.setImageBitmap(bm);
        return row;
    }
}
