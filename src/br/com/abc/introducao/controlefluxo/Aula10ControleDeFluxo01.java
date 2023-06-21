package br.com.abc.introducao.controlefluxo;

public class Aula10ControleDeFluxo01 {
    public static void main(String[] args) {
        //idade < 15 = categoria infantil
        // idade >= 15 && idade < 18 = categoria juvenil
        // idade >= 18 = adulto
        int idade = 90;
        String categoria;
        float salario = 2000;
        if(idade < 15){
            categoria = ("Categoria Infantil");
        }else if(idade >= 15 && idade < 18){
            categoria = ("Categoria Juvenil");
        }else{
            categoria = ("Categoria Adulto");;
        }
        System.out.println(categoria);
    }
}
