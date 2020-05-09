package com.example.database;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewActivity  extends AppCompatActivity{


    private TextView nameView;
    private TextView pidView;
    private TextView powerView;
    private TextView accuracyView;
    private TextView agilityView;

    @Override
        public void
        onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_view);

            nameView = findViewById(R.id.nameView);
            pidView = findViewById(R.id.pidView);
            powerView = findViewById(R.id.powerView);
            accuracyView = findViewById(R.id.accuracyView);
            agilityView = findViewById(R.id.agilityView);

            DatabaseManager dbm = new DatabaseManager(this);
            Intent i = getIntent();
            String name = i.getStringExtra("NAME");
            //String pid = i.getStringExtra("PID");
            //String[] pidentry = dbm.get(pid);
            String[] entry = dbm.get(name);
            nameView.setText(entry[0]);
            /*pidView.setText(entry[1]);
            if (entry[1] == "1"){
                powerView.setText();
                accuracyView.setText(pidentry[0]);
                agilityView.setText(pidentry[0]);*/

    }

    /*public void editPressed(View v){
        Intent i = new Intent(this, AddActivity.class);
        i.putExtra("ADD", false);
        i.putExtra("NAME", nameView.getText().toString());
        i.putExtra("NICKNAME", nicknameView.getText().toString());
        i.putExtra("FINISHING MOVE", finisherView.getText().toString());
        startActivity(i);
    }*/
}