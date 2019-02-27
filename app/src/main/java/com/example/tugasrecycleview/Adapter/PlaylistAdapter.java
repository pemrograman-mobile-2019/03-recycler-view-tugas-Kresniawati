package com.example.tugasrecycleview.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasrecycleview.R;
import com.example.tugasrecycleview.models.Playlist;
import com.squareup.picasso.Picasso;

import java.util.List;

public class PlaylistAdapter extends RecyclerView<PlaylistAdapter.ViewHolder> {
    private List<Playlist> playlistList;

    public PlaylistAdapter(List<Playlist> playlistList){
        this.playlistList = playlistList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup  viewGroup, int i){
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View filmView = inflater.inflate(R.layout.item_playlist, viewGroup, false);

        return new ViewHolder(filmView) {
        }
        @Override
                public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i){
                Playlist playlist = playlistList.get(i);

            if (playlist.getImg() != null) {
                Picasso.get().load(playlist.getImg()).into(viewHolder.imageView);
            } else {
                Picasso.get().load(playlist.getImg_local()).into(viewHolder.imageView);
            }

            viewHolder.textView.setText(playlist.getTitle());
        }
        @Override
        public int getItemCount() {
            return playlistList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            ImageView imageView;
            TextView textView;
            TextView descView;

            ViewHolder(@NonNull View itemView) {
                super(itemView);
                imageView = itemView.findViewById(R.id.item_playlist_img);
                textView = itemView.findViewById(R.id.item_playlist_title);
                descView = itemView.findViewById(R.id.item_playlist_title_desc);
            }

        }