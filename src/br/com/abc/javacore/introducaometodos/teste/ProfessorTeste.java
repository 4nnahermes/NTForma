package br.com.abc.javacore.introducaometodos.teste;

import br.com.abc.javacore.introducaometodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.cpf = "123.123.123-23";
        professor.matricula = "1111";
        professor.nome = "Maria";
        professor.rg = "909090900990";

        Professor professor2 = new Professor();
        professor2.cpf = "890.890.890-90";
        professor2.matricula = "22222";
        professor2.nome = "João";
        professor2.rg = "67676776766767";

        professor.imprime(professor);
        professor.imprime(professor2);
    }
}
