package br.com.estudos.OMethodReference.service;

import br.com.estudos.OMethodReference.dominio.Anime;

public class AnimeComparators {
    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByEpisodesNonStatic(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}