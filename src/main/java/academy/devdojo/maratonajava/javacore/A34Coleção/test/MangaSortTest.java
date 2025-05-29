package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Manga;

class MangaByIdComparator implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getId().compareTo(manga2.getId());
    }
}

public class MangaSortTest {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>(6);
        mangas.add(new Manga(1L, "Attack on Titan", 19.9));
        mangas.add(new Manga(2L, "Berserk", 39.9));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 29.9));
        mangas.add(new Manga(4L, "Vinland Saga", 15.0));
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 15.0));
        mangas.add(new Manga(6L, "Black Clover", 15.0));
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Collections.sort(mangas, new MangaByIdComparator());
        System.out.println("--------------------------------");
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
    }
}
