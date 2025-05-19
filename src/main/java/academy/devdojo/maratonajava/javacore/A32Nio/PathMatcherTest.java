package academy.devdojo.maratonajava.javacore.A32Nio;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest {
    public static void main(String[] args) {
        Path path1 = Paths.get("pasta/subpasta/file.bkb");
        Path path2 = Paths.get("pasta/subpasta2/file.txt");
        Path path3 = Paths.get("pasta/subpasta3/file.java");
        matches(path1, "glob:*.bkb");
        matches(path1, "glob:**.bkb");
        matches(path1, "glob:**/*.bkb");
        matches(path2, "glob:*.txt");
        matches(path2, "glob:**.txt");
        matches(path2, "glob:**/*.txt");
        matches(path3, "glob:*.java");
        matches(path3, "glob:**.java");
        matches(path3, "glob:**/*.java");
    }
    private static void matches(Path path, String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + " " + matcher.matches(path));
    }
}
