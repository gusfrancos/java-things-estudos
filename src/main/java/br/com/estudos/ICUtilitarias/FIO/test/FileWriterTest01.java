package br.com.estudos.ICUtilitarias.FIO.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//File
//FileWriter
//FileReader
//BufferedWriter
//BufferedReader
public class FileWriterTest01 {
 public static void main(String[] args) {
     File file = new File("file.txt");
     try(FileWriter fw = new FileWriter(file,true)) {
       fw.write("O DevDojo � lindo, � o melhor curso do brasillllllll\nContinuando a cantoria na pr�xima linha\n");
       fw.flush();
     } catch (IOException ex) {
         ex.printStackTrace();
     }
 }
}
