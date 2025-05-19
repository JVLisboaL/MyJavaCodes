package academy.devdojo.maratonajava.javacore.A16Associação.Test;

import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Time;

public class JogadorTest3 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);
        
        time.setJogadores(jogadores);

        System.out.println("--- Jogador ---");

        jogador.imprime();

        System.out.println("--- Time ---");

        time.imprime();
    }
}
