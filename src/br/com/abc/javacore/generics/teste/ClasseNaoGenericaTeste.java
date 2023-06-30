package br.com.abc.javacore.generics.teste;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseNaoGenericaTeste {
    public static void main(String[] args) {
        CarroAlugavel carroAlugavel = new CarroAlugavel();
        Carro carroAlugado = carroAlugavel.getCarroDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverCarro(carroAlugado);

        System.out.println("-----------------------");

        ComputadorAlugavel computadorAlugavel = new ComputadorAlugavel();
        Computador computadorAlugado = computadorAlugavel.getComputadorDisponivel();
        System.out.println("Usando o pc");
        computadorAlugavel.devolverComputador(computadorAlugado);
    }

    static class CarroAlugavel {
        private List<Carro> carrosDisponiveis = new ArrayList<>();

        {
            carrosDisponiveis.add(new Carro("Gol"));
            carrosDisponiveis.add(new Carro("BMW"));
        }

        //alugar:
        public Carro getCarroDisponivel() {
            Carro carro = carrosDisponiveis.remove(0);
            System.out.println("Alugando carro: " + carro);
            System.out.println("Carros Disponiveis: " + carrosDisponiveis);
            return carro;
        }

        public void devolverCarro(Carro carro) {
            System.out.println("Devolvendo carro: " + carro);
            carrosDisponiveis.add(carro);
            System.out.println("Carros Disponiveis: " + carrosDisponiveis);
        }
    }

    static class ComputadorAlugavel {
        private List<Computador> computadoresDisponiveis = new ArrayList<>();

        {
            computadoresDisponiveis.add(new Computador("Alienware"));
            computadoresDisponiveis.add(new Computador("Hp"));
        }

        //alugar:
        public Computador getComputadorDisponivel() {
            Computador computador = computadoresDisponiveis.remove(0);
            System.out.println("Alugando computador: " + computador);
            System.out.println("Computadores Disponiveis: " + computadoresDisponiveis);
            return computador;
        }

        public void devolverComputador(Computador computador) {
            System.out.println("Devolvendo computador: " + computador);
            computadoresDisponiveis.add(computador);
            System.out.println("Computadores Disponiveis: " + computadoresDisponiveis);
        }
    }


}
