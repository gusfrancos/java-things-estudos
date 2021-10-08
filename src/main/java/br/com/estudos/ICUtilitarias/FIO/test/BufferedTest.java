package br.com.estudos.ICUtilitarias.FIO.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
			File file = new File("Arquivo.txt");
		
		try ( BufferedWriter bw = new BufferedWriter(new FileWriter(file));
				BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			
			bw.write("Escrevendo uma mensagem no arquivo buffered");
			bw.newLine();
			bw.write("Pulou uma linha");
			bw.flush();
			bw.close();
			
			
			String s = null;
			while((s=br.readLine()) != null) {
				System.out.println(s);
			}
			
			br.close();
	
	
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
