package com.example.danny_mac.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Map;
import java.util.HashMap;

import static android.support.constraint.Constraints.TAG;
import static com.android.volley.VolleyLog.TAG;


public class MainActivity extends Activity implements View.OnClickListener {

    Button leaguesBtn;
    Button fixturesBtn;
    Button scoresBtn;

    public void openFixturesScreen() {
        Intent intent = new Intent(MainActivity.this, Leagues.class);
        startActivity(intent);
    }

    JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(
            Request.Method.GET,
            "",
            null,
            new Response.Listener<JSONObject>() {
                @Override
                public void onResponse(final JSONObject response) {
                    Log.d(TAG, response.toString());
                }
            }, new Response.ErrorListener() {
        @Override
        public void onErrorResponse(final VolleyError error) {
            Log.w(TAG, error.toString());
        }
    }) {
        @Override
        public Map<String, String> getHeaders() {
            Map<String, String>  params = new HashMap<String, String>();
            params.put("\"X-Auth-Token", "c96d93889bad4c9f87acf3317295e340");
            Log.d(TAG, params.toString());
            return params;
        }
    };

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
