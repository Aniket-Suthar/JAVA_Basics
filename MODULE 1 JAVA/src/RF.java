import java.util.ArrayList;
import java.util.Scanner;

public class RF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(5);
        int a = sc.nextInt();
        int n = 0;
        int sum = 0;
//        System.out.println("Enter the marks: ");
//        int d = sc.nextInt();
        while (a != 0) {
            System.out.println("Enter the marks: ");
            int d = sc.nextInt();
            if (d <= 100) {
                sum += d;
                a--;
            } else {
                System.out.println("enter new marks ");
                    if(d<100)
                    {d= sc.nextInt();
                    sum +=d;
                    a--;
                    }
                    else break;
            }

        }
        System.out.println(sum);
    }

}