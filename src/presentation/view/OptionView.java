package presentation.view;

import service.AnimeService;
import service.ReaderService;

public class OptionView {
    private static AnimeService animeService = new AnimeService();
    public static void getOption(){
        while (true) {
            MenuView.showMenu();
            System.out.print("------------>");
            int choice;
            do {
                choice = ReaderService.nextInt();
                ReaderService.netxLine();
            } while (choice < 1 || choice > 5);
            switch (choice) {
                case 1:
                    animeService.addAnime();
                    break;
                case 2:
                    animeService.delAnime();
                    break;
                case 3:
                    animeService.listAnime();
                    break;
                case 4:
                    animeService.updateAnime();
                default:
                    break;
            }
            if (choice == 5) {
                break;
            }
        }
    }
}
