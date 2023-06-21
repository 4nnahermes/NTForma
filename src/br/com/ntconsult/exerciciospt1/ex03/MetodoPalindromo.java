package br.com.ntconsult.exerciciospt1.ex03;
// 3. Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.

public class MetodoPalindromo {
    public void verificaPalindromo(String palavra) {
        String palavraContrario = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraContrario += palavra.charAt(i);
        }
        boolean palindromo = true;
        for (int i = 0; i < palavra.length(); i++) {
            if (palavra.charAt(i) != palavraContrario.charAt(i)) {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("Palindromo");
        } else {
            System.out.println("Não é palindromo");
        }
    }
}

