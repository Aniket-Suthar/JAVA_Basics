public class Boxweight extends Box{
    double weight;
    Boxweight(double w){
        this.weight=w;
    }
    Boxweight(){
        super();
    }
    Boxweight(double l,double w,double h,double wg){
        super(l,w,h);  //used to initialise values of parent class or calling the constructor of parent class
        this.weight=wg;
    }
    Boxweight(Boxweight a){
        super(a);
        weight =a.weight;
    }
}
