package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class PlayersActivity extends AppCompatActivity {

    private ScrollView scrollView1;
    private ScrollView scrollView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_view);

        scrollView1 = findViewById(R.id.scrollView1);
        scrollView1.removeAllViewsInLayout();
        scrollView2 = findViewById(R.id.scrollView2);
        scrollView2.removeAllViewsInLayout();

        DatabaseManager dbm = new DatabaseManager(this);
        dbm.insert("Adam", 1);
        dbm.insert("Charles", 2);
        dbm.insert("Dan", 3);
        dbm.insert("Iori", 4);
        dbm.insert("James", 5);
        dbm.insert("Aleister", 6);
        dbm.insert("Miguel", 7);
        dbm.insert("Chloe", 8);
        dbm.insert("Xia", 9);

        ArrayList<String> list1 = dbm.getNames();
        GridLayout grid1 = new GridLayout (this);
        grid1.setColumnCount(1);
        grid1.setRowCount(9);
        for(String name : list1) {
            TextView text = new TextView(this);
            text.setText(name);
            text.setTextSize(40);
            grid1.addView(text);
        }
        ArrayList<String> list2 = dbm.getPID();
        GridLayout grid2 = new GridLayout (this);
        grid2.setColumnCount(1);
        grid2.setRowCount(9);
        for(String pid : list2) {
            TextView text = new TextView(this);
            text.setText(pid);
            text.setTextSize(40);
            grid2.addView(text);
        }
        scrollView1.addView(grid1);
        scrollView2.addView(grid2);
    }
}
