import java.util.Scanner;
public class W07_02_square_root {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Intput: prompt the user for a number
        System.out.print("Enter a number to find its square root: " );
        double x = (input.nextDouble());

        
        
        if(x > 0) {
            //Process: calculate the square root of the number
            double squareRoot = Math.sqrt (x);
            //output the square root of the number
            System.out.println("Square root of " + x + " is " +squareRoot);
        }else {
            System.out.println("Error: The number must be positive");}
        
        
    }
    
}
