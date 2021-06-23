package br.com.estudos._005_.fluxcontrol;

public class ControleFluxo {
	public static void main(String[] args) {
		int idade = 15;
		boolean ehAdulto = false;
		byte dia = 5;
		int contador = 0;
		int temp = 0;
		int bola;
		
//		int [] ia = (1,2,3,4,5);
//		
//		//vc nÃ£o pode usar uma vÃ¡riavel predefinida como parte da declaraÃ§Ã£o do foreach
//		for(temp : ia) {}
//		for(bola : ia) {}
		
		//vc pode usar var para declarar a primeira varial do foreach
//		for (var kjh : ia) {}
		
				

		// comando break and continue
		// break: para o loop
		// continue: para o processamento e continua do inicio do loop
		// break pode ocorrer somente em switch, while, do ou for
		// continue pode ocorrer em while, do ou for.. nÃ£o tem continue em switchb 
		
		
		
		double valorTotal = 30000;
		for (int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal / parcela;
			if (valorParcela >= 1000) {
				System.out.println(valorParcela);
			}
			
			
		}

		// loop com for
		// for(variavel; condiÃ§Ã£o; incrementador da variavel) {}
		// nÃ£o esquecer que variavel local sÃ³ pode ser usada apÃ³s inicializada
		// vc pode usar o break para sair desta estrutura de repetiÃ§Ã£o
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
		}

		// VariaÃ§Ã£o do while
		// do {} while (condicao)
		do {
			System.out.println(contador++);
		} while (contador < 10);

		/// Roda enquanto a condiÃ§Ã£o nos parenteses for verdade
		/// while (condiÃ§Ã£o) {}
		while (contador < 10) {
			temp = ++contador;
			System.out.println("A:" + temp);
		}

		contador = 0;
		temp = 0;

		while (contador < 10) {
			temp = contador++;
			System.out.println("B:" + temp);
		}

		/// swicth case
		/// somente variÃ¡veis dos tipos (char, int, byte, short, enum e string) podem ir
		/// no switch
		/// Regras do switch
		/// 1 regra ele executa de cima para baixo
		/// 2 Apartir do momento que ele encotra o case correto, se vocÃª nÃ£o
		/// parar (comando break) ele vai entrar em todos os cases abaixo.
		//  nÃ£o pode ter dois cases com o mesmo valor
		
		///um bloco vazio de switch Ã© uma construÃ§Ã£o valida
		switch(temp) {}
		
		// long, float, double, and boolean nÃ£o podem ser usados em switch variable
		switch (dia) { // switch (5)

		// Se o default for colocado fora do final e o valor nÃ£o corresponder a nenhuma
		// condiÃ§Ã£o
		// do case abaixo, ele vai rodar todos os cases abaixo atÃ© ter um break;
		// caso ele tbm nÃ£o tenha break;
		// default:
		// System.out.println("Sempre roda ");
		case 1: // Se dia for igual a 1 entra neste case
			System.out.println("Domingo");
			break;
		case 2: // Se dia for igual a 2 entra neste case
			System.out.println("Segunda");
			break;
		case 3: // Se dia for igual a 3 entra neste case
			System.out.println("TerÃ§a");
			break;
		case 4: // Se dia for igual a 4 entra neste case
			System.out.println("Quarta");
			break;
		case 5: // Se dia for igual a 5 entra neste case
			System.out.println("Quinta");
			break;
		case 6: // Se dia for igual a 6 entra neste case
			System.out.println("Sexta");
			break;
		case 7: // Se dia for igual a 7 entra neste case
			System.out.println("SÃ¡bado");
			break;

		// Caso todos os casos seja, testados e nenhum deles corresponda ao valor da
		// variÃ¡vel de teste, serÃ¡ executado o bloco de cÃ³digo associado Ã  seÃ§Ã£o default
		// (â€œpadrÃ£oâ€�) do condicional. Neste caso, nÃ£o Ã© necessÃ¡rio acrescentar o comando
		// break, pois este Ã© sempre o Ãºltimo comando da estrutura switch.
		default:
			System.out.println("Default");

		}

		// operador ternÃ¡rio
		// var = (condicao ? sentenca verdadeira : sentenÃ§a falsa)
		ehAdulto = (idade >= 18 ? true : false);

		// if (condicÃ§Ã£o)
		if (true)
			System.out.println("entrou no true");

		// if (condicao) SENTEÃ‡A1 else SENTEÃ‡A2
		if (idade < 15) {
			System.out.println("categoria infantil");

		} else {
			System.out.println("nÃ£o pode entrar");
		}

		// if (condicao) SENTEÃ‡A1 else if (condiÃ§Ã£o) SENTEÃ‡A2
		if (idade < 15) {
			System.out.println("categoria infantil");

		} else if (idade > 15) {
			System.out.println("nÃ£o pode entrar");
		}
		
		// a volta deste ternario nÃ£o Ã© nula pois volta no args o objeto criado na referencia do main
		var hasParams = (args == null ? false : true);
		
		//if pode ser composto com dua chaves sem o else
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }

	}
}
