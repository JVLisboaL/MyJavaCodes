package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.ArrayList;
import java.util.List;

import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Smartphone;

public class SmartphoneListTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = new Smartphone("2ABC2", "samsung");
        Smartphone s3 = new Smartphone("3ABC3", "pixel");

    List<Smartphone> smartphones = new ArrayList<>();
    smartphones.add(s1);
    smartphones.add(s2);
    smartphones.add(s3);

    for (Smartphone smartphone : smartphones) {
        System.out.println(smartphone);
        }
    Smartphone s4 = new Smartphone("3ABC3", "pixel");
    System.out.println(smartphones.contains(s4));
    int indexSmartphone = smartphones.indexOf(s4);
    System.out.println(indexSmartphone);

    }
}