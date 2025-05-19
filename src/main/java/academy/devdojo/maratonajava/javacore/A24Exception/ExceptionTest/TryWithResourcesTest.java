package academy.devdojo.maratonajava.javacore.A24Exception.ExceptionTest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.Reader;
import java.io.IOException;
import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.Leitor;
import academy.devdojo.maratonajava.javacore.A24Exception.Dominio.Leitor2;


public class TryWithResourcesTest {
    public static void main(String[] args) {
        lerArquivo();
    }

    public static void lerArquivo(){
        try (Leitor leitor = new Leitor();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
    public static void lerArquivo2(){
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}