package devluizklein.maratonajava.javacore.Gassociacao.teste;

import devluizklein.maratonajava.javacore.Gassociacao.dominio.Jogador;
import devluizklein.maratonajava.javacore.Gassociacao.dominio.Time;

public class Jogadortest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador,jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("-_- Jogador -_-");

        jogador.imprime();

        System.out.println("-_- Time -_-");
        time.imprime();
    }
}
