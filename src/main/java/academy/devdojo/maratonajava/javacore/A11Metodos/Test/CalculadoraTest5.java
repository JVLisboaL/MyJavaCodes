package academy.devdojo.maratonajava.javacore.A11Metodos.Test;

import academy.devdojo.maratonajava.javacore.A11Metodos.Dominio.Calculadora;

public class CalculadoraTest5 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1, 2, 3, 4, 5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
    }
}
