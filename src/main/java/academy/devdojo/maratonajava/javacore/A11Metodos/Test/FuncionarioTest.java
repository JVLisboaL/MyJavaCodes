package academy.devdojo.maratonajava.javacore.A11Metodos.Test;

import academy.devdojo.maratonajava.javacore.A11Metodos.Dominio.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setIdade(21);
        funcionario.setSalarios(new double[]{1400, 2300, 5000});
        funcionario.imprime();
    }
}
