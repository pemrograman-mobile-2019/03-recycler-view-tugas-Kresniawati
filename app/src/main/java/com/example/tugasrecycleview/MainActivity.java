package com.example.tugasrecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tugasrecycleview.Adapter.PlaylistAdapter;
import com.example.tugasrecycleview.models.Playlist;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Playlist> playlistList = new ArrayList<>();
        playlistList.add(new Playlist("Lagu_1", "Buka Hatimu","",R.drawable.armada));
        playlistList.add(new Playlist("Lagu_1", "Heart Shaker","",R.drawable.twice));
        playlistList.add(new Playlist("Lagu_1", "Kokobop","",R.drawable.exo));
        playlistList.add(new Playlist("Lagu_1", "Love Scenanrio","",R.drawable.ikon));
        playlistList.add(new Playlist("Lagu_1", "Goodbye Road","",R.drawable.ikon2));


        PlaylistAdapter adapterPlaylist = new PlaylistAdapter(playlistList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Playlist);
        recyclerView.setAdapter(adapterPlaylist;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
