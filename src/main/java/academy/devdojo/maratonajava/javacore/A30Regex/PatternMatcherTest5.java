package academy.devdojo.maratonajava.javacore.A30Regex;
    
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest5 {
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
        // . - 1.3 = 123, 133, 1@3, 1A3
        
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
        String text = "Luffy@hotmail.com, 123jotaro@gmail.com, #@!zoro@gmail.br, teste@gmail.com.br, sakura@mail";
        System.out.println("Email válido: ");
        System.out.println("#@!zoro@gmail.br".matches(regex));
        System.out.println(text.split(",")[1].trim());
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
