package br.com.estudos.HExcecoes.Dominio;

public class LoginInvalidoException extends Exception {

    public LoginInvalidoException() {
        super("Login inv�lido");
    }

    public LoginInvalidoException(String message) {
        super(message);
    }
}
