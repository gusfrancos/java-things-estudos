package br.com.estudos._007_.oo;

public class ModifiersThings {
	
	/*Os modificadores de acesso são padrões de visibilidade de acessos às classes, atributos e métodos. 
	 * Esses modificadores são palavras-chaves reservadas pelo Java, ou seja, palavras reservadas não podem 
	 * ser usadas como nome de métodos, classes ou atributos.
	 * Como boas práticas (best practices) do Java, na maioria das declarações de variáveis de instância são definidos
	 *  os seus atributos com a palavra-chave private, para garantir a segurança de alterações acidentais, 
	 *  sendo somente acessíveis através dos métodos. Essa ação tem como efeito ajudar no encapsulamento dos dados, 
	 *  preservando ainda mais a segurança e a aplicação de programação orientada a objetos do Java.
	 *  Ver exemplo  ModifiersBestPratice.java
	 *  
	 *  
	 *  Não é permitida a combinação entre private e var
	 *  private var x = 10;
	 *  
	 *  
	 *  
	 *  The correct order  of retritividade:
public < protected < package (or default) < private
*/
	
	//Modificadores de acesso
	// private (somente para seus métodos e atributos)
	/*  Os membros da classe definidos como não podem ser acessados ou usados por nenhuma outra classe. 
	 * Esse modificador não se aplica às classes, somente para seus métodos e atributos. 
	 * Esses atributos e métodos também não podem ser visualizados pelas classes herdadas. *
	 */
	
	// public (para classes, métodos e atributos) 
	/*Uma declaração com o modificador public pode ser acessada de qualquer lugar e por qualquer entidade 
	 * que possa visualizar a classe a que ela pertence.
	 */
	
	// Modificador padrão (default) (sem modificador explicito): conhecido com friendly: (para classes, métodos e atributos)
	/* A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração 
	 * não é definido nenhum tipo de modificador, sendo este identificado pelo compilador.
	 */

	//protected (somente para seus métodos e atributos)
	/* O modificador protected torna o membro acessível às classes do mesmo pacote ou através de herança, 
	 * seus membros herdados não são acessíveis a outras classes fora do pacote em que foram declarados.
	 */
	
	// static
	/* É usado para a criação de uma variável que poderá ser acessada por todas as instâncias de objetos desta 
	 * classe como uma variável comum, ou seja, a variável criada será a mesma em todas as instâncias e quando 
	 * seu conteúdo é modificado numa das instâncias, a modificação ocorre em todas as demais. E nas declarações 
	 * de métodos ajudam no acesso direto à classe, portanto não é necessário instanciar um objeto para acessar 
	 * o método.
	 * 
	 * //uma variavel estatica é um membro da classe e se vc alterar o valor dela em uma objeto
		// todas as instancias da classe observará o valor modificado
	 */
	
	// abstract (só em classes e métodos)
	/* Esse modificador não é aplicado nas variáveis, . 
	 * Uma classe abstrata não pode ser instanciada, ou seja, não pode ser chamada pelos seus construtores. 
	 * Se houver alguma declaração de um método como abstract (abstrato), a classe também deve ser marcada 
	 * como abstract.
	 * Uma classe abstrata pode ser extendida por uma classe abstrata ou por uma concreta
	 * 
	 */
	
	// final
	/* Quando é aplicado na classe, não permite estende-la, 
	 * nos métodos impede que o mesmo seja sobrescrito (overriding) 
	 * na subclasse, e 
	 * os valores de variáveis do tipo primitivo não podem ser alterado depois que já tenha sido atribuído um valor.
	 * As váriaveis do tipo reference ncom modificador final não podem ter uma nova referencia mas podemos
	 * alterar os valores dentro do objeto
	 * 
	 */
	
	//Uma interface pode ser extendida por outra interface
	//uma interface não pode ser extendida por outra classe
	//qualquer classe, inclusive uma abstrata pode implementar uma interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
