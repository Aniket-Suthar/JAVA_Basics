import static java.lang.Math.pow;

public class Measurement_6 {
    double x;
    double y;

   Measurement_6(){
       this.x=0;
       this.y=0;
   }
    Measurement_6(double a,double b){
    this.x=a;
    this.y=b;
    }

    double calculatenew (Measurement_6 b){   //INstance distance calculation method
        return Math.sqrt(pow((this.x-b.x),2)+pow((this.y-b.y),2));
    }
    static double calculate(Measurement_6 a,Measurement_6 b){  //Static method for  distance calculation
       return Math.sqrt(pow((a.x-b.x),2)+pow((a.y-b.y),2));
    }
    static Measurement_6 midpt ( Measurement_6 s,Measurement_6 t){  //static method for midpt calculation
       Measurement_6 h = new Measurement_6();
       h.x=(s.x+t.x)/2;
       h.y=(s.y+t.y)/2;
       return h;
    }

    @Override
    public  String toString() {
        return "( "+ this.x+","+this.y +")";
    }

    public Measurement_6 midptnew (Measurement_6 s){  // INstance method for midpt calculation
       Measurement_6 r =new Measurement_6();
       r.x=(this.x+s.x)/2;
       r.y=(this.y+s.y)/2;
       return r;
    }
    public static void main(String[] args) {
        Measurement_6 m = new Measurement_6(5,4);
        Measurement_6 m1 = new Measurement_6(8,4);
        System.out.println("The instance method's distance is:"+ m.calculatenew(m1));
        System.out.println("the  static method's distance is:" + calculate(m,m1));
        System.out.println("the  static method's midpt is:" + midpt(m,m1));
        System.out.println("THe instance method's midpt is:"+m.midptnew(m1));

}
    }
