package com.gcs.androidjokelibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    private TextView joke_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);

        joke_text = findViewById(R.id.joke_text);

        Intent intent = getIntent();
        String joke = null;
        joke = intent.getStringExtra(getString(R.string.chosenJoke));

        if (joke != null) {
            joke_text.setText(joke);
        } else {
            joke_text.setText("No Joke!");
        }
    }
}
