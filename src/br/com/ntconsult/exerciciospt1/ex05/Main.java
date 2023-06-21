package br.com.ntconsult.exerciciospt1.ex05;

import java.util.Scanner;

import static br.com.ntconsult.exerciciospt1.ex05.GeraMatrizIdentidade.geraMatriz;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        int valor = Integer.parseInt(leitor.nextLine());

        geraMatriz(valor);
    }
}
