package br.com.abc.javacore.polimorfismo.classes;

public class RelatorioPagamento {

    public void relatorioPagamentoGenerico(Funcionario funcionario) {
        System.out.println("Gerando relatório de pagamento");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário do mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            Gerente gerente = (Gerente) funcionario;
            System.out.println("Participação nos lucros: " + gerente.getPnl());
        }
        if (funcionario instanceof Vendedor) {
            System.out.println("Total vendas: " + ((Vendedor) funcionario).getTotalVendas());
        }
    }
}
