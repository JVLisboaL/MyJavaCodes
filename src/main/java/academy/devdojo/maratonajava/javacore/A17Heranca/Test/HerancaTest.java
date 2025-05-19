package academy.devdojo.maratonajava.javacore.A17Heranca.Test;

import academy.devdojo.maratonajava.javacore.A17Heranca.Dominio.Endereco;
import academy.devdojo.maratonajava.javacore.A17Heranca.Dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.A17Heranca.Dominio.Pessoa;

    // 0- Bloco de inicialização é estatico da super classe é executado quando a JVM carrega a classe pai
    // 1- Bloco de inicialização é estatico da sub classe é executado quando a JVM carrega a classe filha
    // 2- Alocado espaço em memoria pro objeto da superclasse
    // 3- Cada atributo de superclasse é criado e inicializado com o valor padrão ou o valor que for passado
    // 4- bloco de inicialização da superclasse é executado na ordem em que aparece
    // 5- construtor da superclasse é executado
    // 6- Alocado espaço em memoria pro objeto da subclasse
    // 7- Cada atributo de subclasse é criado e inicializado com o valor padrão ou o valor que for passado
    // 8- bloco de inicialização da subclasse é executado na ordem em que aparece
    // 9- construtor da subclasse é executado

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("41000-000");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Lisboa");
        pessoa.setCpf("11111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("22222222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1000);
        funcionario.imprime();
    }
    
}
