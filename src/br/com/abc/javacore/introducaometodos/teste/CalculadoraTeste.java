package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeos(8,3);
        //forma de imprimir o return:
        System.out.println(calc.divideDoisNumeros(20,0));
        //outra forma de imprimir return:
        double result = calc.divideDoisNumeros(20,0);
        System.out.println(result);
        calc.imprimeDoisNumerosDivididos(20,0);
    }
}
