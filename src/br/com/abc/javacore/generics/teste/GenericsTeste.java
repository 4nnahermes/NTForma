package br.com.abc.javacore.generics.teste;

import br.com.abc.javacore.colecoes.classes.Consumidor;

import java.util.ArrayList;
import java.util.List;

public class GenericsTeste {
    public static void main(String[] args) {
        //type erasure
        List<String> list = new ArrayList<>();
        list.add("String");
        list.add("String");
        list.add("William Suane");


        for (String obj:list){
            System.out.println(obj);
        }
        add(list, 1L);

    }
    public static void add(List lista, Long l){
        lista.add(l);
    }
}
