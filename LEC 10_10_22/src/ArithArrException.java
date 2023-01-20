import java.util.Scanner;

public class ArithArrException {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] arr={1,2,3,4,5};
        System.out.print("Enter the first number:");
        int a=sc.nextInt();
        System.out.print("Enter the second number:");
        int b=sc.nextInt();
        System.out.print("Enter the index to find the array element:");
        int c=sc.nextInt();

    try{
        System.out.println("The divsion is :"+(a/b));
        System.out.println("The element of array is:"+arr[c]);
    }
    catch(ArithmeticException n) {
        System.out.println("Sorry division can't be done");
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Sorry element  can't be found..");
    }
//
}}
