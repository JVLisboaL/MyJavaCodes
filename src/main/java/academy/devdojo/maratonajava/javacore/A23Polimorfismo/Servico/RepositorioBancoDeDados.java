package academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
