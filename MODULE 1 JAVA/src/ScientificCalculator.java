import java.util.Scanner;
import java.lang.Math;
public class ScientificCalculator {
        public static void main(String[] args) {
            System.out.println(" PROGRAM FOR SCIENTIFIC CALCULATOR ");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter :");
            System.out.println(" # for taking Square Root of input.");
            System.out.println(" s for taking Sine of input.");
            System.out.println(" c for taking Cosine of input.");
            System.out.println(" t for taking Tangent of input.");
            System.out.println(" p for taking Square of input.");
            System.out.print(" Enter your Choice : ");
            String s=sc.nextLine();
            System.out.print("Enter the Number : ");
            float a =sc.nextFloat();
            switch(s.charAt(0)){
                case '#' : {
                    System.out.println("Sqaure Root of " + a + " is " + Math.sqrt(a));
                    break;
                }
                case 's' : {
                    System.out.println("Sine of " + a + " is " + Math.sin(a));
                    break;
                }
                case 'c' : {
                    System.out.println("Cosine of " + a + " is " + Math.cos(a));
                    break;
                }
                case 't' : {
                    System.out.println("Tangent of " + a + " is " +Math.tan(a));
                    break;
                }
                case 'p' : {
                    System.out.println("Square of " + a + " is " +Math.pow(a,2));
                    break;
                }
            }
        }
    }



