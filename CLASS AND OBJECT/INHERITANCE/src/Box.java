public class Box {
    double l;
    double w;
    double h;

    Box(){
        l=-1;
        w=-1;
        h=-1;
    }

    Box(double l){
        this.l=l;
    }
    Box(double l,double w,double h){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box s){
        this.l=s.l;
        this.w=s.w;
        this.h=s.h;
    }
}
