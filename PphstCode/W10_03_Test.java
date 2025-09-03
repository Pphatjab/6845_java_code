import java.util.Scanner;
public class W10_03_Test {
      public static void main(String[] args) {
        System.out.println("=============== INPUT =============== ");
      Scanner kb =new Scanner(System.in);
      System.out.print("product Name : ");
      String product = kb.nextLine();
       System.out.print("Unit Price (Baht) : ");
       double price = kb.nextDouble();
       System.out.print("Quantity : " );
       int quantity = kb.nextInt();

       double productPrice = price*quantity;
      double discount = (productPrice *7) /100;
      double netTOTAL = productPrice - discount;

       System.out.println("=============== OUTPUT =============== ");
       System.out.println("PRODUCT : " + product);
       System.out.println("UNIT X QTY : " + price+ " X "+ quantity );
       System.out.println("SUBTOTAL : " +productPrice + " Baht");
       System.out.println("DISCOUNT 7.0% : " +discount);
       System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
       System.out.println("NET TOTAL : " + netTOTAL + " Baht");
       System.out.println("====================================== ");
    }
    
}