package academy.devdojo.maratonajava.javacore.A33Serialization.test;

import academy.devdojo.maratonajava.javacore.A33Serialization.dominio.Aluno;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.io.ObjectInputStream;
import academy.devdojo.maratonajava.javacore.A33Serialization.dominio.Turma;
public class SerializaçãoTest {
    public static void main(String[] args) {
        Turma turma = new Turma("Maratona Java virado no jiraya");
        Aluno aluno = new Aluno(1L, "William", "123456", turma);
        aluno.setTurma(turma);  
        serializar(aluno);
        deserializar();
    }
    private static void serializar(Aluno aluno) {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(aluno);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void deserializar() {
        Path path = Paths.get("pasta/aluno.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Aluno aluno = (Aluno) ois.readObject();
            System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}