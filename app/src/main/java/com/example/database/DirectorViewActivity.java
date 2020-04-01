package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class DirectorViewActivity extends AppCompatActivity {

    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_director_view);

        scrollView = findViewById(R.id.scrollView);
        scrollView.removeAllViewsInLayout();
        DatabaseManager dbm = new DatabaseManager(this);
        ArrayList<String> list = dbm.getTitles();
        GridLayout grid = new GridLayout (this);
        grid.setColumnCount(1);
        grid.setRowCount(list.size());
        for(String director : list) {
            TextView text = new TextView(this);
            text.setText(director);
            text.setTextSize(40);
            text.setClickable(true);
            text.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    Intent i = new Intent(getApplicationContext(), ViewActivity.class);
                    i.putExtra("DIRECTOR", ((TextView) view).getText().toString());
                    startActivity(i);
                }
            });
            grid.addView(text);
        }
        scrollView.addView(grid);

    }
}