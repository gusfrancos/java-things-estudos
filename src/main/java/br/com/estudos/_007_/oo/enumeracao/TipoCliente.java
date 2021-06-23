package br.com.estudos._007_.oo.enumeracao;

public enum TipoCliente {
	//constant specific class body (corpo de classe especifico constante)
	PESSOA_FISICA(1, "Pessoa física"), PESSOA_JURIDICA(2, "Pessoa jurídica") { 
		public String getId() {
			return "B";
		}
	};
	
	private TipoCliente(int tipo, String nome) {
		this.tipo = tipo;
		this.nome = nome;
	}

	private int tipo;
	private String nome;
	
	
	public int getTipo() {
		return this.tipo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	
	

}
