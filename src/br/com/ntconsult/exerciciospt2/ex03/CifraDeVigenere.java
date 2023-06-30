package br.com.ntconsult.exerciciospt2.ex03;

// 3. Implemente a cifra de Vigenère para criptografar e descriptografar uma mensagem.
public class CifraDeVigenere {

    public static void criptografar(String mensagem, String chave) {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char letraMensagem = mensagem.charAt(i);
            char letraChave = chave.charAt(i % chave.length());

            int valorLetraMensagem = (int) letraMensagem - 'A';
            int valorLetraChave = (int) letraChave - 'A';

            int valorCriptografado = (valorLetraMensagem + valorLetraChave) % 26;

            char letraCriptografada = (char) (valorCriptografado + 'A');
            saida.append(letraCriptografada);
        }
        System.out.println("Mensagem ou palavra descriptografada: " + mensagem);
        System.out.println("Mensagem ou palavra criptografada: " + saida);

    }

    public static void descriptografar(String mensagem, String chave) {
        StringBuilder saida = new StringBuilder();

        for (int i = 0; i < mensagem.length(); i++) {
            char letraMensagem = mensagem.charAt(i);
            char letraChave = chave.charAt(i % chave.length());

            int valorLetraMensagem = (int) letraMensagem - 'A';
            int valorLetraChave = (int) letraChave - 'A';

            int valorDescriptografado = (valorLetraMensagem - valorLetraChave + 26) % 26;

            char letraDescriptografada = (char) (valorDescriptografado + 'A');
            saida.append(letraDescriptografada);
        }
        System.out.println("Mensagem ou palavra criptografada: " + mensagem);
        System.out.println("Mensagem ou palavra descriptografada: " + saida);
    }
}

