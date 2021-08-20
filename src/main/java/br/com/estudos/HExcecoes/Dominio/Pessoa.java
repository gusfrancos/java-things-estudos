package br.com.estudos.HExcecoes.Dominio;

import java.io.IOException;

public class Pessoa {

    public void salvar() throws LoginInvalidoException, IOException {
        System.out.println("Salvando pessoa");
    }
}