package br.com.estudos.ICUtilitarias.FIO;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {
	public static void main(String[] args) throws IOException {
		
		//Trabalhando com diretório
		File diretorio = new File("folder");
		boolean mkdir = diretorio.mkdir();
		System.out.println(mkdir);
		System.out.println(diretorio.getAbsolutePath());
		
		//Criando um arquivo em um diretório criado
		File arquivo = new File(diretorio.getAbsolutePath() + "\\arquivo.txt");
		arquivo.createNewFile();
		
		//outra forma de criar um arquivo em um diretório criado
		File arquivo2 = new File(diretorio, "Arquivo2.txt");
		arquivo2.createNewFile();
		
		//renomenando arquivo
		File arquivoNovoNome = new File(diretorio, "arquivo_renomeado.txt");
		arquivo.renameTo(arquivoNovoNome);
		
		//renomeando diretório
		File diretorioRenomeado = new File("folder2");
		diretorio.renameTo(diretorioRenomeado);
		
		//buscando arquivos
		buscarArquivos();
	}
	
	public static void buscarArquivos() {
		File file = new File("folder2");
		String[] list = file.list();
		
		for(String arquivo : list) {
			System.out.println(arquivo);
		}
	}
}
