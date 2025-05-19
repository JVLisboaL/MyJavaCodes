package academy.devdojo.maratonajava.javacore.A16Associação.Test;

import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Aluno;
import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Local;
import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Professor;
import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Seminario;

public class AssociaçãoTest {
    public static void main(String[] args) {
        Local local = new Local("Centro, 123");
        Aluno aluno = new Aluno("João", 21);
        Professor professor = new Professor("Claudio", "Matemática", null);
        Aluno[] alunos = {aluno};
        Seminario seminario = new Seminario("Seminário de Matemática", alunos, local);
        
        Seminario[] seminarios = {seminario};

        professor.setSeminarios(seminarios);

        professor.imprimir();
    }
    
}
