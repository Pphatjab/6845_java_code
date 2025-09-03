import java.util.Scanner;
public class W05_01_outputData {
 public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter value a : ");
    int a = kb.nextInt();
    System.out.print("Enter value b : ");
    int b = kb.nextInt();
    

    System.out.println("Before output for value A = " + a);
    System.out.println("Before output for value B = " + b);

    // Swap vales
    int temp = a; 
    a = b;
    b = temp;

    System.out.println("After : output  A = " + a);
    System.out.println("After : output B = " + b);

    int x = 6;
    System.out.println(x-- + ++x - --x - x-- + x++ + x);

    int d = 21, f =0;
    System.out.println("a" + (d - f ) );

    double p = 1.0, y = 1.00;
    System.out.println(p>y);

    double m = 1.6;  m += 5.1;
    System.out.println(m % 4 );

 }
}