package br.com.abc.javacore.enumeracao.teste;

import br.com.abc.javacore.enumeracao.classes.Cliente;
import br.com.abc.javacore.enumeracao.classes.TipoCLiente;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Anna", TipoCLiente.PESSOA_JURIDICA, Cliente.TipoPagamento.APRAZO);
        System.out.println(TipoCLiente.PESSOA_FISICA.getId());
        System.out.println(cliente);
    }
}
