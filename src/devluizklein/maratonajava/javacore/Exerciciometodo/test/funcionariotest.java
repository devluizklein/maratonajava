package devluizklein.maratonajava.javacore.Exerciciometodo.test;

import devluizklein.maratonajava.javacore.Exerciciometodo.Funcionario;


public class funcionariotest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "luiz";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{1500, 2000, 2500};

        funcionario.imprimeDados();
        funcionario.mediaSalario();

    }


}
