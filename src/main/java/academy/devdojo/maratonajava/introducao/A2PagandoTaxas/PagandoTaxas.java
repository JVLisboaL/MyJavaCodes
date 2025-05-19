package academy.devdojo.maratonajava.introducao.A2PagandoTaxas;

public class PagandoTaxas {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorImposto;
        
        if (salarioAnual <= 34712){
          valorImposto = salarioAnual * taxa1;
        }
        else if (salarioAnual >= 34713 && salarioAnual <= 68507){
          valorImposto = salarioAnual * taxa2;
        }
        else {
          valorImposto = salarioAnual * taxa3;
        }
        System.out.println("O valor do imposto a pagar é: " + valorImposto);
    }
}
