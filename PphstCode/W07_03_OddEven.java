import java.util.Scanner;
public class W07_03_OddEven {
    public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    
    //input : รับค่าจำนวณเต็มจากผู้ใช้
    System.out.print("Enter a number : "); // ข้อความบอกให้ผู้ใช้ป้อนตัวเลข
    int n = (kb.nextInt());           //ตัวแปรสำหรับเก็บค่าจำนวนเต็มที่ป้อนเข้ามา

    //Process : สูตรคำนวนเลขคู่และเลขคี่
    int remnants = n % 2; // เอาตัวแปร ที่รับเข้ามาไปหารด้วย 2

    // output : แสดงผลลัพธ์
    if(remnants==0) {
       System.out.println("Number " + n + " is Even");
       //ถ้าเศษที่ได้จากการหารเป็น 0 แสดงว่าเป็นเลขคู่
    }else {
    System.out.println("Number "+ n + " is odd");
    //ถ้าเศษที่ได้จากการหารไม่ เป็น 0 แสดงว่าเป็นเลขคี่
     }
    
   }
}
