package br.com.ntconsult.exerciciospt1.ex02;
// 2. Imprima todos os números primos de 0 a 1000.

public class Ex02 {
    public static void main(String[] args) {

        for (int i = 1; i <= 1000; i++) {
            int cont = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) {
                System.out.println(i);
            }
        }
    }
}


