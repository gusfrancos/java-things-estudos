package br.com.estudos._013_.io.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

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
		try {
			if(Files.notExists(path1)) {
				Files.createDirectory(path1);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
