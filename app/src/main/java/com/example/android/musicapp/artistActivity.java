package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class artistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);

        TextView song = (TextView) findViewById(R.id.songs);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artistActivity.this, songsActivity.class);
                startActivity(intent);
            }
        });

        TextView album = (TextView) findViewById(R.id.albums);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artistActivity.this, albumActivity.class);
                startActivity(intent);
            }
        });

        TextView playlist1 = (TextView) findViewById(R.id.playlist);
        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artistActivity.this, playlistActivity.class);
                startActivity(intent);
            }
        });
        TextView now1 = (TextView) findViewById(R.id.now);
        now1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(artistActivity.this, nowActivity.class);
                startActivity(intent);
            }
        });
    }

}


