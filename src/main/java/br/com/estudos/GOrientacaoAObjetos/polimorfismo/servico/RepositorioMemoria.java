package br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
