import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String []args){
       // Scanner sc = new Scanner(System.in);
        for(int i =100;i<1000;i++){
            if(arms(i)){
                System.out.println(i);
            }
        }
        //int a = sc.nextInt();
        //boolean ans=arms(a);
        //System.out.println(ans);
    }
    static boolean arms(int a) {
        int sum = 0;
        int original = a;
        while (a > 0) {
            int rem = a % 10;
            a = a / 10;
          //  int c = a * a * a;
            sum= sum + rem*rem*rem;
        }
        if (sum ==original) {
            return true;
        }
        return false;
        }
    }

