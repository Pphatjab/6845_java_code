package Loop;
import java.util.Scanner;
public class W11_04_dowhile_ChooseMenu_SwitchCase {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
       int choice;

        //แสดงเมนูเพื่อรับ choice
        System.out.println("==================================");
        System.out.println("1. Addition ");     
        System.out.println("2. Subtraction");
        System.out.println("3. Exit ");
        System.out.println("==================================");

        do {
            //รับค่าเลือกเมนู
            System.out.println("--------------------------------");
            System.out.print("Enter your choice : ");
            choice =kb.nextInt();
            

                switch(choice){
                case 1:
                    //แสดงข้อความรับตัวเลข 2 จำนวณ  
                    System.out.print("Enter number 1 : ");   
                    int num1 = kb.nextInt();                  
                    System.out.print("Enter number 2 : ");
                    int num2 = kb.nextInt();
                    
                    int result = num1 +num2;
                    System.out.println("Addition Result : " + result);
                      break; //ออกจากswit case 
                    
                case 2:
                        //แสดงข้อความรับตัวเลข 2 จำนวณ  
                        System.out.print("Enter number 1 : ");   
                         num1 = kb.nextInt();                  
                        System.out.print("Enter number 2 : ");
                         num2 = kb.nextInt();
                        int deletion = num1 - num2;
                        System.out.println("Deletion result" + deletion);
                        break;
    
                case 3:
                        System.out.println("Exiting the Program. Goodbye!");
                        break;
                        
                default:System.out.println("Invalid choice. please try again");
                }
        }  while (choice != 3);

          kb.close();
    } 
}

                