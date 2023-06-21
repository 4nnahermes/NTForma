package br.com.abc.introducao.controlefluxo;

public class Aula17ControleDeFluxo06 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Parcelas não podem ser manores que mil
        double valorTotal = 30000;

        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal/parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
            System.out.println("Código consumindo memória");
        }
    }
}
