package academy.devdojo.maratonajava.introducao.A8Continue;

public class Continue {
    public static void main(String[] args) {
        double valorCarro = 30000;
        for (int parcela = (int) valorCarro; parcela >= 1; parcela--){
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " = " + valorParcela + "R$");
        }
    }
}