package br.com.abc.javacore.introducaoclasses.teste;

import br.com.abc.javacore.introducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Anna";
        professor.matricula = "121212";
        professor.rg = "8064145091";
        professor.cpf = "016.302.650-55";

        Professor professor1 = new Professor();
        professor1.nome = "Maria";
        professor1.matricula = "111111";
        professor1.rg = "00000";
        professor1.cpf = "1111111";

        System.out.println(professor.nome);
        System.out.println(professor.matricula);
        System.out.println(professor.rg);
        System.out.println(professor.cpf);

        System.out.println(professor1.nome + " " + professor1.matricula + " " + professor1.cpf + " " + professor1.rg);
    }
}
