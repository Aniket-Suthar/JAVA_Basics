public class DistanceMEasure {
    private final int km=1000;
    public static int start;
    public static int end;
    public static int dist;
    int x;

    DistanceMEasure(int start,int end){
        this.start=start;
        this.end=end;

    }
    static int  Output(){
        DistanceMEasure.dist=DistanceMEasure.start-DistanceMEasure.end;
        return  DistanceMEasure.dist;
        //calling method using class name as the method is static
    }
    public void metre(){

        System.out.println("Distance in metre is:"+ this.Output()*km + " metres");
        //  can't change the value of km as it is final
    }
    protected void feet(){
        System.out.println("Distance in feet is:"+ this.Output()*3280 + " feets");
    }
    public void change(int a){   //primitive data type pass by value
         x =a;
    }


}
class mn{
    public static void main(String[] args) {
        DistanceMEasure d1 = new DistanceMEasure(45,22);
        d1.metre();
        d1.feet();
        int x= 50;
        d1.change(56);  // pass by value of primitive data type
        System.out.println("the value of x is: " + x);
    }
}
