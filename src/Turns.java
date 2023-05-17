import java.util.Random;
import java.util.Scanner;

public class Turns {
    public static void turns(){
        //User Input
        Scanner sc = new Scanner(System.in);
        //Random
        Random random = new Random();
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
}
