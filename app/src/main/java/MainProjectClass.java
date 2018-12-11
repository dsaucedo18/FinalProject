import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.danny_mac.myapplication.Leagues;
import com.example.danny_mac.myapplication.R;

public class MainProjectClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button leaguesBtn = (Button) findViewById(R.id.button1);
        leaguesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFixturesScreen();
            }
        });
    }

    public void openFixturesScreen() {
        Intent intent = new Intent(this, Leagues.class);
        startActivity(intent);
    }


    /** This where all the work is going to be at Oscar if you can see this text me
     * This should work completely
     */
    public static void main(String[] unused) {
        System.out.println("okay");
    }
}
