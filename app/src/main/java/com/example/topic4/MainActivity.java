package com.example.topic4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static String countries[]={"Nepal","India","China","UK","USA","Canada"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listcountries=findViewById(R.id.listcountries);
        ArrayAdapter countryadapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,countries);
    listcountries.setAdapter(countryadapter);
    }
}
