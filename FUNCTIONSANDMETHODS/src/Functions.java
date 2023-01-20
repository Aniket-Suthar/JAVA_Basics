import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    /*public static void main(String[] a){
    // SUMMING 2 NOS FUNCTION
            int ans = sum2();  // calling the function
            System.out.print("The sum two nums is:" + ans);
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first num:");
        int n1=in.nextInt();
        System.out.print("Enter the second num:");
        int n2=in.nextInt();
        int sum=n1+n2;
        return sum;   // returning values and functions terminates here

    }  */


   /* public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        int ans = sum(50,66);
        System.out.println(ans );
    }
    //arguments - passing values to the method in main()
    static int sum(int a ,int b){
        int sum= a+b;
        return sum;

    }*/

    //SWAPPING FUNCTION
    /*public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        swap(a,b);
       //System.out.println(v+ "  "+s);
    }
    static void swap(int a ,int b){
        int temp =a;
        a=b;
        b=temp;
        System.out.println(a+" "+ b);
    } */


    //METHOD SCOPE  //SHADOWIng
    /* static int x =22;   // this value of x is shadowed
    public static void main(String args[ ]){
        System.out.println(x); // value of x is 90 here
        int x =221;
        System.out.println(x); // value of x 221 here
        sc();
    }
    static void sc(){
        System.out.println(x);  // here value of x is 22 as it will use
        the higher level variable and the var with value of 221 is al
       is already terminated in its block itself
     */

    //VARIABLE LENGTH ARGUMENTS (VARARGS)
    /*public static void main(String [] args){
        func(2, 3, "Aniket","Suthar");
    }
    static void func(int a,int b ,String ...v){
        System.out.println(Arrays.toString(v));
    }

     */

    //FUNCTION OVERLOADING
    public static void main(String [] args){
        func("aniket");   //at compiling it will call int function
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(String b){
        System.out.println(b);
    }
}
