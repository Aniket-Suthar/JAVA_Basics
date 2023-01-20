
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String [] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr=new int [n];   //Taking array from user
        for(int i=0;i<n;i++){
             arr[i] =sc.nextInt();
             //int arr1[][] = new int [3][];
        }
        System.out.println(Arrays.toString(arr));
        for (int i =0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("the sum of array elements is:" + " " + sum);
        /*ArrayList<Integer> arr= new ArrayList();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            System.out.println(arr.get(i));
        }
        for(int i =0;i<n;i++){
            int sum =0;
            sum+=arr.get[i];
        } */

    }
    /*
        int [][] arr= new int[3][2];
       Scanner in = new Scanner(System.in);
       for(int row = 0;row<arr.length;row++){
           for(int col=0;col<arr[row].length;col++){
               arr[row][col]=in.nextInt();
           }
       }
       // printing 2D array
        for(int row = 0;row<arr.length;row++){
                System.out.println(Arrays.toString(arr[row]));
            }
      */
}
