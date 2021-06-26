package br.com.estudos._013_.io.NIO;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
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
				
				//Path path = Paths.get(folder2\\arquivo.txt)
				
				
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
