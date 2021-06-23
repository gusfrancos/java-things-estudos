package br.com.estudos._007_.oo;

public class BlocosDeInicializacao {
	//Etapas da inacialização de um objeto
	// 1 - Bloco de inicialização estatico é executado antes de qualquer coisa e só roda uma vez.
	// 2 - Aloca espaço na memória para o objeto que será criado
	// 3 - Cada atributo de classe é inicializado com seus valores default ou valores explicitos
	// 4  - Bloco de inicialização padrão é executado
	// 5 - o construtor é executado
	
	private int [] parcelas;
	
	private static int [] bicicletas;
	
	//Blocos de inicialização estaticos são executados apenas uma ves e não acada instancia criada
	//Blocos de inicialização estatico roda antes que os clocos de inicialização normais
	static {
		bicicletas = new int[]{1, 2, 3, 4}; 
	}
	
	
	
	//para criar um bloco de inicialização vc abre e fecha chaves
	//boas praticas indicam colocar este bloco antes do construtor.. porém se vc colocar em outro lugar ele vai ser executado antes de qualquer maneira
	{
		System.out.println("Bloco de inicialização");
		parcelas = new int[]{1,2,3,4,5,6,7,8,9};
	}
	
	//Blocos de inicialização estaticos
	
	
	
	private void BlocosDeInicializacao() {
		System.out.println("Construtor1");
		for(int parce: this.getParcelas()) {
			System.out.println(parce);
		}
		
	}
	
	public int[] getParcelas() {
		return parcelas;
	}

	public void setParcelas(int[] parcelas) {
		this.parcelas = parcelas;
	}

	
	
	
	
	public static void main(String[] args) {
		System.out.println("Antes de Instanciar");
		BlocosDeInicializacao b = new BlocosDeInicializacao();
		System.out.println("Depois de Instanciar");
		
		for(int parce: b.getParcelas()) {
			System.out.println(parce);
		}
		
	}
}
