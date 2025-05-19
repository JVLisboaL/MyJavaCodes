package academy.devdojo.maratonajava.introducao.A9Array;

public class Array {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{1, 2, 3, 4, 5};
        // for (int i = 0; i < numeros2.length; i++){
        //     System.out.println(numeros3[i]);
        // }
        for(int i : numeros3){
            System.out.println(i);
        }
    }
}