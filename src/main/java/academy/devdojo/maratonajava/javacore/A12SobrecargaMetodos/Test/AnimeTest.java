package academy.devdojo.maratonajava.javacore.A12SobrecargaMetodos.Test;

import academy.devdojo.maratonajava.javacore.A12SobrecargaMetodos.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Black Clover", "TV", 12, "Ação");
        anime.imprime();
    }
}
