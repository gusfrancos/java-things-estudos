package br.com.estudos.HExcecoes.exception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import br.com.estudos.HExcecoes.Dominio.Leitor1;
import br.com.estudos.HExcecoes.Dominio.Leitor2;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();
    }

    //try com recursos
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {

        }
    }
    
    
    //try com recursos
    public static void lerArquivo3() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {

        }
    }
    

    //modo mais feio de fazer
    public static void lerArquivo2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
}

