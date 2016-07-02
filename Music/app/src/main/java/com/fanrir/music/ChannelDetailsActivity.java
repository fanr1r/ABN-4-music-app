package com.fanrir.music;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChannelDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_channel_details);

        Button channelDetailsButton = (Button) findViewById(R.id.play_now_button);
        channelDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ChannelDetailsActivity.this, NowPlayingActivity.class);
                startActivity(numbersIntent);
            }
        });

        Button searchButton = (Button) findViewById(R.id.search_button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numbersIntent = new Intent(ChannelDetailsActivity.this, SearchActivity.class);
                startActivity(numbersIntent);
            }
        });
    }
}
