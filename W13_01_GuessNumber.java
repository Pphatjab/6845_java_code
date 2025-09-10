package Loop;
import java.util.Scanner;
import java.util.Random;

public class W13_01_GuessNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        int answer = rand.nextInt(10) + 1;

        int countGuess = 0;
        boolean win =false;
        
        while(countGuess<3){
            System.out.print("Enter your guess (1-10): ");
            int guess = kb.nextInt();


            if(answer==guess){
                System.out.println("Correct! You've guessed the number");
                System.out.println("===============WIN===============");
                win = true;
                break;
                
            }else{
                System.out.println("incorrect guess .Try again. ");
                System.out.println("===============LOSE===============");

            }
            countGuess++;


        } 
        if(win == false)
         System.out.println("Game Over. The correct number was : "+ answer);

         kb.close();

        
    
    }
    
}
