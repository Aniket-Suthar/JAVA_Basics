import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MedianArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of first array:");
        float a= sc.nextFloat();
        System.out.print("Enter the size of second array:");
        float b= sc.nextFloat();
        ArrayList<Float> list=new ArrayList<>();
        float [] a1=new float[(int) a];
        float [] b1=new float[(int) b];
        System.out.println("Enter array 1...");
        for (int i = 0; i < a; i++) {
            System.out.printf("Enter element %d:",i+1);
            a1[i]=sc.nextFloat();
            list.add(a1[i]);
        }
        System.out.println("Enter the second array...");
        for (int j = 0; j < b; j++) {
            System.out.printf("Enter element %d:",j+1);
            b1[j]=sc.nextFloat();
            list.add(b1[j]);
        }
       Collections.sort(list);
        System.out.print("[");
        for (float i:list) {
            System.out.print( i+",");
        }
        System.out.print("]");
        int s=list.size();
        if(s%2!=0){
            System.out.println("The median is:"+ list.get(s/2));
        }
        else{
            System.out.println("The median is:"+ (list.get(s/2)+list.get((s/2))-1)/2);
        }
    }
}
