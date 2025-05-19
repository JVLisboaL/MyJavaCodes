package academy.devdojo.maratonajava.javacore.A19ModificadorFinal.Test;

import academy.devdojo.maratonajava.javacore.A19ModificadorFinal.Dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.setNome("BMW");
        System.out.println(carro.getNome());
    }
}
