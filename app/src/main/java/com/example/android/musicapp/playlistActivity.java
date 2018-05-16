
package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class playlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);

        TextView song = (TextView) findViewById(R.id.songs);
        song.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(playlistActivity.this, songsActivity.class);
                startActivity(intent);
            }
        });

        TextView album = (TextView) findViewById(R.id.albums);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(playlistActivity.this, albumActivity.class);
                startActivity(intent);
            }
        });


        TextView artist1 = (TextView) findViewById(R.id.artist);
        artist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(playlistActivity.this, artistActivity.class);
                startActivity(intent);
            }
        });
        TextView now1 = (TextView) findViewById(R.id.now);
        now1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(playlistActivity.this, nowActivity.class);
                startActivity(intent);
            }
        });
    }
}


