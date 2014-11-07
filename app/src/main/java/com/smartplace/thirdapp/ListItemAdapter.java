package com.smartplace.thirdapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Roberto on 07/11/2014.
 */
public class ListItemAdapter extends BaseAdapter{

    private Context mContext;
    private ArrayList<ListItem> mArrayList;
    private LayoutInflater mLayoutInflater;

    public ListItemAdapter(Context context,ArrayList<ListItem> arrayList){
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mArrayList = arrayList;
    }
    @Override
    public int getCount() {
        return mArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return mArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder;
        View v = view;
        if (v == null) {
            holder = new Holder();
            v = mLayoutInflater.inflate(R.layout.list_item_test, null);
            holder.imageUser = (ImageView)v.findViewById(R.id.image_user);
            holder.txtHeader = (TextView)v.findViewById(R.id.txt_header);
            holder.txtSubHeader = (TextView)v.findViewById(R.id.txt_subheader);
            v.setTag(holder);
        }else {
            holder = (Holder) v.getTag();
        }


        holder.imageUser.setImageDrawable(mArrayList.get(position).getImageUser());
        holder.txtHeader.setText(mArrayList.get(position).getHeader());
        holder.txtSubHeader.setText(mArrayList.get(position).getSubHeader());

        return v;
    }

    static class Holder {
        ImageView imageUser;
        TextView txtHeader;
        TextView txtSubHeader;
    }
}
