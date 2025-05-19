package academy.devdojo.maratonajava.javacore.A31Io;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
    public static void main(String[] args) {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Diretorio criado: " + isDiretorioCreated);
        File fileArquivoDiretorio = new File(fileDiretorio, "file.txt");
        File fileRenamed = new File(fileDiretorio, "fileRenamed.txt");
        File diretorioRenamed = new File("folder2");
        try {
            boolean isFileCreated = fileArquivoDiretorio.createNewFile();
            System.out.println("Arquivo criado: " + isFileCreated);
            boolean isFileRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
            System.out.println("Arquivo renomeado: " + isFileRenamed);
            boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
            System.out.println("Diretorio renomeado: " + isDiretorioRenamed);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
