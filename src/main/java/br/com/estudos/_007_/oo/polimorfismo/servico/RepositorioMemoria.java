package br.com.estudos._007_.oo.polimorfismo.servico;

import br.com.estudos._007_.oo.polimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em memória");
    }
}
