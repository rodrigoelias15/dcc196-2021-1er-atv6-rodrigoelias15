package com.example.atividade6;

public class Filmes {
    private String titulo;
    private String estilo;
    private String diretor;
    private Integer ano;
    private boolean visto;
    private boolean assistido;

    public Filmes(String titulo, String estilo, String diretor, Integer ano, boolean visto) {
        this.titulo = titulo;
        this.estilo = estilo;
        this.diretor = diretor;
        this.ano = ano;
        this.visto = visto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
