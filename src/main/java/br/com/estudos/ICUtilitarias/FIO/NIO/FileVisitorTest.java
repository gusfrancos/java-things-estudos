package br.com.estudos.ICUtilitarias.FIO.NIO;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class FileVisitorTest {

	public static void main(String[] args) throws IOException {
		Files.walkFileTree(Paths.get("pasta"), new AcharTodosOsBkps());
	}

}

class AcharTodosOsBkps extends SimpleFileVisitor<Path>{
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
		if(file.getFileName().toString().endsWith(".bkp")) {
			System.out.println(file.getFileName());
		}
		return FileVisitResult.CONTINUE;
		
	}
}
