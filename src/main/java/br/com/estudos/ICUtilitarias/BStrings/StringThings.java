package br.com.estudos.ICUtilitarias.BStrings;

/**
 * Class StringThings
 * 
 *Links:
 *
 *Things:
 *	String é uma final class e implicitamente todos os seus métodos tambem são. (A String é imutavel)
 *	O java tem um espaço especial de memoria só para tratar String.. chamado String constant pool
 *  String são imutáveis e se vc passa a rererencia para outro método ela não muda onde foi criada
 *  String não tem o método reverse somente o StringBuilder tem
 *  String tem o método isblank que retorna true se a string estiver vazia ou só tiver espaços em branco
 *  O método substring o beginindex começa com zero o endindex começa com 1
 */
public class StringThings {
		public static void main(String[] args) {
			String str = "01234567";
			//beginindex: é o valor do index começando com index 0
			//endIndex: é o valor do index começando por 1
			System.out.println(str.substring(4, 7));
			
			
			
			
			
			//O concat não altera nada no objeto
			// para alterar o objeto o abc deveria receber o valor do concat
			String abc = "";
			abc.concat("abc");	
			
			System.out.println(3 + (100/(10*2))-13);
			
			// Como elas são imutaveis se uma segunda  variavel tiver 
			// o mesmo valor as string serão exatamente iguais porque aponta 
			// para o mesmo espaço de memoria. 
			String nome = "Gus";
			String nome2 = "Gus";
			System.out.println(nome == nome2);
			
			
			String nome3 = new String("Bicicleta"); //1 cria uma variavel de referencia  // um objeto do tipo string  // uma string no poll de string 
			
			
		}
		
		//métodos do string
		//concat
		//repeat
		//equalsIgnoreCase
		//intern
		
		
		/*Entre outras mudanças, o JDK 11 introduz 6 novos métodos para a classe java.lang.String:

			repeat(int)- Repete a string quantas vezes forem fornecidas pelo intparâmetro
			lines() - Usa um divisor para fornecer linhas preguiçosamente da string de origem
			isBlank() - Indica se a string está vazia ou contém apenas caracteres de espaço em branco
			stripLeading() - Remove o espaço em branco do início
			stripTrailing() - Remove o espaço em branco do final
			strip() - Remove o espaço em branco de ambos, início e fim da string
			Em particular, strip()é muito semelhante a trim(). */
		
		
			
}
