package Loop;
import java.util.Scanner;
public class W11_01_while_True {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        
        while (true) {
        //     //NO.1 เขียนโปรแแกรมรับตัวเลขจากคีย์บอร์ดไปเรื่อย จนกระทั้งกดเบอร์ 9 จึงจะหยุด
        //     System.out.print("Enter Number : ");
        //     int num = kb.nextInt();
        //     if(num == 9) { // คำสั้งที่ตรวจสอบการออกจากลูป
        //      break;
        //     }
        // }

           // NO.2 เขียน โปรแกรมรับตัวอักษรจากคีย์บอร์ดไปเรื่อยๆ จนกระทั้งกดตัวอังษร 'e'ถีงจะหยุด

           System.out.print("Enter Alphabet : ");
           String alphabet = kb.nextLine();
           if(alphabet.equals("e")) {
            break;
                
           }
        }
        
    }
}
