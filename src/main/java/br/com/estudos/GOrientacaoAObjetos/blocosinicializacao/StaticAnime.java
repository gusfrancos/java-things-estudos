package br.com.estudos.GOrientacaoAObjetos.blocosinicializacao;

public class StaticAnime {
    private String nome;
    private static int[] episodios;

    // 0 - Bloco de inicializa��o � executado quando a JVM carregar classe
    // 1 - Alocado espaco em mem�ria pro objeto
    // 2 - Cada atributo de classe � criado e inicializado com valores default ou o quer for passado
    // 3 - Bloco de inicializa��o � executado
    // 4 - Construtor � executado
    static {
        System.out.println("Dentro do bloco de inicializacao est�tico 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    static {
        System.out.println("Dentro do bloco de inicializacao est�tico 2");
    }

    static {
        System.out.println("Dentro do bloco de inicializacao est�tico 3");
    }

    {
        System.out.println("Dentro do bloco de inicializacao n�o est�tico");
    }

    public StaticAnime(String nome) {
        this.nome = nome;
    }

    public StaticAnime() {
        for (int episodio : StaticAnime.episodios) {
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
