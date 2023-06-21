package br.com.abc.javacore.sobrecargaMetodos.teste;

import br.com.abc.javacore.sobrecargaMetodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Chica da Silva","111.222.333.44", 4500,"8080808080");
        Funcionario funcionario1 = new Funcionario();

        funcionario.imprime();
        funcionario1.imprime();

    }
}
