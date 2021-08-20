/**
 * 
 */
package br.com.estudos.GOrientacaoAObjetos.enumeracao;

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
		Cliente cliente = new Cliente("Ana", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
		Cliente cliente2 = new Cliente("Akira", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);
		System.out.println(cliente);
		System.out.println(cliente2);
		System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
	    System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
	    
	    TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
	    System.out.println(tipoCliente);
	    
	    TipoCliente tipoCliente2 = TipoCliente.tipoClientePorNome("Pessoa f�sica");
	    System.out.println(tipoCliente2);
	    
	    
	    
	}
	

}
