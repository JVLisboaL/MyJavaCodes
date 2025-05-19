package academy.devdojo.maratonajava.javacore.A15ModificadorEstatico.Dominio;

public class Anime {
    private String nome;
    private static int[] episodios;

    // 0- Bloco de inicialização é executado quando a JVM carrega a classe
    // 1- Alocado espaço em memoria pro objeto
    // 2- Cada atributo de classe é criado e inicializado com o valor padrão ou o valor inicializado no bloco de inicialização
    // 3- bloco de inicialização é executado
    // 4- construtor é executado

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : Anime.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
    
}
