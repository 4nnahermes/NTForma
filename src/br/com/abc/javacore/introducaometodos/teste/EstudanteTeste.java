package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.setNome("João");
        estudante.setIdade(-1);
        estudante.setNotas(new double[]{3, 2, 9, 5});

        estudante.print();
        estudante.tirarMedia();
        System.out.println(estudante.getNome());
        System.out.println("Aprovado: " + estudante.isAprovado());
    }
}
