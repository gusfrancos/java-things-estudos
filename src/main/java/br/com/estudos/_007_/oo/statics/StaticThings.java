package br.com.estudos._007_.oo.statics;

//static
	/* É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta 
	 * classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias e quando 
	 * seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais. E nas declarações 
	 * de métodos ajudam no acesso direto à classe, portanto não é necessário instanciar um objeto para acessar 
	 * o método.
	 * 
	 * //uma variavel estatica é um membro da classe e se vc alterar o valor dela em uma objeto
		// todas as instancias da classe observará o valor modificado
	 */

//Nãompode acessar atributos de classe dentro de métodos estaticos
	
public class StaticThings {
	public static void main(String[] args) {
		Carro c1 = new Carro("BMW", 280);
		Carro c2 = new Carro("Audi", 275);
		Carro c3 = new Carro("Mercedez", 290);
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		
		System.out.println("Agora todas a velocidades limite terão o valor igual");
		//c2.setVelocidadeLimite(143);
		
		//uma variavel estatica é um membro da classe e se vc alterar o valor dela em uma objeto
		// todas as instancias da classe observará o valor modificado
		Carro.setVelocidadeLimite(334); 
		
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
		
		
	}
}
