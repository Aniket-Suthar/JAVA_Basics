import java.util.Scanner;
public class MethodOverloading {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Press 1 to find area of Circle and 2 for Area of rectangle (Dimensions in cm):");
            int m =sc.nextInt();
            if(m==1){
                System.out.print("Enter the radius:");
                double n = sc.nextDouble();
                getArea(n);      //calling method to calculate area
            }
            else if(m==2){
                System.out.print("Enter the length:");
                int o= sc.nextInt();
                System.out.print("Enter the width:");
                int p= sc.nextInt();
                getArea(o,p);
            }
            else{
                System.out.println("YOu have entered wrong choice");
            }
        }
        static void getArea(double a){     //method with single argument
            double ar=Math.PI*a;
            System.out.printf("The Area of Circle with Radius %f is %f cm2",a,ar);
        }
        static void getArea(int a,int b){
            int ar=a*b;
            System.out.printf("The Area of rectangle is %d cm2",ar);
        }

    }


