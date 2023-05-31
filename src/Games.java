import java.util.Random;
import java.util.Scanner;

public class Games {

    public static void singleGame(){
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        System.out.println("Welcome to Rock, Paper, Scissors");
        System.out.println("Rock = 1, Scissors = 2, Paper = 3");
        System.out.println("Player 1's Turn");
        //User Input
        int p1 = sc.nextInt();
        System.out.println("Player 2's Turn");
        //Parameters of Random
        int p2 = random.nextInt(1,4);

        System.out.println("Player 1 selected: " + p1);
        System.out.println("Player 2 selected: " + p2);


        //if conditionals for Rock, Paper, Scissors
        if(p1 == 1 && p2 == 2){
            System.out.println("Player 1 Wins");
        } else if (p1 == 2 && p2 == 3){
            System.out.println("Player 1 Wins");
        } else if (p1 == 3 && p2 == 1){
            System.out.println("Player 1 Wins");
        } else if (p1 == 2 && p2 == 1){
            System.out.println("Player 2 Wins");
        } else if (p1 == 3 && p2 == 2){
            System.out.println("Player 2 Wins");
        } else if (p1 == 1 && p2 == 3){
            System.out.println("Player 2 Wins");
        } else {
            System.out.println("Tie");
        }
    }

    public static void gameOfThree(){
        int player_1_count = 0;
        int player_2_count = 0;
        int winner_count = 2;
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
        while( player_1_count != winner_count && player_2_count != winner_count) {
            System.out.println("Welcome to Rock, Paper, Scissors");
            System.out.println("Rock = 1, Scissors = 2, Paper = 3");
            System.out.println("Player 1's Turn");
            //User Input
            int p1 = sc.nextInt();
            System.out.println("Player 2's Turn");
            //Parameters of Random
            int p2 = random.nextInt(1, 4);

            System.out.println("Player 1 selected: " + p1);
            System.out.println("Player 2 selected: " + p2);
            //if conditionals for Rock, Paper, Scissors
            if(p1 == 1 && p2 == 2){
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else if (p1 == 2 && p2 == 3){
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else if (p1 == 3 && p2 == 1){
                System.out.println("Player 1 Wins");
                player_1_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else if (p1 == 2 && p2 == 1){
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else if (p1 == 3 && p2 == 2){
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else if (p1 == 1 && p2 == 3){
                System.out.println("Player 2 Wins");
                player_2_count++;
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            } else {
                System.out.println("Tie");
                System.out.println("The Score is " + player_1_count + " to " + player_2_count);
            }
        }

        }
    }
