package academy.devdojo.maratonajava.javacore.A23Polimorfismo.Test;

import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico.RepositorioBancoDeDados;
import academy.devdojo.maratonajava.javacore.A23Polimorfismo.Servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        Repositorio repositorioArquivo = new RepositorioArquivo();
        repositorioArquivo.salvar();

        Repositorio repositorioMemoria = new RepositorioMemoria();
        repositorioMemoria.salvar();
    }
}