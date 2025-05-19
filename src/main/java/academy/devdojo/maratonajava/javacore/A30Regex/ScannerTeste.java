package academy.devdojo.maratonajava.javacore.A30Regex;

public class ScannerTeste {
    public static void main(String[] args) {
        String text = "Levi, Eren, Mikasa, true, 200";
        String[] names = text.split(",");
        for (String name : names) {
            System.out.println(name.trim());
        }
    }
}
