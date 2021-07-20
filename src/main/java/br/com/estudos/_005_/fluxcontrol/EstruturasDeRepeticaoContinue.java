package br.com.estudos._005_.fluxcontrol;

public class EstruturasDeRepeticaoContinue {

	public static void main(String[] args) {
		double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            //o continue volta a executar o for no inicio
            //não para como o break;
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }

	}

}
