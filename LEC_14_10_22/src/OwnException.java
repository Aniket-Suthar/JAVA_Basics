import java.util.Scanner;
class OwnException extends Exception{
    OwnException(){
        System.out.println("This is default constructor");
    }
    OwnException(int a){
        System.out.println("This is single parametrized constructor...");
    }
    OwnException(int a,int b){
        System.out.println("This is double parametrized constructor...");
    }
}
class Mainnew {
    public static void main(String[] args) {
        try{
            int i,j;
            System.out.println("Enter the value of i:");
            Scanner sc= new Scanner(System.in);
            i=sc.nextInt();
            j=sc.nextInt();
            if(i>100){
                throw new OwnException(i);
            }
        }catch(OwnException e){
            System.out.println("THe value can't be accessed...");
        }
    }
}