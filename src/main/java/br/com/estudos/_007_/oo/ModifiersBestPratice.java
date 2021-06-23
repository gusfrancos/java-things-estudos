package br.com.estudos._007_.oo;

public class ModifiersBestPratice {
	private int num1;
	private String str1;
	private Double d;
	private double d2;
	int def;
	protected int  teste; 
	private boolean aprovado;
	private Number bic;
	
	//Default mÈtodos È permitido somente em interfaces 
	//public default String metf() {};
	
	// padr√£o para booleano √© usar is e n√£o get
	public boolean isAprovado() {
		return aprovado;
	}
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public String getStr1() {
		return str1;
	}
	public void setStr1(String str1) {
		this.str1 = str1;
	}
	public Double getD() {
		return d;
	}
	public void setD(Double d) {
		this.d = d;
	}
	public double getD2() {
		return d2;
	}
	public void setD2(double d2) {
		this.d2 = d2;
	}

}
