package com.example.danny_mac.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button leaguesBtn;

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
                //openFixturesScreen(openScreen);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}
