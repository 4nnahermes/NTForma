package br.com.abc.javacore.interfaces.classes;
// interfaces não são instanciáveis
public interface Tributavel {
    public static final double IMPOSTO = 0.2;

    //quando trabalhamos com interface, todos métodos são public abstract, mas não precisa colocar
    //e também não se coloca {}, termina só com ;
    void calculaImposto();
}
