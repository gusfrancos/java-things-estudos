package br.com.estudos.MClassesInternas.tests;

//classes locais s�o classe criadas dentro do corpo de um m�todo
public class OuterClassesTest02 {
	private String nome = "Midoriya";
	
	void print() {
		String lastName = "Izuku";
		class LocalClass{
			public void printLocal() {
				System.out.println(nome + " " + lastName);
			}
		}
		
		LocalClass localClass = new LocalClass();
		localClass.printLocal();
	}
	
	public static void main(String[] args) {
		
	}

}
