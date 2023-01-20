import java.util.Scanner;

public class AddtwoNum {
    public static void main(String[] args) {
       int c = 0;int d=0;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a=sc.nextInt();
        System.out.println("Enter the target no.");
        int b =sc.nextInt();
        int [] arr = new int[a];
        System.out.println("Enter the array");
        for (int i =1 ; i < a; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            for (int j =i+1; j <a; j++) {
                if(arr[i]+arr[j]==b){
                    c=i;
                    d=j;
                  break;
                }
            }
         }
        System.out.println("The index is:"+"{"+c+","+d+"}");

    }
}

