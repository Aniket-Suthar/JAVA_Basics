import java.util.Arrays;
import java.util.Scanner;
public class ArraySorting {
        public static void main(String[] args) {
            System.out.println("PROGRAM TO SORT ARRAYS ");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of Array : ");
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter the Element " + (i + 1) + ":");
                a[i] = sc.nextInt();
            }
            int temp;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
            System.out.println("The Sorted Array is " + Arrays.toString(a));
        }
    }

