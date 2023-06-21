package br.com.abc.introducao.arrays;

public class Aula21Arrays05 {
    public static void main(String[] args) {
        //array unidimensional:
        //int[] dias = new int[31];
        //array multidimensional:
        int[][] dias = new int[2][2];

        dias[0][0] = 30;
        dias[0][1] = 31;
        dias[1][0] = 29;
        dias[1][1] = 28;

        for (int i = 0; i < dias.length; i++) {
            //System.out.println(dias[i]);
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------");
        for (int[] ref:dias){
            for (int dia:ref){
                System.out.println(dia);
            }
        }
    }
}
