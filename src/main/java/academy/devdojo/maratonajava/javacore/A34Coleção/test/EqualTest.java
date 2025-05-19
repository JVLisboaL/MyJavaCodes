package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import academy.devdojo.maratonajava.javacore.A34Coleção.dominio.Smartphone;

public class EqualTest {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iphone");
        Smartphone s2 = s1;
        // Smartphone s2 = new Smartphone("1ABC1", "iphone"); retorna false
        System.out.println(s1.equals(s2));
    }
}
