package academy.devdojo.maratonajava.javacore.A20Enumeracao.Dominio;

public enum TipoPagamento {
    DEBITO {
        @Override 
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO {
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };
    public abstract double calcularDesconto(double valor);
}
