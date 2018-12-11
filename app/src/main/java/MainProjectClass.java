import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.danny_mac.myapplication.R;

public class MainProjectClass extends AppCompatActivity {

    @Override
    protected void onCrate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /** This where all the work is going to be at Oscar if you can see this text me
     * This should work completely
     */
    public static void main(String[] unused) {
        System.out.println("okay");
    }
}
