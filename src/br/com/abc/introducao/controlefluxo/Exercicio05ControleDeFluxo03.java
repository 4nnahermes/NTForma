package br.com.abc.introducao.controlefluxo;

public class Exercicio05ControleDeFluxo03 {
    public static void main(String[] args) {
        /*
        Imprima todos os números pares de 0 até 100.000
         */
        int contador = 100000;

        for (int i=0; i<=contador;i++){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
