package com.wingled22.androidcrud;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button categoryButton ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryButton = findViewById(R.id.categoryButton);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.categoryButton:
                //
        }
    }

    public void categoryClicked(View view) {
//        Toast toast = Toast.makeText(MainActivity.this,"category button is clicked", Toast.LENGTH_SHORT );
//        toast.show();
        Intent intent = new Intent(this, CategoryActivity.class);
        startActivity(intent);
    }
}