
    import java.util.Scanner;
    public class Capitalletters {
        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println("PROGRAM TO CALCULATE CAPITAL LETTERS");
            System.out.print("Enter the string to count capital letters: ");
            String str = scan.nextLine();
            int count=0 , n;
            n = str.length();
            if ( n==0 )
            {
                System.out.println("No string entered...");
            }
            else {
                if (Character.isUpperCase(str.charAt(0))) {  // for the element at first place
                    count++;
                }
                for (int i = 1; i < n; i++) {
                    char ch = str.charAt(i);
                    if ((ch >= 65 && ch <= 90) && (str.charAt(i - 1) == ' ')) {
                        count++;
                    }
                }
            }
            System.out.println("The Number of Words starting with a Capital Letter are :  " + count );
        }
    }




