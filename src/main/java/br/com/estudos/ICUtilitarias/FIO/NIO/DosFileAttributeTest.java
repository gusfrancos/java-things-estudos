package br.com.estudos.ICUtilitarias.FIO.NIO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;

public class DosFileAttributeTest {

	public static void main(String[] args) {
		Path path = Paths.get("folder2\\texto.txt");
		
		try {
			if(!Files.exists(path)){
				Files.createFile(path);
			}
			
			Files.setAttribute(path, "dos:hidden", true);
			Files.setAttribute(path, "dos:readonly", true);
			
			DosFileAttributes dos = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos.isHidden());
			System.out.println(dos.isReadOnly());
			
			
			Files.setAttribute(path, "dos:hidden", false);
			Files.setAttribute(path, "dos:readonly", false);
			
			DosFileAttributes dos2 = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos2.isHidden());
			System.out.println(dos2.isReadOnly());
			
			
			//jeito mais facil de ver os atributos
			DosFileAttributeView dosView = Files.getFileAttributeView(path, DosFileAttributeView.class);
			dosView.setHidden(true);
			dosView.setReadOnly(true);
			
			DosFileAttributes dos3 = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos3.isHidden());
			System.out.println(dos3.isReadOnly());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
