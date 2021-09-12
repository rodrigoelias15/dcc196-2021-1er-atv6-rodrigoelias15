package com.example.atividade6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerViewFilmes;
    List<Filmes> filmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        filmes = new ArrayList<Filmes>(){{
            add(new Filmes("Matrix", "Ficção Científica", "Lana Wachowski, Lilly Wachowski", 1999));
            add(new Filmes("2012", "Ficção Científica", "Roland Emmerich", 2009));
            add(new Filmes("O Silêncio dos Inocentes", "Terror/Suspense", "Jonathan Demme", 1991));
            add(new Filmes("A Máscara do Zorro", "Ação/Aventura", "Martin Campbell", 1998));
            add(new Filmes("Jolt", "Ação/Comédia", "Tanya Wexler", 2021));
            add(new Filmes("Donnie Darko", "Ficção Científica/Fantasia", " Richard Kelly", 2001));
        }

        };

        recyclerViewFilmes = findViewById(R.id.recyclerViewFilmes);
    }
}