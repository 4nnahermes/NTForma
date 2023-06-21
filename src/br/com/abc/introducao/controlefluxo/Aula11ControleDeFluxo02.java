package br.com.abc.introducao.controlefluxo;

public class Aula11ControleDeFluxo02 {
    public static void main(String[] args) {
        //idade < 15 = categoria infantil
        // idade >= 15 && idade < 18 = categoria juvenil
        // idade >= 18 = adulto

        int idade = 12;
        String status;

        // forma de programar sem usar if e else utilizando operador ternário
        status = idade < 18 ? "Não adulto" : "Adulto";
        // if, else if e else utilizando ternários(não recomendado):
        //status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "Juvenil" : "Adulto";
        System.out.println(status);
    }
}
