package com.example.hotelbooking;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list ;

    String Hotel [] = {"Girnar Hotel","Navjiven Hotel","fountane Hotel","Rangoli Hotel","Sarvtom Hotel",
            "bansri Hotel","tulsi Hotel","orange Hotel","Amiras Hotel","Surbhi Hotel"};

    int img[] = {R.drawable.hotel1,R.drawable.hotel2,R.drawable.hotel3,R.drawable.hotel4,R.drawable.hotel5,R.drawable.hotel6,R.drawable.hotel7,
                     R.drawable.hotel8,R.drawable.hotel9,R.drawable.hotel10};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = findViewById(R.id.List);
        ArrayAdapter<String> arr;
        arr = new ArrayAdapter<>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,Hotel);
        list.setAdapter(arr);


    }
}