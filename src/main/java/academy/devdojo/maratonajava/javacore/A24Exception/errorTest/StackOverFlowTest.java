package academy.devdojo.maratonajava.javacore.A24Exception.errorTest;

public class StackOverFlowTest {
    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade (){
        recursividade();
    }
}