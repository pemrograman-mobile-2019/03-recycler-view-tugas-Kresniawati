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
        playlistList.add(new Playlist("album_1", "UIN Maulana Malik Ibrahim","",R.drawable.uin));


        PlaylistAdapter adapterPlaylist = new PlaylistAdapter(playlistList);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Playlist);
        recyclerView.setAdapter(adapterPlaylist;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
