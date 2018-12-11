import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.danny_mac.myapplication.Leagues;
import com.example.danny_mac.myapplication.R;

public class MainProjectClass extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button leaguesBtn = (Button) findViewById(R.id.LeagueButton);
        leaguesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.d(TAG, "First Button Clicked")
                openFixturesScreen();
            }
        });
    }

    public void openFixturesScreen() {
        Intent intent = new Intent(this, Leagues.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {

    }
}
