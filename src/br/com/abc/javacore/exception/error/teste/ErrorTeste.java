package br.com.abc.javacore.exception.error.teste;

public class ErrorTeste {
    public static void main(String[] args) {
        stackoverflowError();
    }

    public static void stackoverflowError() {
        stackoverflowError();
    }
}
