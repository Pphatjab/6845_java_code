import java.util.Scanner;
public class W09_02_BMI {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = (kb.nextDouble());

        System.out.print("Enter height (cm): ");
        double height = (kb.nextDouble());

        double bmi = weight / (height/100 * height/100);

        System.out.println(" Your BMI is: " + String.format("%.2f", bmi));
        System.out.print ("Your body weight level si: ");
        if (bmi > 40) {
          System.out.println("Grade 3 obesity");
        }else if( bmi >= 35){
          System.out.println("Grade 2 obesity");
        }else if(bmi >= 30) {
          System.out.println("Grade 1 obesity");
        }else if(bmi >= 25){
        System.out.println("Overweight");
        }else if(bmi >= 18.5){
         System.out.println("normal weight");
        }else {
         System.out.println("Underweight");
        }


        kb.close();
    }
}
// สูตรคำนวณ BMI 
// BMI = น้ำหนัก (กก.) / (ส่วนสุง(ม.) * ส่วนสุง (ม.))