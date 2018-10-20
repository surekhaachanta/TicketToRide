package com.example.suprabhatham.tickettoride;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Player1 extends AppCompatActivity {

    int score1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player1);
    }

    public void player1OneScore(View view) {

        score1 = score1 + 1;
        displayForPlayer1(score1);
    }

    public void player1TwoScore(View view) {

        score1 = score1 + 2;
        displayForPlayer1(score1);
    }
    public void player1ThreeScore(View view) {

        score1 = score1 + 4;
        displayForPlayer1(score1);
    }
    public void player1FourScore(View view) {

        score1 = score1 + 7;
        displayForPlayer1(score1);
    }
    public void player1FiveScore(View view) {

        score1 = score1 + 10;
        displayForPlayer1(score1);
    }
    public void player1SixScore(View view) {

        score1 = score1 + 15;
        displayForPlayer1(score1);
    }

    private void displayForPlayer1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player1_score);
        scoreView.setText("" + score);
    }

    //Reset button code
    public void resetButton(View view) {
        score1 = 0;
        displayForPlayer1(0);
    }
}
