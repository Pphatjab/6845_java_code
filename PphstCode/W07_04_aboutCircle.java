import java.util.Scanner; 
public class W07_04_aboutCircle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        final double PI = 3.1416;

         //แสดงข้อความแนะนำให้ผู้ใช้เลือกว่าจะคำนวณอะไรเกี่ยวกับวงกลม
        System.out.println("Choice to calculate the area related to a circle");

        //แสดงตัวเลือกให้ผู้ใช้เลือก: 1.เส้นรอบวง Circum หรือ 2.พื้นที่ของวงกลม Area
        System.out.println("1. Circum");
        System.out.println("2. Area");
        
        //ให้ผู้ใช้ป้อนตัวเลข 1 หรือ 2 แล้วเก็บไว้ในตัวแปร choice
        System.out.println("Please Choice : (1 or 2)");
        double choice = (kb.nextDouble());

       //ขอให้ผู้ใช้ป้อนรัศมี (radius) ของวงกลม แล้วเก็บค่าไว้ในตัวแปร radius
       System.out.print("Enter Radius: "); 
       double radius = (kb.nextDouble());
  
       //ถ้าเลือก 1:
       if (choice == 1) {
           //คำนวณเส้นรอบวงด้วยสูตร 2𝜋𝑟 แสดงผลลัพธ์
        double result = 2 * PI * radius;
        System.out.println("Circum of a circle = " + result);//แสดงผลลัพธ์

        //ถ้าเลือก 2:
       }else if(choice == 2) {
        
        //คำนวณพื้นที่วงกลมด้วยสูตร 𝜋𝑟^2
           double result = PI * Math.pow(radius, 2);
           System.out.println("Area of a circle = " + result); //แสดงผลลัพธ์
       }else {

        //ถ้าเลือกอย่างอื่นที่ไม่ใช่ 1 หรือ 2 แสดงข้อความแจ้งว่าผู้ใช้ คุณไม่ได้เลือกตัวเลือกที่ถูกต้อง กรุณาเลือกเพียง 1 หรือ 2 เท่านั้น
        System.out.println("You did not choose the correct option. Please choose either 1 or 2 ");
        kb.close(); //ปิด Scanner เพื่อคืนทรัพยากรที่ใช้รับข้อมูลจากคีย์บอร์ด
        }

    }


}

