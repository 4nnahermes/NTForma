package br.com.abc.javacore.io.teste;

import java.io.*;

public class BufferedTeste {
    public static void main(String[] args) throws IOException {
        File file = new File("Arquivo.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            bufferedWriter.write("Escrevendo uma mensagem no arquivo");
            bufferedWriter.newLine();
            bufferedWriter.write("E pulando uma linha");
            bufferedWriter.flush();
            String s;
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        try {
//            FileWriter fileWriter = new FileWriter(file);
//            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
//
//            bufferedWriter.write("Escrevendo uma mensagem no arquivo");
//            bufferedWriter.newLine();
//            bufferedWriter.write("E pulando uma linha");
//            bufferedWriter.flush();
//            bufferedWriter.close();
//
//            FileReader fileReader = new FileReader(file);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String s = null;
//            while ((s = bufferedReader.readLine()) != null){
//                System.out.println(s);
//            }
//            bufferedReader.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
