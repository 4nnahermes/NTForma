package br.com.abc.javacore.exception.customexception;

public class LoginInvalidoException extends Exception {
    public LoginInvalidoException(){
        super("Usuário ou senha inválidos");
    }
}
