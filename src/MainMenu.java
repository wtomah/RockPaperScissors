import java.util.Scanner;

public class MainMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);



        System.out.println("Main Menu");
        System.out.println("1. Play Game");
        System.out.println("2. Exit");
        int choice = sc.nextInt();

        if (choice == 1) {
            Turns.turns();
        } else if (choice == 2){
            System.exit(0);
        }




    }
    }
