package br.com.abc.javacore.colecoes.teste;

import br.com.abc.javacore.colecoes.classes.Consumidor;
import br.com.abc.javacore.colecoes.classes.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConsumidorMapTeste {
    public static void main(String[] args) {
        Consumidor consumidor = new Consumidor("WIlliam", "122");
        Consumidor consumidor2 = new Consumidor("DevDojo", "321");
        Consumidor consumidor3 = new Consumidor("DevDojo222", "321");

        Produto produto1 = new Produto("123", "Laptop Lenovo", 2000);
        Produto produto2 = new Produto("321", "Picanha", 26.4);
        Produto produto3 = new Produto("879", "Teclado Razer", 1000);
        Produto produto4 = new Produto("012", "Samsung Galaxy S7 64Gb", 3250.5);

        Map<Consumidor,List<Produto>> map = new HashMap<>();

        List<Produto> produtosCons1 = new ArrayList<>();
        produtosCons1.add(produto1);
        produtosCons1.add(produto2);
        List<Produto> produtosCons2 = new ArrayList<>();
        produtosCons2.add(produto3);
        produtosCons2.add(produto4);

       map.put(consumidor, produtosCons1);
       map.put(consumidor2, produtosCons2);
       map.put(consumidor3, produtosCons1);
       for (Map.Entry<Consumidor,List<Produto>> entry : map.entrySet()){
           System.out.println(entry.getKey().getNome());
           for (Produto produto : entry.getValue()){
               System.out.println(produto.getNome());
           }
           }
       }
}
