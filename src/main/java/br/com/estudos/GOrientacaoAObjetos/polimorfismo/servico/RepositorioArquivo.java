package br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}