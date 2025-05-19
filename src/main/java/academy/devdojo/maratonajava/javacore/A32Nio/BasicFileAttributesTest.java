package academy.devdojo.maratonajava.javacore.A32Nio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.io.IOException;
import java.nio.file.attribute.FileTime;


public class BasicFileAttributesTest {
    public static void main(String[] args) {
        //BasicFileAttributes, DosFileAttributes, PosixFileAttributes
        LocalDateTime date = LocalDateTime.now().minusDays(10);
        Path path = Paths.get("pasta/arquivo.txt");
        try {
            Files.createFile(path);
            Files.setLastModifiedTime(path, FileTime.from(date.toInstant(ZoneOffset.UTC)));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
