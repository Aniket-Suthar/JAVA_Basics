import java.util.Scanner;

public class MathematicalOperation {
    public static void main(String[] args) {
        System.out.println("PROGRAM FOR PERFORMING MATHEMATICAL OPERATIONS");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a =sc.nextInt();
        System.out.print("Enter the second number:");
        int b =sc.nextInt();
        System.out.printf(" The sum of %d and %d is : %d",a,b,a+b);
        System.out.printf("\n The difference of %d and %d is : %d",a,b,a-b);
        System.out.printf("\n The division of %d and %d is : %d",a,b,a/b);
        System.out.printf("\n The multiplication of %d and %d is : %d",a,b,a*b);
        System.out.printf("\n The modulus of %d and %d is : %d",a,b,a%b);
    }
}
