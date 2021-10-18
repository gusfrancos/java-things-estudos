package br.com.estudos.JColecoes.test;

import br.com.estudos.JColecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC1", "iPhone");
        Smartphone s2 = new Smartphone("1ABC1", "Pixel");
        Smartphone s3 = new Smartphone("1ABC1", "iPhone");
        
        
        //só da true por causa da sobscrita do método equals no smarthphone
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
