package com.example.atividade6;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        Context ctx = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(ctx);
        View filmesView = inflater.inflate(R.layout.filmes_layout, parent, false);
        FilmesViewHolder viewHolder = new FilmesViewHolder(filmesView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmesViewHolder holder, int position) {
        holder.textViewTitulo.setText(filmes.get(position).getTitulo());
        holder.textViewEstilo.setText(filmes.get(position).getEstilo());
        holder.textViewDiretor.setText(filmes.get(position).getDiretor());
        holder.textViewAno.setText(filmes.get(position).getAno().toString());
        holder.textViewVisto.setText(filmes.get(position).getVisto());
    }

    @Override
    public int getItemCount() {
        return filmes.size();
    }

    public class FilmesViewHolder extends RecyclerView.ViewHolder{
        private TextView textViewTitulo;
        private TextView textViewEstilo;
        private TextView textViewDiretor;
        private TextView textViewAno;
        private TextView textViewVisto;
        public FilmesViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitulo = itemView.findViewById((R.id.textViewTitulo));
            textViewEstilo = itemView.findViewById((R.id.textViewEstilo));
            textViewDiretor = itemView.findViewById((R.id.textViewDiretor));
            textViewAno = itemView.findViewById((R.id.textViewAno));
            textViewVisto = itemView.findViewById((R.id.textViewVisto));
        }
    }
}
