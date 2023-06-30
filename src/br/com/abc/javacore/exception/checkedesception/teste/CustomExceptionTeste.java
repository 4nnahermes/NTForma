package br.com.abc.javacore.exception.checkedesception.teste;

import br.com.abc.javacore.exception.customexception.LoginInvalidoException;

public class CustomExceptionTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
           e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException {
        String usuarioBancoDeDados = "Goku";
        String senhaBancoDeDados = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "123";

        if (!usuarioBancoDeDados.equals(usuarioDigitado) || !senhaBancoDeDados.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        } else {
            System.out.println("Logado");
        }
    }
}
