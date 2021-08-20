package br.com.estudos.HExcecoes.exception.test;

import java.io.FileNotFoundException;

import br.com.estudos.HExcecoes.Dominio.Funcionario;
import br.com.estudos.HExcecoes.Dominio.LoginInvalidoException;
import br.com.estudos.HExcecoes.Dominio.Pessoa;

public class SobrescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
