package br.com.abc.javacore.exception.checkedesception.teste;

import java.io.File;
import java.io.IOException;

public class CheckedException {
    public static void main(String[] args) {
        abrirArquivo();
    }

    public static void criarArquivo() throws IOException {
        File file = new File("teste.txt");
        try {
            System.out.println("Arquivo criado? " + file.createNewFile());
            ;
            System.out.println("Arquivo criado");
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    //sempre que cria try, ele precisa de chatch ou finally ou os dois
    //finally SEMPRE é executado
    public static String abrirArquivo() {
        try {
            System.out.println("Abrindo um arquivo");
            System.out.println("Executando a leitura do arquivo");
            //throw new Exception();
            System.out.println("Escrevendo novo arquivo");
            return "valor";
        } catch (Exception e) {
            System.out.println("Dentro do catch");
            e.printStackTrace();
        } finally {
            System.out.println("Fechar o arquivo");
        }
        return null;
    }
}
