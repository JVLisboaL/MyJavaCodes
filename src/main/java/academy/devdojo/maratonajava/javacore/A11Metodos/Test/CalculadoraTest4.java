package academy.devdojo.maratonajava.javacore.A11Metodos.Test;

import academy.devdojo.maratonajava.javacore.A11Metodos.Dominio.Calculadora;

public class CalculadoraTest4 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("Dentro do CalculadoraTest4");
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}
