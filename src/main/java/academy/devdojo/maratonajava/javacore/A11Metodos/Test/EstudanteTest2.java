package academy.devdojo.maratonajava.javacore.A11Metodos.Test;

import academy.devdojo.maratonajava.javacore.A11Metodos.Dominio.Estudante;

public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "João";
        estudante.idade = 21;
        estudante.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 20;
        estudante2.sexo = 'F';
    
        estudante.imprime();
        estudante2.imprime();
    }
}
