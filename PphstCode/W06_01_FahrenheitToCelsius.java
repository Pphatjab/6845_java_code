import java.util.Scanner; // รับข้อมูลจากผู้ใช้ทางแป้นพิมพ์ (keyboard)
public class W06_01_FahrenheitToCelsius { // ประกาศชื่อ class FahrenheitToCelsius
  public static void main(String[] args){  //เมธอดหลัก เป็นจุดเริ่มต้นที่ Java

        Scanner niput = new Scanner(System.in);  //สร้าง อ็อบเจกต์ niput ของคลาส Scanner

        System.out.print("Enter (°F) = "); // คำสั่ง print ให้พิม fahrenheit
         double fahrenheit = (niput.nextDouble()); // รับค่าที่ผู้ใช้พิมมา เป็นเลขทศนิยม
         double celsius  = (5.0 / 9.0) * (fahrenheit - 32); //  คำนวณค่า เซลเซียส (°C) จากฟาเรนไฮต์ (°F)
         System.out.println(" fahrenheit (°F) = " + fahrenheit); // แสดงผล (°F)
         System.out.println(" celsius (°C) = " + celsius ); // แสดงผล (°C)
         
         }   //ปิดเมธอด main

      } // ปิดคลาส FahrenheitToCelsius
