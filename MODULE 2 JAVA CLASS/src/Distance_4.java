public class Distance_4 {    //question 2 part 2
    public static void main(String[] args) {
        Distance1 d1 = new Distance1(89,22);
        d1.print();
    }
}
 class Distance1{
    double strtpt;
    double endpt;
    double pos;


    Distance1(){
        this(5,5);



    }
    Distance1(double a1,double b1) {
        this.strtpt = a1;
        this.endpt = b1;
    }

     double  calculate(){
       this.pos= strtpt- endpt;
       return this.pos;
    }
    void print(){
        System.out.println("The distance covered is:" + calculate());
    }

}
