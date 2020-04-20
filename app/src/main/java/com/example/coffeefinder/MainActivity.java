package com.example.coffeefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String [] coffeeShops = {"Breaking Wave Coffee","The Clever Cup","Foundation Coffee","Mountain Comforts Coffee Cafe"};
        setListAdapter(new ArrayAdapter<String>(this, R.layout.activity_main, R.id.coffee, coffeeShops));
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent(MainActivity.this, Breaking.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, Clever.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, Foundation.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, Mountain.class));
                break;
        }
    }
}
