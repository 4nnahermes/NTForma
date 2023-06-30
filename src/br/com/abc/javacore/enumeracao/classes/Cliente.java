package br.com.abc.javacore.enumeracao.classes;

public class Cliente {
    public enum TipoPagamento {
        AVISTA, APRAZO;
    }

    private String nome;
    private TipoCLiente tipoCLiente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCLiente tipoCLiente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCLiente = tipoCLiente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipo=" + tipoCLiente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                " número: " + tipoCLiente.getTipo() +
                '}';
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCLiente getTipoCLiente() {
        return tipoCLiente;
    }

    public void setTipoCLiente(TipoCLiente tipoCLiente) {
        this.tipoCLiente = tipoCLiente;
    }
}
