package com.example.danny_mac.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button leaguesBtn;
    Button fixturesBtn;
    Button scoresBtn;

    public void openFixturesScreen() {
        Intent intent = new Intent(MainActivity.this, Leagues.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leaguesBtn = (Button) findViewById(R.id.LeagueButton);

        leaguesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openScreen = new Intent(MainActivity.this, Leagues.class);
                startActivity(openScreen);
            }
        });

        fixturesBtn = (Button) findViewById(R.id.FixtureButton);
        fixturesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent openScreen = new Intent(MainActivity.this, )
            }
        });
    }
    @Override
    public void onClick(View v) {

    }
}
