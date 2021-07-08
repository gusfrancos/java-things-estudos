package br.com.estudos._013_.io.NIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.DosFileAttributes;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributeTest {

	public static void main(String[] args) {
		//Serve só para ambientes Unix
		Path path = Paths.get("home\\folder2\\texto.txt");
		
		try {
			PosixFileAttributes  posix = Files.readAttributes(path, PosixFileAttributes.class);
			System.out.println(posix.permissions());
			System.out.println("Alterando as permissões");
			
			PosixFileAttributeView view = Files.getFileAttributeView(path, PosixFileAttributeView.class);
			//view.setPermissions(null);
			
			Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw");
			Files.setPosixFilePermissions(path, permissions);
			System.out.println(posix.permissions());
			
			
			
			
			DosFileAttributes dos3 = Files.readAttributes(path, DosFileAttributes.class);
			
			System.out.println(dos3.isHidden());
			System.out.println(dos3.isReadOnly());
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
