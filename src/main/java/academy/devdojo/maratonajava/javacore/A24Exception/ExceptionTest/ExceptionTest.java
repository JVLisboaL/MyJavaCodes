package academy.devdojo.maratonajava.javacore.A24Exception.ExceptionTest;

import java.io.File;
import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {

    }
    private static void CriarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        try {
            boolean created = file.createNewFile();
            System.out.println("Arquivo criado com sucesso: " + created);
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
