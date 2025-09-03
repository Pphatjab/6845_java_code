package Loop;

public class W11_06_For_Even {
    public static void main(String[] args) {
        int sum = 0;
        for (int i=2; i<=20 ; i+=2){
            
            if (i<20) {
                System.out.print(i +" + ");
                
            }else{
                System.out.print(i +" = ");
            }
            sum = sum+i;
        }
         System.out.print( sum);
           
            // System.out.print( i+ " + " );
        }
    }
    

