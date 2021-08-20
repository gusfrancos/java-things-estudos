package br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioBancoDeDados implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}