package br.com.abc.introducao.operadores;

public class Aula09OperadoresDeAtribuicao {
    public static void main(String[] args) {
        int salario = 1000;
        // adicionando 1000 ao salário:
        //salario = salario + 1000;
        // como escrever de forma mais limpa:
        //salario += 1000;
        // 10% do salario:
        //salario *= 0.1;
        //adicionando 10% ao salario:
        //salario = salario + (int)(salario*0.1);
        //resto de divisão:
        int numero = 11;
        numero %= 2;

        System.out.println(salario);
        System.out.println(numero);

    }
}
