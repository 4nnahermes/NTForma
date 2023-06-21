package br.com.abc.introducao;

/*
Crie um algoritmo que possua as variáveis salário, sexo (M ou F), idade e estado civil.
Imprima da seguinte forma:
O/A trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil <estado civil> e salário <salário>
encontra-se empregado neste estabelecimento.
 */
public class Exercicio02TiposPrimitivos {
    public static void main(String[] args){
        String nome = "Anna";
        double salario = 2500.50;
        char sexo = 'F';
        int idade = 36;
        String estadoCivil = "solteira";

        System.out.println("O/A trabalhador(a) " + nome + " do sexo " + sexo + ", idade " + idade + ", estado civil " + estadoCivil + " e salário " + salario + " encontra-se empregado neste estabelecimento.");
    }
}
