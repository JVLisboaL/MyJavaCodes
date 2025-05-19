package academy.devdojo.maratonajava.javacore.A20Enumeracao.Dominio;

public class Client {
    
    private String nome;
    private TipoClient tipoClient;
    private TipoPagamento tipoPagamento;

    public Client(String nome, TipoClient tipoClient, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoClient = tipoClient;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Client [nome=" + nome + ", tipoClient=" + tipoClient + ", tipoPagamento=" + tipoPagamento + "]";
    }
}
