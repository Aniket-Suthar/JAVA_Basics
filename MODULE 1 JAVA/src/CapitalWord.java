import java.sql.SQLOutput;
import java.util.Scanner;

public class CapitalWord {
    public static void main(String []args){
        int cap =0;
        int small=0;
        System.out.println("PROGRAM TO COUNT NUMBER OF CAPITAL LETTERS");
        System.out.print("Enter the String to check: ");
        String line =new String();
        Scanner sc =new Scanner(System.in);
        line =sc.nextLine();
        for(int i=0;i<line.length();i++){
            char ch =line.charAt(i);
            if(ch>='A'&&ch<='Z'){
                cap++;
            }
            else if(ch>='a'&& ch<='z'){
                small++;
            }
        }
        System.out.printf("THe no. of capital letters are: %d and small letters are : %d",cap,small);
    }
}
