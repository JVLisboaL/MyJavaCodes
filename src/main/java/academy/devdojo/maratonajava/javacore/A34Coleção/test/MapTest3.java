package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Manga;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class MapTest3 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor(1L, "João");
        Consumidor consumidor2 = new Consumidor(2L, "Maria");
        Manga manga1 = new Manga(1L, "Attack on Titan", 19.9, 0);
        Manga manga2 = new Manga(2L, "Berserk", 39.9, 5);
        Manga manga3 = new Manga(3L, "Hellsing Ultimate", 29.9, 0);
        Manga manga4 = new Manga(4L, "Vinland Saga", 15.0, 4);
        Manga manga5 = new Manga(5L, "Jujutsu Kaisen", 15.0, 0);
        Manga manga6 = new Manga(6L, "Black Clover", 15.0, 7);

       List<Manga> mangaConsumidor1 = List.of(manga1, manga2, manga3);
       List<Manga> mangaConsumidor2 = List.of(manga3, manga4);

       Map<Consumidor, List<Manga>> consumidorManga = new HashMap<>();
       consumidorManga.put(consumidor1, mangaConsumidor1);
       consumidorManga.put(consumidor2, mangaConsumidor2);

       for (Map.Entry<Consumidor, List<Manga>> entry : consumidorManga.entrySet()) {   
        System.out.println("---" + entry.getKey().getNome() + "---");
        for (Manga manga : entry.getValue()) {
            System.out.println(manga.getNome());
            }
       }
    }
}
