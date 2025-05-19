package academy.devdojo.maratonajava.javacore.A10POO.test;

import academy.devdojo.maratonajava.javacore.A10POO.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "João";
        estudante.idade = 21;
        estudante.sexo = 'M'; 
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo); 
    }
}
