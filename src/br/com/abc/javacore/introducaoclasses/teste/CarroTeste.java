package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "QWJ1029";
        carro.modelo = "Fusca";
        carro.velocidadeMaxima = 120f;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
