package academy.devdojo.maratonajava.javacore.A14BlocosDeIniciaização.Test;

import academy.devdojo.maratonajava.javacore.A14BlocosDeIniciaização.Dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.setNome("One Piece");
        anime.setEpisodios(100);
        
        System.out.println("Nome: " + anime.getNome());
        System.out.println("Episódios: " + anime.getEpisodios());
    }
}
