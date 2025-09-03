package Loop;

public class W10_02_While_Even10 {
    public static void main(String[] args) {
        // Loop While แสดง เลขคู่ 10 ตัวแรก โดยให้ค่าเริ่มต้นเท่ากับ2

        int i = 2 ;
        int sum =0;
        while (i <= 20) {
            sum = sum+i;
            System.out.print(i);
            
            if(i <20){
                System.out.print(" + ");
            }else {
                System.out.print(" = " + sum);
            }
            i = i+2;
        }

    }
}
