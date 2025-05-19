package academy.devdojo.maratonajava.javacore.A22Interfaces.Test;

import academy.devdojo.maratonajava.javacore.A22Interfaces.Dominio.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.A22Interfaces.Dominio.FileLoadar;

public class DataLoaderTest {
    public static void main(String[] args) {
        DataBaseLoader dataLoader = new DataBaseLoader();
        FileLoadar fileLoadar = new FileLoadar();
        
        dataLoader.load();
        fileLoadar.load();
    }
}
