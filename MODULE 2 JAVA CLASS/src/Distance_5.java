public class Distance_5 {
    public static void main(String[] args) {
        Distance5 op1 =new Distance5();
        op1.print();
    }
}
class Distance5{
    double strtpt;
    double endpt;


    Distance5(double a,double b){
        this.strtpt=a;
        this.endpt=b;
    }
    Distance5(){
        this(5,5);   //this pointer
    }


    void print(){
        System.out.println ("The starting point is " + this.strtpt + "and ending point is "+this.endpt);
    }

}
