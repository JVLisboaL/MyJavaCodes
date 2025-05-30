package academy.devdojo.maratonajava.javacore.A32Nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.nio.file.DirectoryStream;
public class ZipOutputStreamTest {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivoParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");
        zip(arquivoZip, arquivoParaZipar);
    }
    private static void zip(Path arquivoZip, Path arquivosParaZipar){   
        try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)){
        for(Path file : directoryStream){
            ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
            zipStream.putNextEntry(zipEntry);
            Files.copy(file, zipStream);
            zipStream.closeEntry();
        }
        System.out.println("Arquivo zipado com sucesso");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
