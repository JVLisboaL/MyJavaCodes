package academy.devdojo.maratonajava.introducao.A4DiaUtil;

public class DiaUtil {
     public static void main(String[] args) {
        byte dia = 7; 
        switch (dia) {
           case 1:
           case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Útil");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}