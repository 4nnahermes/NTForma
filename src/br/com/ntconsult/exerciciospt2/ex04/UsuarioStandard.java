package br.com.ntconsult.exerciciospt2.ex04;

// 4. Crie uma interface chamada usuário e implemente métodos em 3 classes
public class UsuarioStandard implements Usuario {

    @Override
    public Double getValorDesconto(double valorProduto) {
        if (valorProduto > 200) {
            return valorProduto * 0.15;
        }
        return 0.0;
    }

    @Override
    public String getTipoUsuario() {
        return "Standard";
    }

    @Override
    public Double getValorFreteDesconto(double valorFrete, double valorProduto) {
        if (valorProduto > 200) {
            return valorFrete * 0.1;
        }
        return 0.0;
    }
}
