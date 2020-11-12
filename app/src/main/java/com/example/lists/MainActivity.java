package com.example.lists;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridLayout;
import android.widget.ListView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Profile> arrayPro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        arrayPro = new ArrayList<Profile>();

        arrayPro.add(new Profile("Lưu Lý",  "Đà Nẵng","0334897809",R.drawable.pro1));
        arrayPro.add(new Profile("Như Ý",  "Đà Nẵng","0334897809",R.drawable.pro2));
        arrayPro.add(new Profile("Vi Vi",  "Đà Nẵng","0334897809",R.drawable.pro3));
        arrayPro.add(new Profile("Kim Yến",  "Đà Nẵng","0334897809",R.drawable.pro4));
        arrayPro.add(new Profile("Băng Băng",  "Đà Nẵng","0334897809",R.drawable.pro5));
        arrayPro.add(new Profile("Quang Hải",  "Đà Nẵng","0334897809",R.drawable.pro6));
        arrayPro.add(new Profile("Thành Draw",  "Đà Nẵng","0334897809",R.drawable.pro7));
        arrayPro.add(new Profile("Thị Hà",  "Đà Nẵng","0334897809",R.drawable.pro8));
        arrayPro.add(new Profile("Quang Hải",  "Đà Nẵng","0334897809",R.drawable.pro6));
        arrayPro.add(new Profile("Thành Draw",  "Đà Nẵng","0334897809",R.drawable.pro7));
        arrayPro.add(new Profile("Thị Hà",  "Đà Nẵng","0334897809",R.drawable.pro8));
        arrayPro.add(new Profile("Quang Hải",  "Đà Nẵng","0334897809",R.drawable.pro6));
        arrayPro.add(new Profile("Thành Draw",  "Đà Nẵng","0334897809",R.drawable.pro7));
        arrayPro.add(new Profile("Thị Hà",  "Đà Nẵng","0334897809",R.drawable.pro8));
        Adapter adapter = new Adapter(
                MainActivity.this,
                R.layout.item_grid,
                arrayPro
        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent myIntent = new Intent(MainActivity.this , DetailActivity.class);
                startActivity(myIntent);
            }
        });
        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                arrayPro.remove(position);
                listView.setAdapter(adapter);
                return false;
            }
        });
    }
}