package devluizklein.maratonajava.javacore.Dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodio;
    private String genero;

    public Anime(String genero, int episodio, String tipo, String nome) {
        this.nome = nome;
        this.episodio = episodio;
        this.genero = genero;
        this.tipo = tipo;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.episodio);
        System.out.println("-_-_-_-_-_-_-_-");
    }
}
