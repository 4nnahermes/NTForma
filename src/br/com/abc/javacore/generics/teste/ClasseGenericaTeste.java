package br.com.abc.javacore.generics.teste;

import br.com.abc.javacore.generics.classes.Carro;
import br.com.abc.javacore.generics.classes.Computador;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTeste {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>();
        carrosDisponiveis.add(new Carro("Gol"));
        carrosDisponiveis.add(new Carro("BMW"));
        ObjetosAlugaveis<Carro> carroAlugavel = new ObjetosAlugaveis<>(carrosDisponiveis);
        Carro carro = carroAlugavel.getObjetoDisponivel();
        System.out.println("Usando o carro por um mês");
        carroAlugavel.devolverObjeto(carro);
        System.out.println("--------------------");

        List<Computador> computadoresDisponiveis = new ArrayList<>();
        computadoresDisponiveis.add(new Computador("Alienware"));
        computadoresDisponiveis.add(new Computador("Hp"));
        ObjetosAlugaveis<Computador> computadorAlugavel = new ObjetosAlugaveis<>(computadoresDisponiveis);
        Computador computador = computadorAlugavel.getObjetoDisponivel();
        System.out.println("Usando o computador");
        computadorAlugavel.devolverObjeto(computador);

    }
    //type
    static class ObjetosAlugaveis<T> {
        private List<T> objetosDisponiveis = new ArrayList<>();
        private Long id;
        public ObjetosAlugaveis(List<T> objetosDisponiveis) {
            this.objetosDisponiveis = objetosDisponiveis;
        }

        //alugar:
        public T getObjetoDisponivel() {
            T t = objetosDisponiveis.remove(0);
            System.out.println("Alugando objeto: " + t);
            System.out.println("Objetos disponíveis Disponiveis: " + objetosDisponiveis);
            return t;
        }

        public void devolverObjeto(T t) {
            System.out.println("Devolvendo onjeto: " + t);
            objetosDisponiveis.add(t);
            System.out.println("Objetos Disponiveis: " + objetosDisponiveis);
        }
    }

    class DoisAtributos<T,X>{
        T um;
        X dois;

        public DoisAtributos(T um, X dois) {
            this.um = um;
            this.dois = dois;
        }

        public T getUm() {
            return um;
        }

        public void setUm(T um) {
            this.um = um;
        }

        public X getDois() {
            return dois;
        }

        public void setDois(X dois) {
            this.dois = dois;
        }
    }
}
