import java.util.Scanner;
public class MaxNumber {
    public static void main(String []args){
        System.out.println("PROGRAM TO FIND MAXIMUM OF 3 NUMBERS");
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a =sc.nextInt();
        System.out.print("Enter the second number:");
        int b =sc.nextInt();
        System.out.print("Enter the third number:");
        int c =sc.nextInt();
        if(a>b && a>b){
            System.out.printf("The maximum number is: %d",a);
        }
        else if(b>c){
            System.out.printf("THe maximum number is : %d",b);
        }
        else{
            System.out.printf("THe maximum number is : %d",c);
        }
    }
}
