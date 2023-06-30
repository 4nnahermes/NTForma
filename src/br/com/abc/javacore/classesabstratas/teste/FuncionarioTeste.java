package br.com.abc.javacore.classesabstratas.teste;

import br.com.abc.javacore.classesabstratas.classes.Funcionario;
import br.com.abc.javacore.classesabstratas.classes.Gerente;
import br.com.abc.javacore.classesabstratas.classes.Vendedor;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Anna", "222222-2", 2000);
        Vendedor vendedor = new Vendedor("Camila", "333333-3", 1500, 5000);
        gerente.calculaSalario();
        vendedor.calculaSalario();
        System.out.println(gerente);
        System.out.println(vendedor);
    }
}
