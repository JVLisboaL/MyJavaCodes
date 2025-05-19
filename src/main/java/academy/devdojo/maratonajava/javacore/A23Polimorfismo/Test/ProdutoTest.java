package academy.devdojo.maratonajava.javacore.A23Polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Dominio.Computador;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Dominio.Televisão;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Dominio.Tomate;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico.CalculadoraDeImposto;

public class ProdutoTest {
    public static void main(String[] args) {
        Computador computador = new Computador("Computador", 10000);
        Tomate tomate = new Tomate("Tomate", 10);
        Televisão televisão = new Televisão("Televisão", 5000);
        CalculadoraDeImposto.calcularImposto(computador);
        System.out.println("--------------------------------");
        CalculadoraDeImposto.calcularImposto(tomate);
        System.out.println("--------------------------------");
        CalculadoraDeImposto.calcularImposto(televisão);
    }
}