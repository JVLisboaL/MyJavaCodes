package meus.cadastrosimples;

public class MercadoProdutos { 
    private int id;
    private String nome;
    private double preco;

    public MercadoProdutos(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() { // Método para facilitar a impressão
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
    public void ProdutosDoMercado() {
        System.out.println("Produtos do mercado:");
        System.out.println("ID | Nome | Preço");
        System.out.println("1 | Arroz | 25.50");
        System.out.println("2 | Feijão | 15.00");
        System.out.println("3 | Leite | 8.75");
        System.out.println("4 | Ovo (1 caixa) | 12.20");
        System.out.println("5 | Carne (1 kg) | 55.90");
        System.out.println("6 | Pão | 7.00");
        System.out.println("7 | Macarrão | 4.50");
        System.out.println("8 | Salsicha (1 pacote) | 10.00");
        System.out.println("9 | Refrigerante | 4.00");
        System.out.println("10 | Agua de côco | 4.00");
    }   
}


