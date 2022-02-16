package com.wingled22.androidcrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button categoryButton ;
    Button fruitsButton ;
    Button productButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryButton = findViewById(R.id.categoryButton);
        fruitsButton = findViewById(R.id.fruitsButton);

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

    public void fruitClicked(View view) {

        //        Toast toast = Toast.makeText(MainActivity.this,"category button is clicked", Toast.LENGTH_SHORT );
//        toast.show();
        Intent intent = new Intent(this, FruitActivity.class);

        startActivity(intent);
    }
}