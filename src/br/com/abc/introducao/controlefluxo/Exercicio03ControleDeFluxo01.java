package br.com.abc.introducao.controlefluxo;

public class Exercicio03ControleDeFluxo01 {
    public static void main(String[] args) {
        /*
        Crie uma variável salário e imprima seu imposto
        Imposto:
        salario < 1000 - 5%
        salario <= 1000 e salario < 2000 - 10%
        salario <= 2000 e salario < 4000 - 15%
        salario > 4000 - 20%
         */

        float salario = 3000;
        double imposto = 0;

        if(salario < 1000){
            imposto = salario + (salario*0.05);
        } else if(salario <= 1000 || salario < 2000){
            imposto = salario + (salario*0.10);
        } else if(salario <= 2000 || salario < 4000){
            imposto = salario + (salario*0.15);}
        else {imposto = salario + (salario*0.20);}
        System.out.println(imposto);
    }
}
