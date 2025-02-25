package devluizklein.maratonajava.javacore.Gassociacao.teste;

import devluizklein.maratonajava.javacore.Gassociacao.dominio.Jogador;
import devluizklein.maratonajava.javacore.Gassociacao.dominio.Time;

public class Jogadortest02 {
    public static void main(String[] args) {


    Jogador jogador1 = new Jogador("Garrincha");
    Time time = new Time("Botafogo de futebol e regatas");

    jogador1.setTime(time);

    jogador1.imprime();

}
}