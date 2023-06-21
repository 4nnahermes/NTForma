package br.com.abc.javacore.introducaometodos.classes;
//crie os seguintes atributos para essa classe: nome, matrícula, rg, cpf
//crie uma classe de teste para preencher e imprimir os dados desse professor
public class Professor {
        public String nome;
        public String matricula;
        public String rg;
        public String cpf;

        public void imprime(Professor aux){
                System.out.println("------------------");
                System.out.println(aux.cpf);
                System.out.println(aux.matricula);
                System.out.println(aux.nome);
                System.out.println(aux.rg);
        }
}
