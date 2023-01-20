package pack2;

import pack1.package_new;   //calling the package already created
public class package_new2 extends package_new{
    public void hello(){
        System.out.println("Hello ANIKET,welcome to PDEU...");
    }

    public static void main(String[] args) {
        package_new p1 = new package_new();
        p1.hello();     //calling method from old package created
        package_new2 p2 = new package_new2();
        p2.hello();    //calling methods of newly created package
        p2.department();

    }
}
