package academy.devdojo.maratonajava.javacore.A24Exception.RuntimeTest;

public class RunTimeExceptionTest2 {
    public static void main(String[] args) {
            divisao(1, 0);

        System.out.println("Programa finalizado");
    }
    /**
     * 
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException se b for zero
     */
    private static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser dividido por zero");
        }
        return a / b;
    }
}
