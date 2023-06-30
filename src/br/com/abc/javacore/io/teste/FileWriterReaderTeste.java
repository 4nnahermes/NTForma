package br.com.abc.javacore.io.teste;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTeste {
    public static void main(String[] args) {
        File file = new File("Arquivo.txt");
        try {
            FileWriter fileWriter = new FileWriter(file);
            FileReader fileReader = new FileReader(file);
            fileWriter.write("Escrevendo uma mensagem no arqiovo\nE pulando uma linha");
            fileWriter.flush();
            char[] in = new char[500];
            int size = fileReader.read(in);
            System.out.println("Tamanho: " + size);
            for (char c : in) {
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fileWriter = new FileWriter(file, true);
//            fileWriter.write("Escrevendo uma mensagem no arqiovo\nE pulando uma linha");
//            // usar pra escrita:
//            fileWriter.flush();
//            // usar pra escrita e pra leitura
//            fileWriter.close();
//
//            FileReader fileReader = new FileReader(file);
//            char[] in = new char[500];
//            int size = fileReader.read(in);
//            System.out.println("Tamanho: " + size);
//            for (char c: in){
//                System.out.print(c);
//            }
//            fileReader.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
