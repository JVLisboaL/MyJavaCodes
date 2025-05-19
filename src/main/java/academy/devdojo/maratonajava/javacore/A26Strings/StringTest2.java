package academy.devdojo.maratonajava.javacore.A26Strings;

public class StringTest2 {
    public static void main(String[] args) {
        String nome = "Luffy";
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(3));
        System.out.println(nome.length());
        System.out.println(nome.substring(1));
        System.out.println(nome.substring(1, 3));
        System.out.println(nome.replace("Luffy", "Zoro"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.trim());
        System.out.println(nome.equals("Luffy"));
        System.out.println(nome.equals("luffy"));
        System.out.println(nome.equalsIgnoreCase("luffy"));
        
    }
}
