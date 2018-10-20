package com.example.suprabhatham.tickettoride;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GameActivity extends AppCompatActivity {
    private Button player1,player2,player3,player4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        player1 = (Button) findViewById(R.id.player1);
        player2 = (Button) findViewById(R.id.player2);
        player3 = (Button) findViewById(R.id.player3);
        player4 = (Button) findViewById(R.id.player4);

        player1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent gotoDetails = new Intent(getApplicationContext(),Player1.class);
                startActivity(gotoDetails);
            }
        });

    }
}
