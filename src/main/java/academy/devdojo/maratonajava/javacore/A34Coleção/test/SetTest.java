package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.HashSet;
import java.util.Set;
import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Manga;

public class SetTest {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(1L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(2L, "Berserk", 39.9, 5));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 29.9, 0));
        mangas.add(new Manga(4L, "Vinland Saga", 15.0, 4));
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 15.0, 0));
        mangas.add(new Manga(6L, "Black Clover", 15.0, 7));
  
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
