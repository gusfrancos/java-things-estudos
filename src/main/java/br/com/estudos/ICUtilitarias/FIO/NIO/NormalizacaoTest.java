package br.com.estudos.ICUtilitarias.FIO.NIO;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizacaoTest {
	public static void main(String[] args) {
		String diretorioProjeto = "java-things-estudos\\pasta\\subpasta\\subsubpasta\\dev";
		String arquivoTxt = "..\\..\\..\\arquivo.txt";
		
		Path p1 = Paths.get(diretorioProjeto, arquivoTxt);
		System.out.println(p1.normalize());
		
		Path p2 = Paths.get("pasta/./subpasta/./subsubpasta");
		System.out.println(p2.normalize());
		
	}

}
