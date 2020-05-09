package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private TextView nameb1;
    private TextView nameb2;
    private TextView nameb3;
    private TextView idb1;
    private TextView idb2;
    private TextView idb3;
    private TextView stats1;
    private TextView stats2;
    private TextView stats3;
    private int power = 0;
    private int accuracy = 0;
    private int agility = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.addButton);
        nameb1 = findViewById(R.id.nameb1);
        nameb2 = findViewById(R.id.nameb2);
        nameb3 = findViewById(R.id.nameb3);
        idb1 = findViewById(R.id.idb1);
        idb2 = findViewById(R.id.idb2);
        idb3 = findViewById(R.id.idb3);
        stats1 = findViewById(R.id.stats1);
        stats2 = findViewById(R.id.stats2);
        stats3 = findViewById(R.id.stats3);

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
    }

    public void viewPlayers(View v) {
        Intent i = new Intent(this, PlayersActivity.class);
        startActivity(i);
    }

    public void addPlayer(View v) {
        if (nameb1.getText() == "Adam" || idb1.getText() == "1"){
            stats1.setText("+4 Power; +0 Accuracy; +0 Agility");
            power = power + 4;
        } else if (nameb1.getText() == "Charles" || idb1.getText() == "2") {
            stats1.setText("+3 Power; +1 Accuracy; +0 Agility");
            power = power + 3;
            accuracy = accuracy + 1;
        } else if (nameb1.getText() == "Dan" || idb1.getText() == "3") {
            stats1.setText("+3 Power; +0 Accuracy; +1 Agility");
            power = power + 3;
            agility = agility + 1;
        } else if (nameb1.getText() == "Iori" || idb1.getText() == "4") {
            stats1.setText("+2 Power; +1 Accuracy; +1 Agility");
            power = power + 2;
            accuracy = accuracy + 1;
            agility = agility + 1;
        } else if (nameb1.getText() == "James" || idb1.getText() == "5") {
            stats1.setText("+1 Power; +2 Accuracy; +1 Agility");
            power = power + 1;
            accuracy = accuracy + 2;
            agility = agility + 1;
        } else if (nameb1.getText() == "Aleister" || idb1.getText() == "6") {
            stats1.setText("+1 Power; +1 Accuracy; +2 Agility");
            power = power + 1;
            accuracy = accuracy + 1;
            agility = agility + 2;
        } else if (nameb1.getText() == "Miguel" || idb1.getText() == "7") {
            stats1.setText("+1 Power; +0 Accuracy; +3 Agility");
            power = power + 1;
            agility = agility + 3;
        } else if (nameb1.getText() == "Chloe" || idb1.getText() == "8") {
            stats1.setText("+0 Power; +1 Accuracy; +3 Agility");
            accuracy = accuracy + 1;
            agility = agility + 3;
        } else if (nameb1.getText() == "Xia" || idb1.getText() == "9") {
            stats1.setText("+0 Power; +0 Accuracy; +4 Agility");
            agility = agility + 4;
        } else {
            Toast.makeText(this, "Invalid Credentials for Team", Toast.LENGTH_SHORT).show();
        }
        if (nameb2.getText() == "Adam" || idb2.getText() == "1") {
            stats2.setText("+4 Power; +0 Accuracy; +0 Agility");
            power = power + 4;
        } else if (nameb2.getText() == "Charles" || idb2.getText() == "2") {
            stats2.setText("+3 Power; +1 Accuracy; +0 Agility");
            power = power + 3;
            accuracy = accuracy + 1;
        } else if (nameb2.getText() == "Dan" || idb2.getText() == "3") {
            stats2.setText("+3 Power; +0 Accuracy; +1 Agility");
            power = power + 3;
            agility = agility + 1;
        } else if (nameb2.getText() == "Iori" || idb2.getText() == "4") {
            stats2.setText("+2 Power; +1 Accuracy; +1 Agility");
            power = power + 2;
            accuracy = accuracy + 1;
            agility = agility + 1;
        } else if (nameb2.getText() == "James" || idb2.getText() == "5") {
            stats2.setText("+1 Power; +2 Accuracy; +1 Agility");
            power = power + 1;
            accuracy = accuracy + 2;
            agility = agility + 1;
        } else if (nameb2.getText() == "Aleister" || idb2.getText() == "6") {
            stats2.setText("+1 Power; +1 Accuracy; +2 Agility");
            power = power + 1;
            accuracy = accuracy + 1;
            agility = agility + 2;
        } else if (nameb2.getText() == "Miguel" || idb2.getText() == "7") {
            stats2.setText("+1 Power; +0 Accuracy; +3 Agility");
            power = power + 1;
            agility = agility + 3;
        } else if (nameb2.getText() == "Chloe" || idb2.getText() == "8") {
            stats2.setText("+0 Power; +1 Accuracy; +3 Agility");
            accuracy = accuracy + 1;
            agility = agility + 3;
        } else if (nameb2.getText() == "Xia" || idb2.getText() == "9") {
            stats2.setText("+0 Power; +0 Accuracy; +4 Agility");
            agility = agility + 4;
        } else {
            Toast.makeText(this, "Invalid Credentials for Team", Toast.LENGTH_SHORT).show();
        }
        if (nameb3.getText() == "Adam" || idb3.getText() == "1") {
            stats3.setText("+4 Power; +0 Accuracy; +0 Agility");
            power = power + 4;
        } else if (nameb3.getText() == "Charles" || idb3.getText() == "2") {
            stats3.setText("+3 Power; +1 Accuracy; +0 Agility");
            power = power + 3;
            accuracy = accuracy + 1;
        } else if (nameb3.getText() == "Dan" || idb3.getText() == "3") {
            stats3.setText("+3 Power; +0 Accuracy; +1 Agility");
            power = power + 3;
            agility = agility + 1;
        } else if (nameb3.getText() == "Iori" || idb3.getText() == "4") {
            stats3.setText("+2 Power; +1 Accuracy; +1 Agility");
            power = power + 2;
            accuracy = accuracy + 1;
            agility = agility + 1;
        } else if (nameb3.getText() == "James" || idb3.getText() == "5") {
            stats3.setText("+1 Power; +2 Accuracy; +1 Agility");
            power = power + 1;
            accuracy = accuracy + 2;
            agility = agility + 1;
        } else if (nameb3.getText() == "Aleister" || idb3.getText() == "6") {
            stats3.setText("+1 Power; +1 Accuracy; +2 Agility");
            power = power + 1;
            accuracy = accuracy + 1;
            agility = agility + 2;
        } else if (nameb3.getText() == "Miguel" || idb3.getText() == "7") {
            stats3.setText("+1 Power; +0 Accuracy; +3 Agility");
            power = power + 1;
            agility = agility + 3;
        } else if (nameb3.getText() == "Chloe" || idb3.getText() == "8") {
            stats3.setText("+0 Power; +1 Accuracy; +3 Agility");
            accuracy = accuracy + 1;
            agility = agility + 3;
        } else if (nameb3.getText() == "Xia" || idb3.getText() == "9") {
            stats3.setText("+0 Power; +0 Accuracy; +4 Agility");
            agility = agility + 4;
        } else {
            Toast.makeText(this, "Invalid Credentials for Team", Toast.LENGTH_SHORT).show();
        }
    }

    public void startGame(View v) {
        if (idb1.getText() == idb2.getText() || idb2.getText() == idb3.getText() || idb1.getText() == idb3.getText()){
            Toast.makeText(this, "Cannot Have Same Player Twice", Toast.LENGTH_SHORT).show();
        } else {
            //same activity
        }
    }

    public void showRules(View v) {
        Intent i = new Intent(this, RulesActivity.class);
        startActivity(i);
    }
        /*Intent i = new Intent(this, AddActivity.class);
        i.putExtra("ADD", true);
        startActivity(i);*/

    /*public void addNickname(View v){
        Intent i = new Intent(this, NicknameActivity.class);
        startActivity(i);
    }
    public void deleteWrestler (View v){
        Intent i = new Intent(this, DeleteActivity.class);
        startActivity(i);
    }*/

}

