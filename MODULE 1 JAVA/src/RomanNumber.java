import java.util.Scanner;
public class RomanNumber {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("PROGRAM TO CONVERT DECIMAL NUMBER TO ROMAN NUMBER");
            System.out.print("Enter a Decimal number :");
            int n1 = sc.nextInt();

            String[] u = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
            String[] t = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};

            String r = t[n1/10] + u[n1%10];

            System.out.println("The Roman Number is  : "+ r);
        }
    }


