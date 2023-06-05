import java.util.Scanner;

public class MainMenu {
    public static void menu(){
        Scanner sc = new Scanner(System.in);



        System.out.println("\nMain Menu");
        System.out.println("1. Play Game");
        System.out.println("2. Exit");
        int choice = sc.nextInt();

        if (choice == 1) {

            gameMenu();
        } else if (choice == 2){
            System.exit(0);
        }
        else {
            System.out.println("Wrong Choice");
            menu();
        }

    }
    public static void gameMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n1. Single Game");
        System.out.println("2. Best of 3");
        System.out.println("3. Best of 5");
        System.out.println("4. Best of 7");
        System.out.println("5. Go Back to Main Menu");
        System.out.println("6. Exit");
        int choice = sc.nextInt();
        if (choice == 1) {

            Games.singleGame();
        }
        else if (choice == 2){
            Games.gameOfThree();
        }
        else if (choice == 3){
            Games.gameOfFive();
        }
        else if (choice == 4){
            Games.gameOfSeven();
        }
        else if (choice == 5) {
            menu();
        }
        else if (choice == 6){
            System.exit(0);
        }
        else{
            System.out.println("Wrong Choice");
            gameMenu();
        }

    }

    }
