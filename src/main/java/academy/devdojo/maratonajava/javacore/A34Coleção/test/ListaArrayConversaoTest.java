package academy.devdojo.maratonajava.javacore.A34Coleção.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArrayConversaoTest {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        Integer[] IntegerArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(IntegerArray));

        System.out.println("--------------------------------");

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);

        System.out.println("--------------------------------");

        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        List<Integer> numerosList2 = Arrays.asList(numerosArray);
        numerosList2.set(0,12);
        System.out.println(numerosList2);
    }
}
