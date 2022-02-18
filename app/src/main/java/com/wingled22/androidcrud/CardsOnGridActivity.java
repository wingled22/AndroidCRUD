package com.wingled22.androidcrud;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CardsOnGridActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    ArrayList<ProductSample> productArrayList = new ArrayList<ProductSample>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cards_on_grid);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        populateArrayList();


        ProductSampleAdapter adapter  = new ProductSampleAdapter(productArrayList);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    //populate the arraylist of prod
    private void populateArrayList(){
        int iddd = (R.drawable.pizza);
        int image = (R.drawable.image);
        ProductSample a = new ProductSample(1, "Prod 1", "the quick brown fox the lazy dog",iddd);
        productArrayList.add(a);
        ProductSample b = new ProductSample(2, "Prod 2", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(b);
        ProductSample c = new ProductSample(3, "Prod 3", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(c);
        ProductSample d = new ProductSample(4, "Prod 4", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(d);
        ProductSample e = new ProductSample(5, "Prod 5", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(e);
        ProductSample f = new ProductSample(6, "Prod 6", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(f);
        ProductSample h = new ProductSample(7, "Prod 7", "the quick brown fox the lazy dog",iddd );
        productArrayList.add(h);
        ProductSample i = new ProductSample(8, "Prod 8", "the quick brown fox the lazy dog",image );
        productArrayList.add(i);

    }
}
