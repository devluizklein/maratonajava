package devluizklein.maratonajava.javacore.Fmodificadoresestaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    // 0 - BLoco de inicializacão é carregado
    // 1 - Alocado espaco em memoria  pro objeto
    // 2 - Cada atributo de classe é criado  e inicializado  com valores default ou o que for i
    // 3 - Bloco de inicialização é executado
    // 4 - Construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
            episodios = new int[100];
            for (int i = 0; i < episodios.length ; i++) {
                episodios[i] = i+1;

            }

    }
    static  {
        System.out.println("Dentro do bloco de inicialização estatico 2");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estatico ");
    }

    public Anime(String nome){this.nome = nome;}

    public Anime() {
        for (int episodio: Anime.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public static int[] getEpisodios() {
        return episodios;
    }
}
