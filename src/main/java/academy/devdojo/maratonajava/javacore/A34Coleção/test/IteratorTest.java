package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Manga;

public class IteratorTest {
    public static void main(String[] args) {
        List<Manga> mangas = new LinkedList<>();
        mangas.add(new Manga(1L, "Attack on Titan", 19.9, 0));
        mangas.add(new Manga(2L, "Berserk", 39.9, 5));
        mangas.add(new Manga(3L, "Hellsing Ultimate", 29.9, 0));
        mangas.add(new Manga(4L, "Vinland Saga", 15.0, 4));
        mangas.add(new Manga(5L, "Jujutsu Kaisen", 15.0, 0));
        mangas.add(new Manga(6L, "Black Clover", 15.0, 7));
        
        Iterator<Manga> mangaIterator = mangas.iterator();
        while (mangaIterator.hasNext()) {
            if (mangaIterator.next().getQuantidade() == 0) {
                mangaIterator.remove();
            }
        }

        System.out.println(mangas);
    }
}
