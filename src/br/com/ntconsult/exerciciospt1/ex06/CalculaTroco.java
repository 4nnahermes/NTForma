package br.com.ntconsult.exerciciospt1.ex06;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class CalculaTroco {
    public static void calcularTroco(BigDecimal custo, BigDecimal pagamento) {

        BigDecimal troco = pagamento.subtract(custo);

        if (troco.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Pagamento Insuficiente");
            return;
        }
        if (troco.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("Não é necessário troco");
            return;
        }

        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        String trocoFormatado = decimalFormat.format(troco);

        System.out.println("Troco: " + troco + "\nMenor Troco:");
        BigDecimal[] notasMoedasTroco = {new BigDecimal("200"),
                new BigDecimal("100"),
                new BigDecimal("50"),
                new BigDecimal("20"),
                new BigDecimal("10"),
                new BigDecimal("5"),
                new BigDecimal("2"),
                new BigDecimal("1"),
                new BigDecimal("0.50"),
                new BigDecimal("0.25"),
                new BigDecimal("0.10"),
                new BigDecimal("0.05")};
        String[] notasMoedas = {"nota(s) de R$200", "nota(s) de R$100", "nota(s) de R$50", "nota(s) de R$20",
                "nota(s) de R$10", "nota(s) de R$5", "nota(s) de R$2", "moeda(s) de R$1", "moeda(s) de R$0.50",
                "moeda(s) de R$0.25", "moeda(s) de R$0.10", "moeda(s) de R$0.05"};

        for (int i = 0; i < notasMoedasTroco.length; i++) {
            int quantidade = troco.divideToIntegralValue(notasMoedasTroco[i]).intValue();
            troco = troco.remainder(notasMoedasTroco[i]);
            if (quantidade > 0) {
                System.out.println(quantidade + " " + notasMoedas[i]);
            }
        }
    }
}
