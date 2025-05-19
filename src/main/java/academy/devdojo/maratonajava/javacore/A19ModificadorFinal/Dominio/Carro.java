package academy.devdojo.maratonajava.javacore.A19ModificadorFinal.Dominio;

public class Carro {
    public static final double VELOCIDADE_LIMITE = 250;
    private String nome;
    public final Comprador COMPRADOR = new Comprador();

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
