package academy.devdojo.maratonajava.javacore.A26Strings;

public class StringTest {
    public static void main(String[] args) {
        String nome = "William"; // String constante pool de strings
        String nome2 = "William";
        nome = nome.concat(" Silva");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referencia, 2 objeto do tipo String, 3 uma string na pool de strings

        System.out.println(nome2 == nome3);
        System.out.println(nome2 == (nome3.intern()));
        
    }  
}
