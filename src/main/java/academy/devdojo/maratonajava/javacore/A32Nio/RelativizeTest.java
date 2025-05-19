package academy.devdojo.maratonajava.javacore.A32Nio;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest {
    public static void main(String[] args) {
        Path dir = Paths.get("/home/willian");
        Path clazz = Paths.get("/home/william/devdojofoda/OlaMundo.java");
        Path pathToClazz = dir.relativize(clazz);
        System.out.println(pathToClazz);

        Path absoluto = Paths.get("/home/willian");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/willian/devdojofoda/OlaMundo.java");
        Path relativo = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp2021921");

        System.out.println("1 " + absoluto.relativize(absoluto3));
        System.out.println("2 " + absoluto.relativize(absoluto2));
        System.out.println("3 " + absoluto2.relativize(absoluto3));
        System.out.println("4 " + absoluto3.relativize(absoluto));
        System.out.println("5 " + absoluto3.relativize(absoluto2));
        System.out.println("6 " + absoluto2.relativize(absoluto));
        System.out.println("7 " + relativo.relativize(absoluto3));
        System.out.println("8 " + relativo2.relativize(absoluto));
        System.out.println("9 " + absoluto.relativize(relativo));
        
    }
}
