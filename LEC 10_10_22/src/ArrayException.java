import java.util.Scanner;
 class ArrayException {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Scanner sc = new Scanner((System.in));
        System.out.println("The array is:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Enter the index find the element:");
        int a=sc.nextInt();

        try{
            System.out.println("The array element is: "+arr[a]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Sorry the index is not present in array...");
        }
    }
}

