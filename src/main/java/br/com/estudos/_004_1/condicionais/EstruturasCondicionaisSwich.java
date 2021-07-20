package br.com.estudos._004_1.condicionais;

public class EstruturasCondicionaisSwich {

	public static void main(String[] args) {

		byte dia = 1;

		// char, int, byte, short, enum, String
		switch (dia) {
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		
		//default roda caso nenhum dos cases seja executado
		default:
			throw new IllegalArgumentException("Unexpected value: " + dia);
		}

	}

}
