package br.com.estudos.ICUtilitarias.FIO.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try(FileWriter fw = new FileWriter(file,true);
            BufferedWriter br = new BufferedWriter(fw)) {
            br.write("O DevDojo � lindo, � o melhor curso do brasillllllll");
            br.newLine();
            br.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
