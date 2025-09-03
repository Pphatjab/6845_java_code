package Loop;
import java.util.Scanner;
public class W11_02_While_True_ChooseMenu {
    public static void main(String[] args) {
        Scanner kb = new Scanner (System.in);
        //=================================        
        
        System.out.print("Enter number 1 : ");   // แสดงข้อความรับตัวเลข 2 จำนวณ   
        int num1 = kb.nextInt();                  
        
        System.out.print("Enter number 2 : ");
        int num2 = kb.nextInt();
        
        
        // =================================
        //เขียนโปรแกรมให้ผู้ใช้เลือกเมนู
        //ถ้าเลือก 1 ให้บวกเลข 2 จำนวณ
        //ถ้าเลือก 2 ให้ลบเลข 2 จำนวณ
        //ถ้าเลือก 3 ให้ออกจากโปรแกรม
        
        //แสดงเมนูเพื่อรับ choice
        System.out.println("==================================");
        System.out.println("1. Addition ");     
        System.out.println("2. Subtraction");
        System.out.println("3. Exit ");
        System.out.println("==================================");
        
        while (true) {
            
            //รับค่าเลือกเมนู
            System.out.print("Enter your choice : ");
            int choice = kb.nextInt();
            System.out.println("--------------------------------");
            if(choice == 1) { 
                int result = num1 +num2;
                System.out.println("Addition Result : " + result);
                break;
            }else  if(choice == 2) { 
                int deletion = num1 - num2;
                System.out.println("Deletion result" + deletion);
                break;
            }else if(choice == 3) { 
                System.out.println("Exiting the Program. Goodbye!");
                break;
            }else {
                System.out.println("Invalid choice. please try again");
            

            }
        }
        
        
    }
}
