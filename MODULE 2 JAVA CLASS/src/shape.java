public abstract class shape {
    int length;
    int width;

    shape(int a, int b) {
        this.length = a;
        this.width = b;
    }

    shape(int a) {
        this.length = a;
    }

    abstract int area();

    abstract void print();
}

class triangle extends shape {
    triangle(int a, int b) {
        super(a, b);
    }

    int area() {
        return (int) ((0.5f) * this.length * this.width);
    }

    void print() {
        System.out.println("The area of triangle is:" + this.area()+ " m2");
    }

}

class square extends shape {
    square(int a) {
        super(a);
    }

    int area() {
        return this.length * this.length;
    }

    void print() {
        System.out.println("The area of square is:" + this.area()+ " m2");
    }

}

class rectangle extends shape {
    rectangle(int a, int b) {

        super(a, b);
    }

    int area() {
        return this.length * this.width;
    }

    void print() {
        System.out.println("The area of rectangle is:" + this.area()+ " m2");
    }

}

class test8 {
    public static void main(String[] args) {
        shape ob = new square(5);
        ob.print();
        shape ob1 = new rectangle(5,45);
        ob1.print();
        shape ob2 = new triangle(5,2);
        ob2.print();

    }
}
