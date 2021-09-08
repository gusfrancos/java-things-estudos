package br.com.estudos.ICUtilitarias.DInternacionalizacao.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResouceBundleThings {
	public static void main(String[] args) {
		ResourceBundle rb =  ResourceBundle.getBundle("messages", new Locale("en","US"));
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		
		
		rb =  ResourceBundle.getBundle("messages", new Locale("pt","BR"));
		
		System.out.println(rb.getString("hello"));
		System.out.println(rb.getString("good.morning"));
		
		
		//pega do messagens generico
		System.out.println(rb.getString("show"));
		System.out.println(rb.getString("video"));
		
		
	}

}
