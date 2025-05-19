package academy.devdojo.maratonajava.javacore.A11Metodos.Test;

import academy.devdojo.maratonajava.javacore.A11Metodos.Dominio.Calculadora;

public class CalculadoraTest3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 2);
        System.out.println(resultado);
        System.out.println("--------------------------------");
        calculadora.imprimeDivisaoDeDoisNumeros(20, 3);
    }
}
