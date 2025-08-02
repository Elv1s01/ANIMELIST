package service;

import model.enteties.Anime;
import model.repository.AnimeList;

public class AnimeService {
    private AnimeList animeList = new AnimeList();
    
    public void addAnime(){
        System.out.println("VAMOS CADASTRAR UM NOVO ANIME:\n");
        System.out.println("DIGITE O NOME DO ANIME:");
        String name = ReaderService.netxLine();
        System.out.println("DIGITE UMA DESCRIÇÃO PARA O ANIME:");
        String description = ReaderService.netxLine();
        animeList.addAnime(new Anime(name, description));
        System.out.println("ANIME CADASTRADO COM SUCESSO.");
    }

    public void delAnime(){
        System.out.println("\nVAMOS DELETAR UM ANIME CADASTRADO:");
        animeList.list();
        System.err.println();
        System.out.print("DIGITE O CÓDIGO DO ANIME QUE DESEJA REMOVER:");
        while (true) {
            int cod = ReaderService.nextInt();
            Anime anime = animeList.findByCode(cod);
            if (anime == null) {
                System.out.println("CÓDIGO INEXISTENTE, TENTE NOVAMENTE COM UM VALOR VÁLIDO.");
                ReaderService.netxLine();
                continue;
            }
            animeList.delAnime(anime);
            System.out.println("\nANIME DELETADO COM SUCESSO.");
        }
    }

    public void listAnime(){
        System.out.println("\n-----ANIMES CADASTRADOS NA SUA LISTA-----\n");
        animeList.list();
    }

    public void updateAnime(){
        animeList.list();
        System.out.println("DIGITE O CÓDIGO DO ANIME QUE DESEJA ATUALIZAR.");
        Anime anime = animeList.findByCode(ReaderService.nextInt());
        while (anime == null) {
            System.out.println("CÓDIGO INVÁLIDO, DIGITE UM CÓDIGO DE UM ANIME CADASTRADO EXISTENTE.");
            ReaderService.netxLine();
            anime = animeList.findByCode(ReaderService.nextInt());
        }
        anime.updateAnime();
        System.out.println("ANIME ATUALIZADO COM SUCESSO.");
    }
}

