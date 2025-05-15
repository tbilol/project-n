package Service;

import java.util.Scanner;

public class adminService {
    static Scanner sc = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);
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
            case 1 ->{}
            case 2 ->{}
            case 3 ->{}
            case 4 ->{}
            default ->{
                System.out.println(" Invalid command! ");
                menu();
            }
        }
    }
}
