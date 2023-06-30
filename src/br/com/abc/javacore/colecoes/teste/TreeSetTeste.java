package br.com.abc.javacore.colecoes.teste;

import br.com.abc.javacore.colecoes.classes.Celular;
import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000.0, 10);
        Produto produto2 = new Produto("321", "Picanha", 26.4, 10);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000.0, 0);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.5, 0);
        Produto produto5 = new Produto("025", "Samsung Galaxy S6 64Gb", 1d, 0);
        NavigableSet<Produto> produtoNavigableSet = new TreeSet<>();
        produtoNavigableSet.add(produto1);
        produtoNavigableSet.add(produto2);
        produtoNavigableSet.add(produto3);
        produtoNavigableSet.add(produto4);
        produtoNavigableSet.add(produto5);

        for (Produto produto : produtoNavigableSet.descendingSet()){
            System.out.println(produto);
        }
        System.out.println("-----------------------------");
        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(produtoNavigableSet.lower(produto4));
        System.out.println(".......");
        System.out.println(produtoNavigableSet.floor(produto4));
        System.out.println(".......");
        System.out.println(produtoNavigableSet.higher(produto4));
        System.out.println(".......");
        System.out.println(produtoNavigableSet.ceiling(produto4));
        System.out.println("--------------------------");
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollFirst());
        System.out.println(produtoNavigableSet.size());
        System.out.println(produtoNavigableSet.pollLast());
        System.out.println(produtoNavigableSet.size());



    }
}
