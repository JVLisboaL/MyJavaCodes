package academy.devdojo.maratonajava.javacore.A30Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest3 {
    public static void main(String[] args) {
        // \d - Todos os digitos
        // \D - Todos os não digitos
        // \s - Espaços em branco \t \n \f \r
        // \S - Todos os caracteres que não são espaços em branco
        // \w - Todos os caracteres alfanumericos [a-zA-Z0-9]
        // \W - Todos os caracteres que não são alfanumericos
        // [] = Conjunto de caracteres

        String regex = "0[xX][0-9a-fA-F]";
        // String text = "abaaba";
        String text2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        System.out.println("Texto:  " + text2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
