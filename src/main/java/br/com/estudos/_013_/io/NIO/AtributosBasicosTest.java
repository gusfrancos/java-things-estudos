package br.com.estudos._013_.io.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class AtributosBasicosTest {

	public static void main(String[] args) {
		Date primeiroDeDezembro = new GregorianCalendar(2015,Calendar.DECEMBER, 1).getTime();
		File file = new File("folder2\\arquivo.txt");
		try {
			if(!file.exists()) {
				file.createNewFile();
				file.setLastModified(primeiroDeDezembro.getTime());
				System.out.println(file.lastModified());
				file.delete();
				
				Path path = Paths.get("folder2\\arquivo_path.txt");
				Files.createFile(path);
				
				FileTime fileTime = FileTime.fromMillis(primeiroDeDezembro.getTime());
				Files.setLastModifiedTime(path, fileTime);
				System.out.println(Files.getLastModifiedTime(path));
				Files.deleteIfExists(path);
				
				path = Paths.get("src\\main\\java\\br\\com\\estudos\\tests\\Cougar.java");
				System.out.println(Files.isReadable(path));
				System.out.println(Files.isWritable(path));
				System.out.println(Files.isExecutable(path));
				
				//basicFileAtributes, PosixFileAtrributes, DosFileAttributes
				BasicFileAttributes atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
				System.out.println(atributosBasicos.creationTime());
				System.out.println(atributosBasicos.lastAccessTime());
				System.out.println(atributosBasicos.lastModifiedTime());
				System.out.println("---------------------------------------");
			
//				System.out.println(atributosBasicos.isDirectory());
//				System.out.println(atributosBasicos.isSymbolicLink());
//				System.out.println(atributosBasicos.isRegularFile());
				
			
				// BasicfileattributeView, PosixFileAtrributeView, DosFileAttributeView, FileOwnerAttributeView, AclFileAttributeView
				FileTime lastModified = atributosBasicos.lastModifiedTime();
				FileTime created = atributosBasicos.creationTime();
				FileTime lastAcess = fileTime.fromMillis(System.currentTimeMillis());
				BasicFileAttributeView basic = Files.getFileAttributeView(path, BasicFileAttributeView.class);
				basic.setTimes(lastModified, lastAcess, created);
				atributosBasicos = Files.readAttributes(path, BasicFileAttributes.class);
				
				
				System.out.println(atributosBasicos.creationTime());
				System.out.println(atributosBasicos.lastAccessTime());
				System.out.println(atributosBasicos.lastModifiedTime());
				
				
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
