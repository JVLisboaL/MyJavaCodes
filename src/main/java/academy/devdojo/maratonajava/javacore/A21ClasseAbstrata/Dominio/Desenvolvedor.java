package academy.devdojo.maratonajava.javacore.A21ClasseAbstrata.Dominio;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void calcularBonus() {
        this.salario = salario + salario * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor [nome=" + nome + ", salario=" + salario + "]";
    }
}
