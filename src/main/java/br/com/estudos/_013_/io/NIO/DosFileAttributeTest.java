package br.com.estudos._013_.io.NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {

	public static void main(String[] args) {
		Path path = Paths.get("folder\\teste.txt");
		
		try {
			if(!Files.exists(path)){
				Files.createDirectory(path);
			}
			
			Files.setAttribute(path, "dos:hidden", true);
			Files.setAttribute(path, "dos:readonly", true);
			
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
