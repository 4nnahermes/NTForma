package br.com.ntconsult.exerciciospt1.ex04;

// 4. Um Motorista, alem de possuir as mesmas informações de um funcionário, possui também { cnh, placaCarro}
public class Motorista extends Funcionario {
    private String cnh;
    private String placa;


    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placa) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placa = placa;
    }

    public void imprime() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Placa do Carro: " + this.placa);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
