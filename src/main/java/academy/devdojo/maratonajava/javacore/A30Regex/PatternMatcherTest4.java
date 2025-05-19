package academy.devdojo.maratonajava.javacore.A30Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest4 {
    public static void main(String[] args) {
        // \d - Todos os digitos
        // \D - Todos os não digitos
        // \s - Espaços em branco \t \n \f \r
        // \S - Todos os caracteres que não são espaços em branco
        // \w - Todos os caracteres alfanumericos [a-zA-Z0-9]
        // \W - Todos os caracteres que não são alfanumericos
        // [] - Conjunto de caracteres
        // ? - Zero ou uma ocorrência
        // * - Zero ou mais ocorrências
        // + - Uma ou mais ocorrências
        // {n} - N ocorrências
        // {n, m} - N a m ocorrências
        // () - Grupo
        // | - Ou, exemplo: o(v|c)o = ovo ou oco
        // ^ - Início da linha
        // $ - Fim da linha
        
        String regex = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String text = "12 0x 0X 0xFFABC 0x10G 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Texto:  " + text);
        System.out.println("indice: 0123456789");
        System.out.println("regex: " + regex);
        System.out.println("Posições encontradas: ");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
    }
}
