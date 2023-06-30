package br.com.ntconsult.exerciciospt2.ex04;

// 4. Crie uma interface chamada usuário e implemente métodos em 3 classes
public interface Usuario {
    public abstract Double getValorDesconto(double valorProduto);

    public abstract String getTipoUsuario();

    public abstract Double getValorFreteDesconto(double valorFrete, double valorProduto);
}
