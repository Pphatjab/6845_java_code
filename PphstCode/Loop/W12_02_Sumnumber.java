package Loop;
import java.util.Scanner;
public class W12_02_Sumnumber {
     public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int star,stop;
       
          do{
            System.out.println("Star number must be less than Stop number");
            System.out.print("Enter a Star number : ");
             star = kb.nextInt();
            System.out.print("Enter a Stop number :");
             stop = kb.nextInt();

             int sum = 0;
              int counc = 1;

                if (star < stop) {
                    for (int i = star; i <= stop; i++) {
                        System.out.println("round " + counc + ": " + sum + "+" + i + "=" + (sum += i));
                        counc++;
                    }
                } else{
                     System.out.println("Start number be less than Stop number. ");
                    }
            } while(star<=stop);
                 kb.close();

    }
        
}
    


     

