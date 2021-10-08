package br.com.estudos.ICUtilitarias.FIO.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderTest {
	public static void main(String[] args) {
		File file = new File("Arquivo.txt");
		
		try (FileWriter fw = new FileWriter(file);
				FileReader fr = new FileReader(file)) {
			fw.write("Escrevendo uma mensagem no arquivo\n");
			fw.flush();
			char[] in = new char[500];
			int size = fr.read(in);
			System.out.println(size);
			
			for(char c: in) {
				System.out.println(c);
			}
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}		
		
		
		
		
		
				
//		try {
//			//sobrescreve o arquivo a cada vez q executar
//			//FileWriter fw = new FileWriter(file);
//			
//			//realiza um append
//			FileWriter fw = new FileWriter(file, true);
//			
//			fw.write("Escrevendo uma mensagem no arquivo\n");
//			fw.flush();
//			fw.close();
//			
//			FileReader fr = new FileReader(file);
//			char[] in = new char[500];
//			int size = fr.read(in);
//			System.out.println(size);
//			
//			for(char c: in) {
//				System.out.println(c);
//			}
//			fr.close();
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	
