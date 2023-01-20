import java.util.Scanner;

 class ArithException {
    public static void main(String[] args) {
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter the first no.:");
            int a=sc.nextInt();
            System.out.print("Enter the second no.:");
            int b= sc.nextInt();
                    try {
                        System.out.println("the division is:" + (a / b));
                    }
                    catch (ArithmeticException e){
                        System.out.println("CAN'T PERFORM DIVISION,DENOMINATOR IS NOT VALID");
                    }
        }
    }
}
