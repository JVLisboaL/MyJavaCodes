package academy.devdojo.maratonajava.introducao.A7ParcelasDeCarro;

public class ParcelasDoCarro {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " = " + valorParcela + "R$");
        }
    }
}