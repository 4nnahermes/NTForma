package br.com.abc.javacore.sobrecargaconstrutores.teste;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("121212", "Carlos", new double[]{5, 7, 9}, "11/11/2016");
        estudante.imprime();
    }
}
