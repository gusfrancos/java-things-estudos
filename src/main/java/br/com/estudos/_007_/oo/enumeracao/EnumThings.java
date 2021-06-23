/**
 * 
 */
package br.com.estudos._007_.oo.enumeracao;

import br.com.estudos._007_.oo.enumeracao.Cliente.TipoPagamento;

/**
 * Voê pode criar uma Enumeração fora da classe como se fosse uma classe, 
 * vc pode criar uma enumeração dentro da classe como se fosse uma classe interna
 * não pode criar enum dentro de método 
 * 
 * Enumeração é um tipo especial de classe e por isso ele pode receber atributos e métodos
 * Pode criar mas não pode chamar construtor de enumeração
 * Construtor não pode ser public
 * as constantes de um enum têm que ficar na primeira linha da enumeração
 *
 * constant specific class body (corpo de classe especifico constante)
 * 
 * 
 */
public class EnumThings {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.APRAZO);
		System.out.println(cliente);
	}
	

}
