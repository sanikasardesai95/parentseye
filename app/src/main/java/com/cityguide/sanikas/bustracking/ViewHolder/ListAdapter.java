package com.cityguide.sanikas.bustracking.ViewHolder;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.cityguide.sanikas.bustracking.OurData;
import com.cityguide.sanikas.bustracking.R;

public class ListAdapter extends RecyclerView.Adapter {
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_items,viewGroup,false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {
        ((ListViewHolder)viewHolder).bindView(i);
    }

    @Override
    public int getItemCount() {
        return OurData.title.length;
    }
        private class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

            private ImageView mItemImage;
            private TextView mItemText;

            public ListViewHolder(View itemView){
                super(itemView);
                mItemText=(TextView)itemView.findViewById(R.id.text);

            }
            public void bindView(int position){
                mItemText.setText(OurData.title[position]);
                mItemText.setText(OurData.title1[position]);
                mItemImage.setImageResource(OurData.picturePath[position]);
            }

            public void onClick(View view){


        }
    }
}
