package com.example.atividade6;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmesAdapter extends RecyclerView.Adapter<FilmesAdapter.FilmesViewHolder> {
    private final List<Filmes> filmes;

    public FilmesAdapter(List<Filmes> filmes) {
        this.filmes = filmes;
    }

    @NonNull
    @Override
    public FilmesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmesViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FilmesViewHolder extends RecyclerView.ViewHolder{
        public FilmesViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
