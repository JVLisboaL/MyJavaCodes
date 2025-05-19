package academy.devdojo.maratonajava.javacore.A10POO.test;

import academy.devdojo.maratonajava.javacore.A10POO.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {    
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro2.nome = "Tesla";
        carro2.modelo = "Model S";
        carro2.ano = "2025";
        
        System.out.println("carro 1: " + carro.nome + " " + carro.modelo + " " + carro.ano);
        System.out.println("carro 2: " + carro2.nome + " " + carro2.modelo + " " + carro2.ano);
    }
}
