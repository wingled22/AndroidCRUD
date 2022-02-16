package com.wingled22.androidcrud;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button categoryButton ;
    Button productButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryButton = findViewById(R.id.categoryButton);
        productButton = findViewById(R.id.productButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.categoryButton:
            case R.id.productButton:
                //
        }
    }

    public void categoryClicked(View view) {
//        Toast toast = Toast.makeText(MainActivity.this,"category button is clicked", Toast.LENGTH_SHORT );
//        toast.show();
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }

    public void productClicked(View view) {
//        Toast toast = Toast.makeText(MainActivity.this,"category button is clicked", Toast.LENGTH_SHORT );
//        toast.show();
        Intent intent = new Intent(this, ProductActivity.class);
        startActivity(intent);
    }
}