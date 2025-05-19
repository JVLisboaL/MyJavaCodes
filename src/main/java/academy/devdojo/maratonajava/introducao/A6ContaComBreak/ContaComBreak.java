package academy.devdojo.maratonajava.introducao.A6ContaComBreak;

public class ContaComBreak {
    public static void main(String[] args) {
        int ValorMaximo = 50;
        for (int i = 0; i <= ValorMaximo; i++){
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
