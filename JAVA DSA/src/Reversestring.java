
import java.util.Scanner;

public class Reversestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack1 s1 = new Stack1(s.length());
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(s1.pop()+" ");
        }

        }


    }

