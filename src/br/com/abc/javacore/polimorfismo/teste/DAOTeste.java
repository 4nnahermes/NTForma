package br.com.abc.javacore.polimorfismo.teste;

import br.com.abc.javacore.polimorfismo.classes.ArquivoDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.polimorfismo.classes.GenericDAO;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DAOTeste {
    public static void main(String[] args) {
        GenericDAO arquivoDAO = new ArquivoDAOImpl();
        arquivoDAO.save();
        List<String> lista = new LinkedList<>();
        lista.add("Nome 1");
        lista.add("Nome 2");
        lista.add("Nome 3");
        lista.add("Nome 4");
        for (String nome : lista) {
            System.out.println(nome);
        }
    }
}
