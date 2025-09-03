package Loop;

import java.util.Scanner;

public class W12_01_For_Sumnumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        
            System.out.print("Enter a Star number : ");
            int star = kb.nextInt();
            System.out.print("Enter a Stop number :");
            int stop = kb.nextInt();

        while(star<=stop);{
            System.out.println("Star number must be less than Stop number");
            System.out.println("Enter a Start number");
            System.out.print("Enter a Star number : ");
             star = kb.nextInt();
            System.out.print("Enter a Stop number :");
             stop = kb.nextInt();

        }
           int sum = 0;
            int counc = 1;

            for (int i = star; i <= stop; i++) {
                System.out.println("round " + counc + ": " + sum + "+" + i + "=" + (sum += i));
                counc++;
            }
        }
        
        // if (star < stop) {
        // } else {
        //     System.out.println("erro");
        // }
        // kb.close();
}