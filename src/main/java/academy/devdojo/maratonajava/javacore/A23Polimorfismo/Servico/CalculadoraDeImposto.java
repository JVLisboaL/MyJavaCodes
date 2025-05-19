package academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Dominio.Produto;

public class CalculadoraDeImposto {
    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto do produto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
    }
}

