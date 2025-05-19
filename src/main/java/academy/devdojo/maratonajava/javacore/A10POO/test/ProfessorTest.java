package academy.devdojo.maratonajava.javacore.A10POO.test;

import academy.devdojo.maratonajava.javacore.A10POO.dominio.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        System.out.println(professor.nome + " " + professor.idade + " " + professor.sexo);
    }
}