package academy.devdojo.maratonajava.javacore.A14BlocosDeIniciaização.Dominio;

public class Anime {
    private String nome;
    private int episodios;

    {
        episodios = 100;
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        System.out.println("Dentro do construtor sem argumentos");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios() {
        return episodios;
    }
}
