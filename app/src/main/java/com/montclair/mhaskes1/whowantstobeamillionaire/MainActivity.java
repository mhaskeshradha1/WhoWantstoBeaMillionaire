package com.montclair.mhaskes1.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Splash Screen to show logo on startup
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goto_gamerules(View view) {
        Intent intent = new Intent(MainActivity.this, gamerules.class);
        startActivity(intent);
    }
}
