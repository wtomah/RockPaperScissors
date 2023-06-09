import java.util.Random;
import java.util.Scanner;

public class Games {

    public static void singleGame() {
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        System.out.println("\nWelcome to Rock, Paper, Scissors");
        System.out.println("Rock = 1, Paper = 2, Scissors = 3");
        System.out.println("Player 1's Turn");
        //User Input
        int p1 = sc.nextInt();
        System.out.println("Player 2's Turn\n");
        //Parameters of Random
        int p2 = random.nextInt(1, 4);

        System.out.println("Player 1 selected: " + p1);
        System.out.println("Player 2 selected: " + p2);

        //if conditionals for Rock, Paper, Scissors
        // 1- Rock
        // 2-Paper
        //3-Scissors
        if (p1 == 1 && p2 == 3) {
            System.out.println("Player 1 Wins\n");
        } else if (p1 == 2 && p2 == 1) {
            System.out.println("Player 1 Wins\n");
        } else if (p1 == 3 && p2 == 2) {
            System.out.println("Player 1 Wins\n");
        } else if (p1 == 2 && p2 == 3) {
            System.out.println("Player 2 Wins\n");
        } else if (p1 == 3 && p2 == 1) {
            System.out.println("Player 2 Wins\n");
        } else if (p1 == 1 && p2 == 2) {
            System.out.println("Player 2 Wins\n");
        } else if ( p1 < 1 || p1 > 3) {
            System.out.println("Wrong Choice!. Choose again\n");
            singleGame();
        }else {
            System.out.println("Tie\t");
            singleGame();
        }

    }



    public static void gameOfThree() {
        int player_1_count = 0;
        int player_2_count = 0;
        int match = 1;
        int winner_count = 2;
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        while (player_1_count != winner_count && player_2_count != winner_count) {
            System.out.println("\nWelcome to Rock, Paper, Scissors");
            System.out.println("Match No. " + match);
            System.out.println("Rock = 1, Paper = 2, Scissors = 3");
            System.out.println("Player 1's Turn");
            //User Input
            int p1 = sc.nextInt();
            System.out.println("Player 2's Turn\n");
            //Parameters of Random
            int p2 = random.nextInt(1, 4);

            System.out.println("Player 1 selected: " + p1);
            System.out.println("Player 2 selected: " + p2);
            //if conditionals for Rock, Paper, Scissors
            if (p1 == 1 && p2 == 3) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 1) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 2) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 3) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 1) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 1 && p2 == 2) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if ( p1 < 1 || p1 > 3) {
                System.out.println("Wrong Choice!. Choose again");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else {
                System.out.println("Tie");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            }
        }

    }

    public static void gameOfFive() {
        int player_1_count = 0;
        int player_2_count = 0;
        int match = 1;
        int winner_count = 3;
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        while (player_1_count != winner_count && player_2_count != winner_count) {
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("Match No. " + match);
            System.out.println("Rock = 1, Paper = 2, Scissors = 3");
            System.out.println("Player 1's Turn");
            //User Input
            int p1 = sc.nextInt();
            System.out.println("Player 2's Turn\n");
            //Parameters of Random
            int p2 = random.nextInt(1, 4);

            System.out.println("Player 1 selected: " + p1);
            System.out.println("Player 2 selected: " + p2);
            //if conditionals for Rock, Paper, Scissors
            if (p1 == 1 && p2 == 3) {
                System.out.println("Player 1 Wins\n");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 1) {
                System.out.println("Player 1 Wins\n");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 2) {
                System.out.println("Player 1 Wins\n");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 3) {
                System.out.println("Player 2 Wins\n");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 1) {
                System.out.println("Player 2 Wins\n");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 1 && p2 == 2) {
                System.out.println("Player 2 Wins\n");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if ( p1 < 1 || p1 > 3) {
                System.out.println("Wrong Choice!. Choose again\n");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
            } else {
                System.out.println("Tie\n");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            }
        }
        }


    public static void gameOfSeven() {
        int player_1_count = 0;
        int player_2_count = 0;
        int match = 1;
        int winner_count = 4;
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        while (player_1_count != winner_count && player_2_count != winner_count) {
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("Match No. " + match);
            System.out.println("Rock = 1, Paper = 2, Scissors = 3");
            System.out.println("Player 1's Turn");
            //User Input
            int p1 = sc.nextInt();
            System.out.println("Player 2's Turn\n");
            //Parameters of Random
            int p2 = random.nextInt(1, 4);

            System.out.println("Player 1 selected: " + p1);
            System.out.println("Player 2 selected: " + p2);
            //if conditionals for Rock, Paper, Scissors
            if (p1 == 1 && p2 == 3) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 1) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 2) {
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 2 && p2 == 3) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 3 && p2 == 1) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if (p1 == 1 && p2 == 2) {
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            } else if ( p1 < 1 || p1 > 3) {
                System.out.println("Wrong Choice!. Choose again");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
            } else {
                System.out.println("Tie");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count + ".\n");
                match++;
            }
        }

    }
}