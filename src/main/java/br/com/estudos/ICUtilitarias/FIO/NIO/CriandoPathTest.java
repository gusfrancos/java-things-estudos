package br.com.estudos.ICUtilitarias.FIO.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CriandoPathTest {
	public static void main(String[] args) {
		Path p1 = Paths.get("C:\\DesenvProjetos\\estudos-workspace\\java-things-estudos\\folder2\\Arquivo2.txt");
		Path p2 = Paths.get("C:\\DesenvProjetos\\estudos-workspace\\java-things-estudos\\folder2\\", "Arquivo2.txt");
		Path p3 = Paths.get("C:", "DesenvProjetos\\estudos-workspace\\java-things-estudos\\folder2\\", "Arquivo2.txt");
		Path p4 = Paths.get("C:", "DesenvProjetos", "estudos-workspace", "java-things-estudos" , "folder2", "Arquivo2.txt");

		System.out.println(p4.toAbsolutePath());
		
		//da para trasformar a classe path para file e vice e versa
		File file = p4.toFile();
		Path path = file.toPath();
		
		//Criando pasta com path
		Path path1 = Paths.get("pasta");
		
		//Criando estrutura de diretorios
		Path path2 = Paths.get("pasta\\subpasta\\subsubpasta");
		
		//Criando arquivos
		Path arquivo = Paths.get("pasta\\subpasta\\subsubpasta\\file.txt");
		
		try {
			if(Files.notExists(path1)) {
				Files.createDirectory(path1);
			}
			
			if(Files.notExists(path2)) {
				Files.createDirectories(path2);
			}
			
			if(Files.notExists(arquivo)) {
				Files.createFile(arquivo);
			}
			
		//Mover o arquivo de um lado para outro
		Path source = Paths.get("folder2\\arquivo2.txt");
		Path target = Paths.get("folder2\\arquivoCopiado.txt");
		Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
		
		
		//Para deletar
		Files.deleteIfExists(arquivo);
		
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
