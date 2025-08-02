package model.repository;

import java.util.ArrayList;
import java.util.List;

import model.enteties.Anime;

public class AnimeList {
    private List<Anime> animes = new ArrayList<>();

    public List<Anime> getAnimes() {
        return animes;
    }
    
    public void addAnime(Anime anime){
        animes.add(anime);
    }

    public void delAnime(Anime anime){
        animes.remove(anime);
    }

    public Anime findByCode(long cod){
        Anime choicedAnime = null;
        for (Anime anime : animes) {
            if (cod == anime.getCod()) {
                choicedAnime = anime;
                break;
            }
        }
        return choicedAnime;
    }

    public void list(){
        for (Anime anime : animes) {
            System.out.println(anime.toString());
        }
    }
    
}
