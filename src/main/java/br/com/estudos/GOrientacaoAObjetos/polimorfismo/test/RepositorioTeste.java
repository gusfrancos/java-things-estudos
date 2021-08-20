package br.com.estudos.GOrientacaoAObjetos.polimorfismo.test;

import java.util.LinkedList;
import java.util.List;

import br.com.estudos.GOrientacaoAObjetos.polimorfismo.repositorio.Repositorio;
import br.com.estudos.GOrientacaoAObjetos.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}
