public class Distance_3 {
    public static void main(String[] args) {
        dist1 d1 = new dist1(78,2);

        d1.print();

    }
}
class dist1{
    double strtpt;
    double endpt;
    double pos;

    dist1() {
        this(2,2);
        System.out.println("This is the default constructor..");

    }
    dist1(int a){
        this.strtpt=a;

    }
    dist1(dist1 a){
        this.strtpt=a.strtpt;
        this.endpt=a.endpt;
    }
    dist1(int a,int b){
       this.strtpt=a;
        this.endpt=b;
        this.pos=strtpt-endpt;
    }

    void print(){
        System.out.println("The distance covered is :" + pos);
    }
}
