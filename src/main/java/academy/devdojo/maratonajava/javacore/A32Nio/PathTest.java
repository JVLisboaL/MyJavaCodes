package academy.devdojo.maratonajava.javacore.A32Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\Dell\\OneDrive\\Área de Trabalho\\MaratonaJava\\folder\\file.txt");
        Path p2 = Paths.get("C:", "Users", "Dell", "OneDrive", "Área de Trabalho", "MaratonaJava", "folder", "file.txt");
        Path p3 = Paths.get("C", "Users", "Dell", "OneDrive", "Área de Trabalho", "MaratonaJava", "folder", "file.txt");
        Path p4 = Paths.get("file.txt");
        System.out.println(p1.getFileName());
        System.out.println(p2.getFileName());
        System.out.println(p3.getFileName());
        System.out.println(p4.getFileName());
    }
}
