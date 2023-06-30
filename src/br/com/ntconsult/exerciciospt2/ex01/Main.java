package br.com.ntconsult.exerciciospt2.ex01;

import java.util.Scanner;

// 1. Implemente um método que receba um número e imprima o resultado do fatorial deste número.
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int valor = Integer.parseInt(leitor.nextLine());

        MetodoFatorial metodoFatorial = new MetodoFatorial();
        metodoFatorial.imprimeFarorial(valor);
    }
}
