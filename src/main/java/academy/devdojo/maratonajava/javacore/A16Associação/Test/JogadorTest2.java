package academy.devdojo.maratonajava.javacore.A16Associação.Test; 

import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Jogador;
import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Time;

public class JogadorTest2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Brasileira");
        jogador1.setTime(time);
        jogador1.imprime();

    }
}