package academy.devdojo.maratonajava.javacore.A24Exception.ExceptionTest;

import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.Pessoa;
import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.LoginInvalidoException;
import java.io.FileNotFoundException;


public class SobrescritaComExceptionTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            pessoa.salvar();
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
