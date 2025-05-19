package academy.devdojo.maratonajava.javacore.A31Io;
//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

public class FileWriterTest {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)){
            fw.write("Hello World");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
