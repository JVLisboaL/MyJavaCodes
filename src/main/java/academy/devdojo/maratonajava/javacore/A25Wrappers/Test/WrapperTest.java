package academy.devdojo.maratonajava.javacore.A25Wrappers.Test;

public class WrapperTest {
    public static void main(String[] args) {
        Byte byteP = 1;
        Short shortP = 1;
        Integer intP = 1; // autoboxing
        Long longP = 10L;
        Float floatP = 10f;
        Double doubleP = 10d;
        Character charP = 'W';
        Boolean boolean1 = false;

        int i = intP; // unboxing
        Integer intP2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetter('!'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toString('A'));
        System.out.println(Character.toString('A'));
        
    }
}
