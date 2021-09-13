package com.example.atividade6;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewFilmes;
    private List<Filmes> filmes;
    private LinearLayoutManager layoutManager;
    private FilmesAdapter filmesAdapter;
    private ItemTouchHelper.SimpleCallback touchHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmes = new ArrayList<Filmes>(){{
            add(new Filmes("Matrix", "Ficção Científica", "Lana Wachowski, Lilly Wachowski", 1999, "Visto"));
            add(new Filmes("2012", "Ficção Científica", "Roland Emmerich", 2009, "Visto"));
            add(new Filmes("O Silêncio dos Inocentes", "Terror/Suspense", "Jonathan Demme", 1991, "Não Visto"));
            add(new Filmes("A Máscara do Zorro", "Ação/Aventura", "Martin Campbell", 1998, "Visto"));
            add(new Filmes("Jolt", "Ação/Comédia", "Tanya Wexler", 2021, "Não Visto"));
            add(new Filmes("Donnie Darko", "Ficção Científica/Fantasia", " Richard Kelly", 2001, "Visto"));
        }};

        layoutManager = new LinearLayoutManager(this);
        recyclerViewFilmes = findViewById(R.id.recyclerViewFilmes);
        recyclerViewFilmes.setLayoutManager(layoutManager);
        filmesAdapter = new FilmesAdapter(filmes);
        recyclerViewFilmes.setAdapter(filmesAdapter);

        touchHelper = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.ACTION_STATE_IDLE, ItemTouchHelper.RIGHT ) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }

            @Override
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                filmes.remove(viewHolder.getAdapterPosition());
                filmesAdapter.notifyItemRemoved(viewHolder.getAdapterPosition());
            }
        };
        new ItemTouchHelper(touchHelper).attachToRecyclerView(recyclerViewFilmes);
    }
}