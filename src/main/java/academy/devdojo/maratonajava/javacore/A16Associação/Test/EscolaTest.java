package academy.devdojo.maratonajava.javacore.A16Associação.Test;

import academy.devdojo.maratonajava.javacore.A16Associação.Dominio.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya Sensei", "Ninjutsu", null);
        Professor professor2 = new Professor("Kakashi Sensei", "Sharingan", null);
        
        professor1.imprimir();
        professor2.imprimir();
    }
}
