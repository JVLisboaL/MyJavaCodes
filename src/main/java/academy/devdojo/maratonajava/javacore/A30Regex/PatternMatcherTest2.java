package academy.devdojo.maratonajava.javacore.A30Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest2 {
    public static void main(String[] args) {
        // \d - Todos os digitos
        // \D - Todos os não digitos
        // \s - Espaços em branco \t \n \f \r
        // \S - Todos os caracteres que não são espaços em branco
        // \w - Todos os caracteres alfanumericos [a-zA-Z0-9]
        // \W - Todos os caracteres que não são alfanumericos

        String regex = "\\w";
        // String text = "abaaba";
        String text2 = "@#hh_j2 12gvh21";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);
        // System.out.println("Texto:  " + text);
        // System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
