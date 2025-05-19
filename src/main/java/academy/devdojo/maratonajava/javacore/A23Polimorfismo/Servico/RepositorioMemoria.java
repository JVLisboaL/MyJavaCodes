package academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico;

import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    
    @Override
    public void salvar() {
        System.out.println("Salvando em memoria");
    }
}
