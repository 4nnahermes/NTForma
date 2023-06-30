package br.com.abc.javacore.heranca.classes;

public class Funcionario extends Pessoa {
    private double salario;

    {
        System.out.println("Bloco de inicialização de funcionário 1");
    }

    {
        System.out.println("Bloco de inicialização de funcionário 2");
    }

    static {
        System.out.println("Bloco de inicialização static de funcionário 1");
    }


    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento() {
        System.out.println("Eu, " + super.nome + ", recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
