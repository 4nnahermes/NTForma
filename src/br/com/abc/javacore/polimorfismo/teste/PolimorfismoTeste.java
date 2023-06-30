package br.com.abc.javacore.polimorfismo.teste;

import br.com.abc.javacore.polimorfismo.classes.Funcionario;
import br.com.abc.javacore.polimorfismo.classes.Gerente;
import br.com.abc.javacore.polimorfismo.classes.RelatorioPagamento;
import br.com.abc.javacore.polimorfismo.classes.Vendedor;

public class PolimorfismoTeste {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Oswaldo", 5000, 2000);
        Vendedor vendedor = new Vendedor("Yuri", 2000, 20000);
        RelatorioPagamento relatorioPagamento = new RelatorioPagamento();
//        relatorioPagamento.relatorioPagamentoGerente(gerente);
//        System.out.println("---------------------------");
//        relatorioPagamento.relatorioPagamentoVendedor(vendedor);
        relatorioPagamento.relatorioPagamentoGenerico(gerente);
        System.out.println("---------------------------");
        relatorioPagamento.relatorioPagamentoGenerico(vendedor);

    }
}
