package service;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReaderService {
    private static Scanner in = new Scanner(System.in);

    public static int nextInt(){
        while (true) {
            try {
                int choice = in.nextInt();
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("\nDIGITE UMA OPÇÃO VÁLIDA POR FAVOR...");
                in.nextLine();
            }
        }
    }
    public static String netxLine(){
        return in.nextLine();
    }
}
