package br.com.abc.introducao;//Comentário de uma linha
    /*
    Comentário em bloco
     */
/***
 * Comentário oficial de java
 * Esse é o método de entrada main
 * parâmetro de entrada do método main
 */
// nome de classe sempre CamelCase
public class Aula05ImprimindoVariaveis {
    public static void main(String[] args){
        //criar variável:
        // tipo da variável / nome (primeiraParavraMinúscula)
        int idadeDosPaisParaCadastro = 10;
        double salarioDouble = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = '\u0041'; // 2 bytes
        String nome = "William";
        System.out.println(caractere);
    }
}

