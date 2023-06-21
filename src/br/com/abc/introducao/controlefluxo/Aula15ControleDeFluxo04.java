package br.com.abc.introducao.controlefluxo;

public class Aula15ControleDeFluxo04 {
    public static void main(String[] args) {
        int contador =11;
        while (contador < 10){
            System.out.println(++contador);
        } //caso o contador seja 11, por exemplo (condicional falsa)
        contador = 0;
        do {
            System.out.println("Dentro do While: " + contador++);
        }while(contador < 10);

        for(int i=0; i<10; i++){
            System.out.println("Valor de i é: " +i);
            if (i==5){
                break;
            }
        }
    }
}
