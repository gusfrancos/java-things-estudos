package br.com.estudos._007_.oo.enumeracao;

public class Cliente {
	
	enum TipoPagamento {
		AVISTA, APRAZO
	}
	
	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;
	
	
	public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipoCliente;
		this.tipoPagamento = tipoPagamento;
	}
	
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipoCliente + ", tipoPagamento=" + tipoPagamento + "]";
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}