import java.util.Scanner;
 public class W09_01_CalculateGrade {
 public static void main(String[] args) {
  Scanner kb =new Scanner(System.in);
  System.out.println("Enter your score");
     byte score =(kb.nextByte());
        if(score <0 || score >100 ){
            System.out.println("erro ");
          }else {
            if(score >= 80){
          System.out.println("Grade : A ");
          }else if(score >= 70){
          System.out.println("Grade : B ");
          }else if (score >= 60){
         System.out.println("Grade : C ");
          }else if (score >= 50){
          System.out.println("Grade : D ");
          }else  {
          System.out.println("Grade : E ");
          }
          kb.close();

        }
    }
}