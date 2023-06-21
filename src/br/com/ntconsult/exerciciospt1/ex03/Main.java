package br.com.ntconsult.exerciciospt1.ex03;
// 3. Crie um método que receba como parâmetro  um texto do tipo String e retorne se este texto é palindromo.

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite uma palava: ");
        String palavra = leitor.nextLine();

        MetodoPalindromo metodo = new MetodoPalindromo();
        metodo.verificaPalindromo(palavra);
    }
}
