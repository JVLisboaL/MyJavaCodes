package meus.jogoadivinha;

import java.util.Random;
import java.util.Scanner;

public class JogoAdvinhaCao {
    public static void main(String[] args) {

        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número secreto entre 1 e 100.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Deseja começar o jogo? (s/n): ");
        String inicio = scanner.next().trim().toLowerCase();
        if (inicio.equals("s")) {
            do {
                jogar(scanner);
            } while (querJogarNovamente(scanner));
        }
        else if (inicio.equals("n")){
            System.out.println("Voce não quer começar o jogo, obrigado por participar!");
        }
        else{
            System.out.println("Resposta inválida, digite s ou n");
            querJogarNovamente(scanner);
        }
        scanner.close();
    }
    
    static void jogar(Scanner scanner){
        int tentativas = 8;
        int quantidadeDeErros = 0;
        int numeroSecreto = geraNumeroSecreto();
        int palpite;
        
        while (tentativas > 0) {
            System.out.println("Você tem " + tentativas + " tentativas restantes ");
            palpite = lerChute(scanner, tentativas);
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou!! O número secreto era " + numeroSecreto + ", você acertou em " + (8 - tentativas + 1) + " tentativas.");
                break;
            } else if (palpite < numeroSecreto) {
                quantidadeDeErros++;
                System.out.println("Tente um número maior.");
            } else {
                quantidadeDeErros++;
                System.out.println("Tente um número menor.");
            }
            tentativas--;
        }
        if (tentativas == 0) {
            System.out.println("Você esgotou suas tentativas. O número secreto era " + numeroSecreto + ".");
        }
        avaliarDesempenho(tentativas, quantidadeDeErros);

    }
    public static int geraNumeroSecreto() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
    public static int lerChute(Scanner scanner, int tentativas) {
        while (true) {
            System.out.print("Digite seu palpite: ");
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                scanner.next();
            }
        }
    }
    public static void avaliarDesempenho(int tentativas, int quantidadeDeErros) {
        
        if (tentativas >= 6){
            System.out.println("Seu chute foi excelente! restaram " + tentativas + " tentativas");
        }
        else if (tentativas >= 4){
            System.out.println("Seu chute foi muito bom! restaram " + tentativas + " tentativas");
        }
        else if (tentativas >= 2){
            System.out.println("Seu chute foi no limite! restaram apenas " + tentativas + " tentativas");
        }
        else if (tentativas == 1){
            System.out.println("Seu chute foi muito ruim! restaram apenas " + tentativas + " tentativas");
        }
        else if (tentativas == 0){
            System.out.println("Você não acertou nenhuma vez! não restaram tentativas");
        }

        double taxaDeErros = (quantidadeDeErros / 8.0) * 100;
        System.out.printf("Você errou %d vezes, o que representa %.2f%% das tentativas.%n", quantidadeDeErros, taxaDeErros);

    }
    static boolean querJogarNovamente(Scanner scanner){
        System.out.print("Deseja jogar novamente? (s/n): ");
        String resposta = scanner.next().trim().toLowerCase();
        if(resposta.equals("s")){
            return true;
        }
        else{
            System.out.println("Voce não quer começar o jogo, obrigado por participar!");
            return false;
        }
        
    }
}