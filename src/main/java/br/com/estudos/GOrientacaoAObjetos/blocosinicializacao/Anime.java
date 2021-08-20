package br.com.estudos.GOrientacaoAObjetos.blocosinicializacao;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1 - Alocado espaco em mem�ria pro objeto
    // 2 - Cada atributo de classe � criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicializa��o � executado
    // 4 - Construtor � executado
    {
        System.out.println("Dentro do bloco de inicializacao");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {
        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}