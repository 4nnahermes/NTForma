package br.com.ntconsult.exerciciospt1.ex06;

import java.math.BigDecimal;
import java.util.Scanner;

import static br.com.ntconsult.exerciciospt1.ex06.CalculaTroco.calcularTroco;

public class Main {
    public static void main(String[] args) {
        Scanner leitorcusto = new Scanner(System.in);
        System.out.println("Digite o custo: ");
        BigDecimal custo = new BigDecimal(leitorcusto.nextLine());

        Scanner leitorpagamento = new Scanner(System.in);
        System.out.println("Digite o pagamento: ");
        BigDecimal pagamento = new BigDecimal(leitorpagamento.nextLine());

        calcularTroco(custo, pagamento);
    }
}
