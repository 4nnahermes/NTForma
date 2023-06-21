package br.com.ntconsult.exerciciospt1.ex05;

public class GeraMatrizIdentidade {
    public static int[][] geraMatriz(int valor) {
        int[][] matriz = new int[valor][valor];
        String value = "";

        for (int i = 0; i < valor; i++) {
            for (int j = 0; j < valor; j++) {
                if (i == j) {
                    matriz[i][j] = 1;
                    value+="1";
                } else {
                    matriz[i][j] = 0;
                    value+="0";
                }
            }
            System.out.println(value);
            value = "";
        }
        return matriz;
    }
}

