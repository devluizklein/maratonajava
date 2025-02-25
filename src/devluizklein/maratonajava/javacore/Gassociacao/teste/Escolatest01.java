package devluizklein.maratonajava.javacore.Gassociacao.teste;

import devluizklein.maratonajava.javacore.Gassociacao.dominio.Escola;
import devluizklein.maratonajava.javacore.Gassociacao.dominio.Professor;

public class Escolatest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya sensei");
        Professor professor2 = new Professor("Kakashi sensei");
        Professor[] professores = {professor1,professor2};
        Escola escola = new Escola("Konoha",professores);

        escola.imprime();

    }
}
