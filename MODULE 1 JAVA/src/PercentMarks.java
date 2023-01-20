import java.util.Scanner;

public class PercentMarks {
    public static void main(String[]args){
        System.out.println( "PROGRAM TO CALCULATE PRECENTAGE");
        Scanner sc = new Scanner(System.in);
        double sum=0;
        for (int i = 1; i <= 6; i++) {
            System.out.printf("Enter the marks of %d subject ",i);
            double d= sc.nextInt();
            sum+=d;
        }
        System.out.printf("The percentage of student is : %f ",sum/6);

    }
}
