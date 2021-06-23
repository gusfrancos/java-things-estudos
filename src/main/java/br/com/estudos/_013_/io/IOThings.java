package br.com.estudos._013_.io;

import java.io.File;
import java.io.IOException;

/**
 * Class: IoThings
 * 
 * Things:
 *  -- Principais classes (File, FileReader, BufferedReader, FileWriter, BuffedWriter
 */
public class IOThings {

	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		try {
			boolean newFile = file.createNewFile();
			System.out.println(newFile);
		
			
			System.out.println("Perm. de Leitura:" + file.canRead());
			System.out.println("Path:" + file.getPath());
			System.out.println("Path absoluto:" + file.getAbsolutePath());
			System.out.println("Hidden:" + file.isHidden());
			System.out.println("last:" + file.lastModified());
			
			boolean exists = file.exists();
			if(exists) {
				System.out.println("Deletado?" + file.delete());
				
			}
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
