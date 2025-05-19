package academy.devdojo.maratonajava.javacore.A30Regex;

import java.util.Scanner;

public class ScannerTeste2 {
    public static void main(String[] args) {
       String text = "Levi,Eren,Mikasa,true,200";
       Scanner scanner = new Scanner(text);
       scanner.useDelimiter(",");
       while (scanner.hasNext()) {
        if (scanner.hasNextInt()) {
            int i = scanner.nextInt();
            System.out.println("int: " + i);
        } else if (scanner.hasNextBoolean()) {
            boolean b = scanner.nextBoolean();
            System.out.println("boolean: " + b);
        }else{
            System.out.println(scanner.next());
        }
       }
    }
}
