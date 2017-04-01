package com.example.dell.custom_adapter_spinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by dell on 2017-04-01.
 */

public class QuocGia_adapter extends BaseAdapter {

    Context context;
    int MyLayout;
    List<QuocGia> ArrayList;

    public QuocGia_adapter(Context context, List<QuocGia> arraList, int myLayout) {
        this.context = context;
        ArrayList = arraList;
        MyLayout = myLayout;
    }

    public QuocGia_adapter(Context context, int myLayout, List<QuocGia> arrayList) {
        this.context = context;
        MyLayout = myLayout;
        ArrayList = arrayList;
    }



    @Override
    public int getCount() {
        return ArrayList.size();
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
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(MyLayout,null);

        TextView txtName =  (TextView) convertView.findViewById(R.id.txtName);
        TextView txtToaDo =  (TextView) convertView.findViewById(R.id.txt_toado);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.imv_Hinh);

        txtName.setText(ArrayList.get(position).Ten);
        txtToaDo.setText(String.valueOf(ArrayList.get(position).ToaDo));
        imageView.setImageResource(ArrayList.get(position).Hinh);
        return convertView;
    }
}
