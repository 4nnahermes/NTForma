package br.com.abc.javacore.io.teste;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            //boolean newFile = file.createNewFile();
            //System.out.println(newFile);
            System.out.println(file.createNewFile());
            boolean exists = file.exists();
            System.out.println("Permissão de leitura? " + file.canRead());
            System.out.println("Path? " + file.getPath());
            System.out.println("Path? " + file.getAbsolutePath());
            System.out.println("Diretorio? " + file.isDirectory());
            System.out.println("Hidden? " + file.isHidden());
            System.out.println("Last Modified? " + new Date(file.lastModified()));
            if (exists){
                System.out.println("Deletado? " + file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
