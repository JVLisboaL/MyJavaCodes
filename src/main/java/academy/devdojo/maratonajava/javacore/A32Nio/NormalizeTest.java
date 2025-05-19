package academy.devdojo.maratonajava.javacore.A32Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest {
    public static void main(String[] args) {
        String diretorioProjeto = "home/willian/dev/";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1.normalize());
        Path path2 = Paths.get("home/./willian/./dev/");
        System.out.println(path2.normalize());
    }
}   
