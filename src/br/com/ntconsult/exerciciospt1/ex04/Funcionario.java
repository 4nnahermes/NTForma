package br.com.ntconsult.exerciciospt1.ex04;

// 4. Um funcionário, alem de possuir as mesmas informações de uma pessoa, possui também { cargo, salário}
public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, String rg, int idade, String cargo, double salario) {
        super(nome, cpf, rg, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
