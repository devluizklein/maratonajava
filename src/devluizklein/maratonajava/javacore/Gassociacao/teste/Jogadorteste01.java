package devluizklein.maratonajava.javacore.Gassociacao.teste;

import devluizklein.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class Jogadorteste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador jogador3 = new Jogador("Cafu");
        Jogador[] jogadores = {jogador1,jogador2,jogador3};
        for (Jogador jogador : jogadores) {
            jogador.imprime();
            
        }

    }
}
