package com.wingled22.androidcrud;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class FruitActivity extends AppCompatActivity implements FruitAddFragment.FruitAddListener{

    Button addBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);

        addBTN = (Button)findViewById(R.id.btnAddFruit);

        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FruitActivity.this, "I was clicked", Toast.LENGTH_SHORT).show();
                openDialog();
            }
        });



    }

    public void openDialog(){
        FruitAddFragment fruitAddFragment  = new FruitAddFragment();
        fruitAddFragment.show(getSupportFragmentManager(),"Aasdfasd");
    }

    @Override
    public void saveCategory(String name) {
        Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
    }
}