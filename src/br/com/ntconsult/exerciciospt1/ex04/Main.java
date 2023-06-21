package br.com.ntconsult.exerciciospt1.ex04;

// Monte a estrutura de classes, instancie 2 Motoristas e
// imprima no console { nome, cargo e placaCarro } de cada motorista
public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Mário", "111.111.111-11", "1111111111", 40, "Motorista", 2000, "1111111", "ABC1111");
        Motorista motorista2 = new Motorista("Maria", "222.222.222-22", "2222222222", 36, "Motorista", 2000, "2222222", "ABC2222");
        System.out.println("Motorista 1:");
        motorista1.imprime();
        System.out.println("----------------------\nMotorista 2:");
        motorista2.imprime();
    }
}
