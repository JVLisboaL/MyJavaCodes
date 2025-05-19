package academy.devdojo.maratonajava.javacore.A11Metodos.Dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

public void imprime() {
    System.out.println(this.nome);
    System.out.println(this.idade);
    if (salarios == null) {
        return;
    }
    for (double salario : this.salarios) {
        System.out.println(salario + " ");
    }
    mediaSalarios();
}
    public void mediaSalarios() {
        if (salarios == null){
            return;
        }
        for(double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média dos salários: " + media);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double[] getSalarios() {
        return salarios;
    }
    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }
    public double getMediaSalarios() {
        return media;
    }
}
