package com.montclair.mhaskes1.whowantstobeamillionaire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * Game Rules - Text view and logo
 */
public class gamerules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamerules);
    }

    public void goto_quest1(View view) {
        Intent intent = new Intent(this, Question1.class);
        startActivity(intent);
    }
}
