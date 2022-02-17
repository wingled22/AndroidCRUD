package com.wingled22.androidcrud;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProductSampleAdapter extends RecyclerView.Adapter<ProductSampleAdapter.ViewHolder>{



    //create a constructor
    private ArrayList<ProductSample> productArrayList;

    public ProductSampleAdapter(ArrayList<ProductSample> products){
        this.productArrayList = products;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);

        return new ViewHolder(view);
    }

    //this will populate the cell
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //viewHolder.recycleImage.setImageResource(productArrayList.get(i).getImage());
        viewHolder.prodName.setText(productArrayList.get(i).getName());
        viewHolder.prodDesc.setText(productArrayList.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }


    //2: create a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView prodName;
        private TextView prodDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            prodName = (TextView) itemView.findViewById(R.id.prodName);
            prodDesc = (TextView) itemView.findViewById(R.id.prodDesc);
        }


    }


}