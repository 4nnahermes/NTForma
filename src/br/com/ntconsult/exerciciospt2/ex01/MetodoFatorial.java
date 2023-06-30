package br.com.ntconsult.exerciciospt2.ex01;

// 1. Implemente um método que receba um número e imprima o resultado do fatorial deste número.
public class MetodoFatorial {
    public void imprimeFarorial(int numero) {
        int fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
