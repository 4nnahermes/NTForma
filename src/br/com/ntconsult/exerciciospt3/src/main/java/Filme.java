import java.util.List;

public class Filme {
    private static int ultimoId = 0;
    private int id;
    private String titulo;
    private String genero;
    private int classificacao;
    private int tempo;
    private double valor;
    private String tecnologia;
    private List<Poltrona> poltronasDisponiveis;

    public Filme(String titulo, String genero, int classificacao, int tempo, double valor, String tecnologia, List<Poltrona> poltronasDisponiveis) {
        this.id = ++ultimoId;
        this.titulo = titulo;
        this.genero = genero;
        this.classificacao = classificacao;
        this.tempo = tempo;
        this.valor = valor;
        this.tecnologia = tecnologia;
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public int getTempo() {
        return tempo;
    }

    public double getValor() {
        return valor;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public List<Poltrona> getPoltronasDisponiveis() {
        return poltronasDisponiveis;
    }

    public void setPoltronasDisponiveis(List<Poltrona> poltronasDisponiveis) {
        this.poltronasDisponiveis = poltronasDisponiveis;
    }

}
