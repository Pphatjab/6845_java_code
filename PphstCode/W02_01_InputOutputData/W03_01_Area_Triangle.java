import java.util.Scanner;
public class W03_01_Area_Triangle {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);// สรัางอ๊อบเจกต์ Scanner เพื่อรับข้อมูลจากผู้ใช้


        //Calculate area height of triangle
        System.out.print(" Enter base = ");//แสดงข้อความให้ผู้ใช้ป้อนฐานของรูปสามเหลี่ยม
        int base = kb.nextInt();//รับค่าฐานจากผุ้ใช้ที่กรอกผ่านคีย์บอร์ดเป้นตัวเลขจำนวนเต็ม
        System.out.print ("Enter height = ");
        int height = kb.nextInt();
        //calculate area of triangle
        double area = 0.5*base*height; // หรือใช้ชนิดข้อมูลเป้น float ก็ได้
        System.out.print("Area of Triangle =  " + area);
        
        kb.close();//ปิดอ็อบเจกต์Scanner เพื่อป้องกันการรั่วไหลของทรัพยากร 
    }
}