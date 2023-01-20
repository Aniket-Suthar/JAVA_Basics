import java.util.Scanner;

class Extraq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        System.out.print("ENter the main string:");
        String s1 = sc.nextLine();
        System.out.print("ENter the checking  string:");
        String s2 = sc.nextLine();
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() - 2; i++) {
                String s3 = s1.substring(s1.length() - i - 1, s1.length()) + s1.substring(0, s1.length() - i - 1);
                if (s3.equals(s2)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("YES CHECKING sTRING IS ROTATION OF MAIN STRING ");
            } else {
                System.out.println("NO  CHECKING sTRING IS NOT THE ROTATION OF MAIN STRING ");
            }
        } else {
            System.out.println("THE LENGTHS OF STRINGS IS DIFFERENT");
        }
    }
}