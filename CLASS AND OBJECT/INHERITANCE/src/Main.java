public class Main {
    public static void main(String[] args) {
//        Box b1= new Box();
//        System.out.println(b1.l+ " " + b1.w+ " "+ b1.h);
//
//        Box b2=new Box(2.3,5.4,324);
//        System.out.println(b2.l+ " " + b2.w+ " "+ b2.h);
//
//        Box b3 =new Box(b2);
//        System.out.println(b2.l+ " " + b2.w+ " "+ b2.h);

        Boxweight b4 =new Boxweight(23,5,66,223);
        System.out.println(b4.l+ " " + b4.w+ " "+ b4.h +" "+b4.weight);

        Boxweight b5 =new Boxweight(b4);
        System.out.println(b5.l+ " " + b5.w+ " "+ b5.h +" "+b5.weight);

    }
}