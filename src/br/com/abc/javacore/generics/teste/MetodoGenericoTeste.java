package br.com.abc.javacore.generics.teste;

import java.util.ArrayList;
import java.util.List;

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        criarArray(new Cachorro());
    }

    public static <T extends Animal> void criarArray(T t) {
        List<T> list = new ArrayList<>();
        list.add(t);
        System.out.println(list);
    }
}
