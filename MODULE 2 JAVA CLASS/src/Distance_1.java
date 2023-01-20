import java.util.Scanner;

import static java.lang.Math.abs;

public class Distance_1 {
    public static void main(String[] args){
        distance d1= new distance();
        Scanner sc = new Scanner(System.in);
        System.out.println("PROGRAM TO CALCULATE DISTANCE ");
        System.out.print("Enter starting point in meter: ");
        d1.startpt=sc.nextDouble();
        System.out.print("Enter ending point in meter: ");
        d1.endpt=sc.nextDouble();
        d1.print();
}}
class distance{
    double startpt;
    double endpt;
    double dist;
 double calculation(){
     dist=abs(startpt-endpt);
     return dist;
 }
 void print(){
     System.out.println("The distance in meter is :" + calculation()+ " "+"meters");
 }

}