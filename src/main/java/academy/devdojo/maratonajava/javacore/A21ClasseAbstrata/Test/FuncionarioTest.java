package academy.devdojo.maratonajava.javacore.A21ClasseAbstrata.Test;

import academy.devdojo.maratonajava.javacore.A21ClasseAbstrata.Dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.A21ClasseAbstrata.Dominio.Gerente;


public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("José", 2000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("João", 1000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
