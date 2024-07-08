package com.example.rahulsir_app1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.GridView;

public class gridPage extends AppCompatActivity {
    GridView gridView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_page);
       
        gridView=findViewById(R.id.grid);
        gridView.setAdapter(new ImageAdapter(this));
    }

}
