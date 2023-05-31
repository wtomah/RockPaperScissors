import java.util.Scanner;

public class MainMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);



        System.out.println("Main Menu");
        System.out.println("1. Play Game");
        System.out.println("2. Exit");
        int choice = sc.nextInt();

        if (choice == 1) {

            gameMenu();
        } else if (choice == 2){
            System.exit(0);
        }




    }
    public static void gameMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Single Game");
        System.out.println("2. Best of 3");
        System.out.println("3. Best of 5");
        System.out.println("4. Best of 7");
        int choice = sc.nextInt();
        if (choice == 1) {

            Games.singleGame();
        }
        if (choice == 2){
            Games.gameOfThree();
        }

    }

    }
