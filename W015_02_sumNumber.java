package Array;
import java.util.Scanner;
public class W015_02_sumNumber {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        double a [] = new double [5];
        double sumEven=0,sumOdd = 0,sumAll=0;
        double average =0 ;
        double max = 0 ,min = 99999999;

        //Input number 
        for(int i = 0 ;i<a.length ; i++){

            System.out.print("Enter Number "+ (i+1) + " : ");
            a[i] = kb .nextDouble();
        } 
        System.out.println("Show all num bers : ");
        for(int i= 0;i<a.length; i++ ) {
            System.out.println("index["+i+"] value = "+ a[i]);
            sumAll += a[i];

            if(a[i] % 2 != 0) {
                sumOdd += a[i];
            }else {
                sumEven += a[i];
            }
            if(a[i] > max) {
                max = a[i];
            }else if(a[i] < min) {
                min = a[i];
            }
        }
        average = sumAll/a.length;
        System.out.println("sum of all number = " + sumAll);
        System.out.println("sum of Odd numbers = " + sumOdd);
        System.out.println("sum of Even numbers = " + sumEven);
        System.out.println("Max number = "+ max );
        System.out.println("Min number = "+ min );
        System.out.println("Averahe of all numbers = "+ average);
        

        kb.close();

    }
}
