package academy.devdojo.maratonajava.javacore.A32Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;

public class DosFileAttributeTest {
    public static void main(String[] args) {
        Path path = Paths.get("pasta/teste.txt");
        try {
            if(Files.notExists(path)){ 
                Files.createFile(path);
            }
            Files.setAttribute(path, "dos:hidden", true);
            Files.setAttribute(path, "dos:readonly", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
