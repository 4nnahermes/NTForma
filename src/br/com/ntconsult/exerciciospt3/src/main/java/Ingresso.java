public class Ingresso {
    private Filme filme;
    private Poltrona poltrona;
    private Cliente cliente;

    public Ingresso(Filme filme, Poltrona poltrona, Cliente cliente) {
        this.filme = filme;
        this.poltrona = poltrona;
        this.cliente = cliente;
    }

    public Filme getFilme() {
        return filme;
    }

    public Poltrona getPoltrona() {
        return poltrona;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
