package academy.devdojo.maratonajava.javacore.A13Construtores.Test;

import academy.devdojo.maratonajava.javacore.A13Construtores.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Black Clover", "TV", 12, "Ação", "Studio IG");
        anime.imprime();
    }
}
