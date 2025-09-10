package Array;

public class W13_02_basicArray {
    public static void main(String[] args) {
        //การประกาศตัวแปร Array แบบที่ 1 ระบุสมาชิกในวงเล็บปีกกา
        // StrictMath animals [];
        String  animals [] = {"Dog","Cat","Lion"};
        int  dice [] ={1,2,3,4,5,6};
        float avgScore [] = {3.50f,4.00f,2.75f};

        //หาขนาดของ Array
        System.out.println("Size of animals array : " + animals.length);
        
        //การเข้าถึงสมาชิกใน Array
        System.out.println("Animal at index 0 : "+ animals[0]);
        System.out.println("Animal at index 2 : " + animals[2]);

        //วนลูปแสดงสมาชิก Array avgScore
        System.out.println("show all aveeage scores");
        for(int i =0;i < avgScore.length ;i++ ){
            System.out.println("Block 1" + avgScore[i]);

        }
        
        //===========================================================================================================================
        
        // การประกาศตัวแปรแบบ Array แบบที่2 ระบุขนาดของArray
        String colors[] = new String[4];
        colors[2] = "Red";
        colors[0] = "Green";
        colors [3] = "Blue";

        // int j =1;
        for(int i =0;i < colors.length ;i++ ){
            System.out.println("Block " + (i+1) + " : " +colors[i] );
            // System.out.println("Block " + j + " : " +colors[i] );
            // j++;

        }
        
        System.out.println("colors at index 0 : "+ colors[0]);
        System.out.println("colors at index 1 : " + colors[1]);
        
        System.out.println("Size of animals array : " + animals.length);

        int scores [] = new int [5];
        scores[0]= 50;
        System.out.println("Score at index 4 : " + scores[4]);

    }

        
}
