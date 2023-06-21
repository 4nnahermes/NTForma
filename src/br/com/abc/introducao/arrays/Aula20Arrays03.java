package br.com.abc.introducao.arrays;

public class Aula20Arrays03 {
    public static void main(String[] args) {
        //Formas de declarar arrays
        //int[] numeros = new int[5];
        int[] numeros = {1, 2, 3, 4, 5}; // tamanho = 5, index = 0 até 4
        //int[] numeros3 = new int[]{1, 2, 3, 4, 5};

//        for (int i = 0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);

        for (int aux: numeros) {
            System.out.println(aux);
        }
    }
}
