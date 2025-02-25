package devluizklein.maratonajava.javacore.HExercicioAssociacao.teste01;

import devluizklein.maratonajava.javacore.HExercicioAssociacao.dominio.Aluno;
import devluizklein.maratonajava.javacore.HExercicioAssociacao.dominio.Local;
import devluizklein.maratonajava.javacore.HExercicioAssociacao.dominio.Professor;
import devluizklein.maratonajava.javacore.HExercicioAssociacao.dominio.Seminario;

public class Test01 {
    public static void main(String[] args) {

        Local local = new Local("Long post");
        Aluno aluno = new Aluno("Luffy", 18);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunoparaseminario = {aluno};

        Seminario seminario = new Seminario("Onde achar o one piece", alunoparaseminario, local);
        Seminario[] seminariosdisponiveis = {seminario};

        professor.setSeminarios(seminariosdisponiveis);

        professor.imprime();


    }
}
