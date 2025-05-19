package academy.devdojo.maratonajava.javacore.A20Enumeracao.Test;

import academy.devdojo.maratonajava.javacore.A20Enumeracao.Dominio.Client;
import academy.devdojo.maratonajava.javacore.A20Enumeracao.Dominio.TipoClient;
import academy.devdojo.maratonajava.javacore.A20Enumeracao.Dominio.TipoPagamento;

public class ClientTest {
    public static void main(String[] args) {
     Client cliente = new Client("João", TipoClient.PESSOA_FISICA, TipoPagamento.DEBITO);
     Client cliente2 = new Client("josé", TipoClient.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        
     System.out.println(cliente);
     System.out.println(cliente2);
     System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
     System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
     TipoClient tipoClient = TipoClient.valueOf("PESSOA_FISICA");
     System.out.println(tipoClient);
    }
}
