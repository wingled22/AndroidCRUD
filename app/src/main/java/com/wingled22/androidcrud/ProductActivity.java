package com.wingled22.androidcrud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ProductActivity extends AppCompatActivity implements ProductAddFragment.ProductAddListener{

    Button addBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        addBTN = (Button)findViewById(R.id.btnAddProduct);

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ProductActivity.this, "I was clicked", Toast.LENGTH_SHORT).show();
                openDialog();
            }
        });

    }

    public void openDialog(){
        ProductAddFragment productAddFragment  = new ProductAddFragment();
        productAddFragment.show(getSupportFragmentManager(),"Aasdfasd");
    }

    @Override
    public void saveCategory(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}