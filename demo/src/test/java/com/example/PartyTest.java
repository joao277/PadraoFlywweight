package com.example;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;;

class PartyTest {

    @Test
    public void RetornaJogadores() {
        Party party =  new Party();
        party.register("bimba", "Sul", "Preto");
        party.register("bambi", "Norte", "Preto Escuro");
        party.register("tom", "Oeste", "Cinza Claro");

        List<String> output = Arrays.asList(
                "Jogador{nome ='bimba', nome da região de origem ='Sul', cor da região de origem ='Preto'}",
                "Jogador{nome ='bambi', nome da região de origem ='Norte', cor da região de origem ='Preto Escuro'}",
                "Jogador{nome ='tom', nome da região de origem ='Oeste', cor da região de origem ='Cinza Claro'}"
        );

        assertEquals(output, party.getJogadores());
    }

    @Test
    public void retornaTotalRegioes() {
        Party party = new Party();
        party.register("bimba", "Sul", "Preto");
        party.register("bambi", "Norte", "Preto Escuro");
        party.register("tom", "Oeste", "Cinza Claro");
        party.register("mateus", "Leste", "Azul");
        party.register("XxRonaldinhoCraftxX", "Norte", "Vermelho Sangue");
        party.register("Lucas", "Norte", "Azul");

        assertEquals(4, RegiaoFactory.getTotalRegions());
    }
}
