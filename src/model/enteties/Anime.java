package model.enteties;

import service.ReaderService;

public class Anime {
    private long cod = 0;
    private String name, description;
    private boolean watch = false;

    public Anime(String name, String description) {
        this.cod++;
        this.name = name;
        this.description = description;
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean getWatch(){
        return watch;
    }

    public void setWath(boolean watch){
        this.watch = watch;
    }

    public void updateAnime(){
        System.out.printf("\nO QUE DESEJA ATUALIZAR DO ANIME '%s' ?", getName());
        while (true) {
            System.out.println("1 - UPDATE NAME.\n2 - UPDATE DESCRIPTION.\n3 - ASSISTIDO.\n4 - SAIR.");
            int choice = ReaderService.nextInt();
            while (choice < 1 || choice > 4) {
                System.out.println("DIGITE UMA OPÇÃO VÁLIDA POR FAVOR.");
                ReaderService.netxLine();
                choice = ReaderService.nextInt();
            }
            switch (choice) {
                case 1:
                    System.out.println("\nDIGITE O NOVO NOME:");
                    String name = ReaderService.netxLine();
                    setName(name);
                    break;
                case 2:
                    System.out.println("\nDIGITE A NOVA DESCRIÇÃO:");
                    String description = ReaderService.netxLine();
                    setDescription(description);
                    break;
                case 3:
                    System.out.println("\nESTADO DO ANIME ATUALIZADO.");
                    markAsWatched();
                    break;
                default:
                    break;
            }
            ReaderService.netxLine();
            if(choice == 0){
                break;
            }
        }
    }

    public String toString(){
        return String.format("\nCOD : %d.\nNAME : %s.\nASSISTIDO : %b.\nDESCRIPTION : %s.", getName(), getClass(), getDescription());
    }

    public void  markAsWatched(){
        if (watch) {
            setWath(false);
        }else{
            setWath(true);
        }
    }
}
