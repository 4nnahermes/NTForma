package br.com.ntconsult.exerciciospt2.ex02;

// 2. Implemente a cifra de César para criptografar e descriptografar uma mensagem.
public class CifraDeCesar {

    public static String criptografar(String entrada, int chave) {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            char criptografia = (char) (letra + chave);
            saida.append(criptografia);
        }
        return saida.toString();
    }

    public static String descriptografar(String entrada, int chave) {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < entrada.length(); i++) {
            char letra = entrada.charAt(i);
            char descriptografia = (char) (letra - chave);
            saida.append(descriptografia);
        }
        return saida.toString();
    }
}
