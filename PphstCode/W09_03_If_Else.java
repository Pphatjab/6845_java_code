import java.util.Scanner;
import java.time.Year;

public class W09_03_If_Else {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter Student ID : ");
        int studentID = kb.nextInt();

        if (String.valueOf(studentID).length() != 9) {
            System.out.println("Invalid Student ID");
            return;
        }

        int id = studentID / 10000000; 
        int yearBE = 2500 + id; 

        int yearCE = Year.now().getValue() + 543;
        int yearlevel = yearCE - yearBE + 1;

        if (yearlevel == 1) {
            System.out.println("1:Freshmen");
        } else if (yearlevel == 2) {
            System.out.println("2:Sophomore");
        } else if (yearlevel == 3) {
            System.out.println("3:Junior");
        } else if (yearlevel == 4) {
            System.out.println("4:Senior");
        } else {
            System.out.println(yearlevel + " Beyond 4 years");
        }

        kb.close();
    }
}
