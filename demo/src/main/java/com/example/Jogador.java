package com.example;

public class Jogador {
    private String name;
    private Regiao regionOrigin;

    public Jogador(String name, Regiao region){
        this.name = name;
        this.regionOrigin = region;
    }

    public String getJogador(){
        return "Jogador{" +
                "nome ='" + this.name + '\'' +
                ", nome da região de origem ='" + regionOrigin.getName() + '\'' +
                ", cor da região de origem ='" + regionOrigin.getColor() + '\'' +
                '}';
    }
}