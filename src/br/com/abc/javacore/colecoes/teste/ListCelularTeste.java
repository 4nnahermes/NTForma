package br.com.abc.javacore.colecoes.teste;

import br.com.abc.javacore.colecoes.classes.Celular;

import java.util.ArrayList;
import java.util.List;

public class ListCelularTeste {
    public static void main(String[] args) {
        Celular celular1 = new Celular("Galaxy S7", "123456");
        Celular celular2 = new Celular("Iphone 6s", "987654");
        Celular celular3 = new Celular("Sony Xperia", "567890");
        List<Celular> celularList = new ArrayList<>();
        celularList.add(celular1);
        celularList.add(celular2);
        celularList.add(celular3);

        for (Celular celular : celularList){
            System.out.println(celular);
        }
        Celular celular4 = new Celular("Galaxy S7", "123456");
        System.out.println(celularList.contains(celular4));
    }
}
