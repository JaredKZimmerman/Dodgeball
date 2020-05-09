package com.example.database;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button playButton;
    private Button viewButton;
    private Button rulesButton;
    private TextView nameb1;
    private TextView nameb2;
    private TextView nameb3;
    private TextView idb1;
    private TextView idb2;
    private TextView idb3;
    private TextView stats1;
    private TextView stats2;
    private TextView stats3;
    private TextView curr1;
    private TextView curr2;
    private TextView curr3;
    private TextView userScoreView;
    private TextView userScore;
    private TextView oppoScoreView;
    private TextView oppoScore;
    private TextView result;
    private int power = 0;
    private int accuracy = 0;
    private int agility = 0;
    private int played = 0;
    private double score = 0;
    private double opponentScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addButton = findViewById(R.id.addButton);
        playButton = findViewById(R.id.playButton);
        viewButton = findViewById(R.id.viewButton);
        rulesButton = findViewById(R.id.rulesButton);
        nameb1 = findViewById(R.id.nameb1);
        nameb2 = findViewById(R.id.nameb2);
        nameb3 = findViewById(R.id.nameb3);
        idb1 = findViewById(R.id.idb1);
        idb2 = findViewById(R.id.idb2);
        idb3 = findViewById(R.id.idb3);
        stats1 = findViewById(R.id.stats1);
        stats2 = findViewById(R.id.stats2);
        stats3 = findViewById(R.id.stats3);
        curr1 = findViewById(R.id.curr1);
        curr2 = findViewById(R.id.curr2);
        curr3 = findViewById(R.id.curr3);
        userScoreView = findViewById(R.id.userScoreView);
        userScore = findViewById(R.id.userScore);
        oppoScoreView = findViewById(R.id.oppoScoreView);
        oppoScore = findViewById(R.id.oppoScore);
        result = findViewById(R.id.result);

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
        if (nameb1.getText() == "Adam" || idb1.getText() == "1") {
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
        if (played == 1) {
            playButton.setText("Add");
            curr1.setText("");
            curr2.setText("");
            curr3.setText("");
            nameb1.setText("Player Name");
            nameb2.setText("Player Name");
            nameb3.setText("Player Name");
            idb1.setText("ID");
            idb2.setText("ID");
            idb3.setText("ID");
            stats1.setText("No Player Selected");
            stats2.setText("No Player Selected");
            stats3.setText("No Player Selected");
            userScoreView.setText("");
            userScore.setText("");
            oppoScoreView.setText("");
            oppoScore.setText("");
        } else {
            if (idb1.getText() == idb2.getText() || idb2.getText() == idb3.getText() || idb1.getText() == idb3.getText()) {
                Toast.makeText(this, "Cannot Have Same Player Twice", Toast.LENGTH_SHORT).show();
            } else {
                playButton.setText("Reset");
                if (idb1.getText() == "1") {
                    curr1.setText("Adam");
                } else if (idb1.getText() == "2") {
                    curr1.setText("Charles");
                } else if (idb1.getText() == "3") {
                    curr1.setText("Dan");
                } else if (idb1.getText() == "4") {
                    curr1.setText("Iori");
                } else if (idb1.getText() == "5") {
                    curr1.setText("James");
                } else if (idb1.getText() == "6") {
                    curr1.setText("Aleister");
                } else if (idb1.getText() == "7") {
                    curr1.setText("Miguel");
                } else if (idb1.getText() == "8") {
                    curr1.setText("Chloe");
                } else if (idb1.getText() == "9") {
                    curr1.setText("Xia");
                }
                if (idb2.getText() == "1") {
                    curr2.setText("Adam");
                } else if (idb2.getText() == "2") {
                    curr2.setText("Charles");
                } else if (idb2.getText() == "3") {
                    curr2.setText("Dan");
                } else if (idb2.getText() == "4") {
                    curr2.setText("Iori");
                } else if (idb2.getText() == "5") {
                    curr2.setText("James");
                } else if (idb2.getText() == "6") {
                    curr2.setText("Aleister");
                } else if (idb2.getText() == "7") {
                    curr2.setText("Miguel");
                } else if (idb2.getText() == "8") {
                    curr2.setText("Chloe");
                } else if (idb2.getText() == "9") {
                    curr2.setText("Xia");
                }
                if (idb3.getText() == "1") {
                    curr3.setText("Adam");
                } else if (idb3.getText() == "2") {
                    curr3.setText("Charles");
                } else if (idb3.getText() == "3") {
                    curr3.setText("Dan");
                } else if (idb3.getText() == "4") {
                    curr3.setText("Iori");
                } else if (idb3.getText() == "5") {
                    curr3.setText("James");
                } else if (idb3.getText() == "6") {
                    curr3.setText("Aleister");
                } else if (idb3.getText() == "7") {
                    curr3.setText("Miguel");
                } else if (idb3.getText() == "8") {
                    curr3.setText("Chloe");
                } else if (idb3.getText() == "9") {
                    curr3.setText("Xia");
                }
                Random random = new Random();
                score = (power * 1.5) + (accuracy * 2) + (agility * 2.5) + (random.nextInt(6) - 3);
                userScoreView.setText("Your Score:");
                userScore.setText(String.format("%.2f", score));
                opponentScore = 10 + (random.nextInt(6) - 3);
                oppoScoreView.setText("Opponent's Score:");
                oppoScore.setText(String.format("%.2f", opponentScore));
                if (score > opponentScore) {
                    result.setText("YOU WIN!!!");
                } else if (score < opponentScore) {
                    result.setText("You Lose :(");
                } else {
                    result.setText("Tie!!!");
                }
            }
        }

    }

    public void showRules(View v){
        Intent i = new Intent(this, RulesActivity.class);
        startActivity(i);
    }

}

