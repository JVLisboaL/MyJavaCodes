package academy.devdojo.maratonajava.javacore.A26Strings;

public class StringBuildTest {
    public static void main(String[] args) {
        String nome = "Luffy";
        nome.concat(" D. Luffy");
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Luffy");
        sb.append(" D. Luffy");
        System.out.println(sb.toString());  
    }
}
