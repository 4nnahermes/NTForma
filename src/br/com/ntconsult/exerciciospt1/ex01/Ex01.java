package br.com.ntconsult.exerciciospt1.ex01;

// 1. Imprima todos números pares de 0 a 100. 

public class Ex01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
