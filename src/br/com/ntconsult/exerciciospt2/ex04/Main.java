package br.com.ntconsult.exerciciospt2.ex04;

import java.util.Scanner;

// 4. Crie uma interface chamada usuário e implemente métodos em 3 classes
public class Main {
    public static void main(String[] args) {
        double valorProduto;
        double valorFrete;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Valor do Produto: ");
        valorProduto = leitor.nextDouble();
        System.out.println("Valor do Frete: ");
        valorFrete = leitor.nextDouble();
        Usuario usuarioBase = new UsuarioBase();
        Usuario usuarioStandard = new UsuarioStandard();
        Usuario usuarioPremium = new UsuarioPremium();

        System.out.println("Tipo de usuário: " + usuarioBase.getTipoUsuario());
        System.out.println("Desconto: " + usuarioBase.getValorDesconto(valorProduto));
        System.out.println("Desconto do frete: " + usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Valor do produto com desconto: " + (valorProduto - (usuarioBase.getValorDesconto(valorProduto))));
        System.out.println("Valor do frete com desconto: " + (valorFrete - (usuarioBase.getValorFreteDesconto(valorFrete, valorProduto))));
        System.out.println("--------------------------------------------");
        System.out.println("Tipo de usuário: " + usuarioStandard.getTipoUsuario());
        System.out.println("Desconto: " + usuarioStandard.getValorDesconto(valorProduto));
        System.out.println("Desconto do frete: " + usuarioStandard.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Valor do produto com desconto: " + (valorProduto - (usuarioStandard.getValorDesconto(valorProduto))));
        System.out.println("Valor do frete com desconto: " + (valorFrete - (usuarioStandard.getValorFreteDesconto(valorFrete, valorProduto))));
        System.out.println("--------------------------------------------");
        System.out.println("Tipo de usuário: " + usuarioPremium.getTipoUsuario());
        System.out.println("Desconto: " + usuarioPremium.getValorDesconto(valorProduto));
        System.out.println("Desconto do frete: " + usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
        System.out.println("Valor do produto com desconto: " + (valorProduto - (usuarioPremium.getValorDesconto(valorProduto))));
        System.out.println("Valor do frete com desconto: " + (valorFrete - (usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto))));
    }
}
