package academy.devdojo.maratonajava.javacore.A32Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
    public static void main(String[] args) {
        Path path = Paths.get("/home/jvl/Desktop/MaratonaJava");
        try {
            PosixFileAttributes posixFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
            PosixFileAttributeView fileAttributeView = Files.getFileAttributeView(path, PosixFileAttributeView.class);
            Set<PosixFilePermission> posixFilePermissions = PosixFilePermissions.fromString("rw-rw-rw-");
            fileAttributeView.setPermissions(posixFilePermissions);
            System.out.println(posixFileAttributes.permissions());
            System.out.println(fileAttributeView.readAttributes().permissions());
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
