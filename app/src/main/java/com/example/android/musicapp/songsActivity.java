
package com.example.android.musicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class songsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        TextView album = (TextView) findViewById(R.id.albums);
        album.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(songsActivity.this, albumActivity.class);
                startActivity(intent);
            }
        });


        TextView playlist1 = (TextView) findViewById(R.id.playlist);
        playlist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(songsActivity.this, playlistActivity.class);
                startActivity(intent);
            }
        });


        TextView artist1 = (TextView) findViewById(R.id.artist);
        artist1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(songsActivity.this, artistActivity.class);
                startActivity(intent);
            }
        });
        TextView now1 = (TextView) findViewById(R.id.now);
        now1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(songsActivity.this, nowActivity.class);
                startActivity(intent);
            }
        });
    }

}


