
    public class Shapes_8 {
        int length;
        int width;

        Shapes_8(int a, int b) {
            this.length = a;
            this.width = b;
        }

        int area() {
            return this.length * this.width;
        }
    }

         class Triangle_1 extends Shapes_8{
            Triangle_1(int a, int b) {
                super(a, b);
            }

            int area() {
                return (int) ((0.5f) * this.length * this.width);
            }
        }

         class Square_1 extends Shapes_8{
            Square_1(int a, int b) {
                super(a, b);
            }
            int area()
            {
                return this.length*this.length;
            }
}

    class Rectangle_1 extends Shapes_8{
        Rectangle_1(int a, int b) {
            super(a, b);
        }
        int area()
        {
            return this.length*this.width;
        }
    }
class test{
        public static void main(String[] args) {
            Shapes_8 ob1 = new Square_1(3,8);
            Shapes_8 ob2 =new Triangle_1(5,4);
            Shapes_8 ob3 =new Rectangle_1(5,4);
            System.out.println("the area of Triangle is:"+ob2.area());
            System.out.println("the area of Square is:"+ob1.area());
            System.out.println("the area of Rectangle is:"+ob3.area());
        }

    }