package Service;

import java.util.Scanner;

public class adminService {
    static Scanner sc = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
    static
    public void menu(){
        System.out.print("""
                1. Add book
                2. Edit book
                3. Show books
                4. Users
                0. Exit
                >>>\s""");
        switch (sc.nextInt()){
            case 0 ->{
                return;
            }
            case 1 ->{addBook();}
            case 2 ->{editBook();}
            case 3 ->{showBooks();}
            case 4 ->{Users();}
            default ->{
                System.out.println(" Invalid command! ");
                menu();
            }
        }
    }

    private static void addBook() {

    }

    private static void editBook() {
    }

    private static void showBooks() {
    }

    private static void Users() {
    }
}
