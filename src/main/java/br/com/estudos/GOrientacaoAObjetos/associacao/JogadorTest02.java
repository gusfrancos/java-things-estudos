package br.com.estudos.GOrientacaoAObjetos.associacao;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pel�");
        Time time = new Time("Sele��o Brasileira");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
