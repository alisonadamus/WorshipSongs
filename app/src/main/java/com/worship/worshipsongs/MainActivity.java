package com.worship.worshipsongs;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collection;

public class MainActivity extends AppCompatActivity {
    public ArrayList<Song> songs;
    private EditText searchSongEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        searchSongEditText = findViewById(R.id.searchSongEditText);

        loadSongs();

        ListView songsList = findViewById(R.id.songsList);

        SongAdapter adapter = new SongAdapter(this, songs);
        songsList.setAdapter(adapter);
    }

    private void loadSongs() {
        songs = new ArrayList<>();

        Song song1 = new Song("Been so good");
        Song song2 = new Song("King of my heart");
        Song song3 = new Song("King of kings");

        songs.add(song1);
        songs.add(song2);
        songs.add(song3);
    }

    public void searchSongs(View view) {
        view.setElevation(1);
       // searchSongEditText.setText("");
    }
}
