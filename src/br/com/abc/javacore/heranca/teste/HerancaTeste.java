package br.com.abc.javacore.heranca.teste;

import br.com.abc.javacore.heranca.classes.Endereco;
import br.com.abc.javacore.heranca.classes.Funcionario;
import br.com.abc.javacore.heranca.classes.Pessoa;

public class HerancaTeste {
    public static void main(String[] args) {
        //Pessoa pessoa = new Pessoa("Gina");
        Endereco endereco = new Endereco();
        Funcionario funcionario = new Funcionario("Augusto");

        /*pessoa.setCpf("12345");
        endereco.setBairro("Bairro 1");endereco*/
        endereco.setRua("Rua 25");
       /* pessoa.setEndereco(endereco);
        pessoa.imprime();*/
        System.out.println("----------------------");
        funcionario.setCpf("222222");
        funcionario.setSalario(15000);
        funcionario.setEndereco(endereco);
        //funcionario.imprime();
    }
}
