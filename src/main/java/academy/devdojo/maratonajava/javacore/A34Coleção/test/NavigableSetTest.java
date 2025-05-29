package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.NavigableSet;
import java.util.Comparator;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.m;

import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Smartphone;
import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Manga;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {
    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getIMEI().compareTo(o2.getIMEI());
    }
}
class MangaPrecoComparator implements Comparator<Manga>{

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
    
}
public class NavigableSetTest {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("1234567890", "iPhone 12");
        set.add(smartphone);
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPrecoComparator());
        mangas.add(new Manga(3L, "Attack on Titan", 19.9));
        mangas.add(new Manga(5L, "Berserk", 39.9));
        mangas.add(new Manga(1L, "Hellsing Ultimate", 29.9));
        mangas.add(new Manga(4L, "Vinland Saga", 15.0));
        mangas.add(new Manga(2L, "Jujutsu Kaisen", 15.0));
        mangas.add(new Manga(6L, "Black Clover", 15.0));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        Manga yuyu = new Manga(21L, "Yuyu Hakusho", 20.0);

        //MÉTODOS NAVEGÁVEIS
        //lower <
        //floor <=
        //higher >
        //ceiling >=
        System.out.println("--------------------------------");
        System.out.println(mangas.lower(yuyu));
        System.out.println(mangas.floor(yuyu));
        System.out.println(mangas.higher(yuyu));
        System.out.println(mangas.ceiling(yuyu));
        System.out.println("--------------------------------");
        System.out.println(mangas.size());
        System.out.println(mangas.first());
        System.out.println(mangas.last());
        System.out.println("--------------------------------");
        System.out.println(mangas.pollFirst());
        System.out.println(mangas.pollLast());
    }
}