package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Berserk");
        mangas.add("Vinland Saga");
        mangas.add("Attack on Titan");
        mangas.add("Jujutsu Kaisen");
        mangas.add("Black Clover");
        mangas.add("One Piece");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);
        
        Collections.sort(dinheiros);

        for (String manga : mangas) {
            System.out.println(manga);
        }
        System.out.println(dinheiros);
    }
}
