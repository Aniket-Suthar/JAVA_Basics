import java.util.Scanner;
    public class PatternTen {
        static void pattern(int n){
            for (int row = 0; row <=n; row++) {
                for (int space = 0; space <n-row; space++) { // loops for upper part printing
                    System.out.print(" ");
                }
                for (int col = 0; col < row; col++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
            for ( int row= n-1; row >= 1; row--) {   //loops for lower star printing
                for (int space =n-row;space>=1; space--) {
                    System.out.print(" ");
                }
                for (int col =row ; col >=1; col--) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            System.out.println("PROGRAM FOR PATTERN PRINTING..");
            System.out.print("ENTER THE MAX STAR TO PRINT:");
            Scanner  sc = new Scanner(System.in);
            int n = sc.nextInt();
            pattern(n);

        }
    }



