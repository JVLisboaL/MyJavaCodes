package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();  
        List<String> nomes2 = new ArrayList<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Pedro");
        nomes2.add("Lisboa");
        nomes2.add("Porto");
        nomes2.add("Braga");

        nomes.addAll(nomes2);

        for (String nome : nomes) {
            System.out.println(nome);
        }
        nomes.add("Girão");
        System.out.println("--------------------------------");
        for(int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }
    }
}
