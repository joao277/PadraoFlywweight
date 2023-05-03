package com.example;

import java.util.ArrayList;
import java.util.List;

public class Party {
    private List<Jogador> jogadores = new ArrayList<>();

    public void register(String playerName, String playerRegionName, String playerRegionColor){
        Regiao region = RegiaoFactory.getRegion(playerRegionName, playerRegionColor);
        Jogador jogador = new Jogador(playerName, region);
        jogadores.add(jogador);
    }

    public List<String> getJogadores(){
        List<String> output = new ArrayList<String>();

        for(Jogador jogador : jogadores){
            output.add(jogador.getJogador());
        }
        return output;
    }
}