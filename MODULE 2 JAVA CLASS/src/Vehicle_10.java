class Vehicle_9 {
    String company;
    String type;

    Vehicle_9(String b, String c) {

        this.company = b;
        this.type = c;
    }

    void Print() {
        System.out.println("The company is:" + company);
        System.out.println("The type is:" + type);
    }
}

class Car1 extends Vehicle_9 {
    String fuel;
    String modelno;

    Car1(String company, String type, String fuel, String modelno) {
        super(company, type);
        this.fuel = fuel;
        this.modelno = modelno;
    }

    void Print() {
        System.out.println("THe model no of car is:" + this.modelno);
        System.out.println("THe company of car is:" + this.company);
        System.out.println("THe type of car is:" + this.type);
        System.out.println("THe type of fuel used is:" + this.fuel);
    }
}

class Car2 extends Vehicle_9 {
    String color;
    String fuel;

    Car2(String company, String type, String color, String fuel) {
        super(company, type);
        this.color = color;
        this.fuel = fuel;
    }

    void Print() {
        System.out.println("THe company of car is:" + this.company);
        System.out.println("THe type of car is:" + this.type);
        System.out.println("The Color of car is:" + this.color);
        System.out.println("THe type of fuel used is:" + this.fuel);
    }
}

class Car3 extends Vehicle_9 {

    String fuel;

    Car3(String company, String type, String fuel) {
        super(company, type);
        this.fuel = fuel;
    }

    void Print() {
        System.out.println("THe company of car is:" + this.company);
        System.out.println("THe type of car is:" + this.type);
        System.out.println("THe type of fuel used is:" + this.fuel);
    }
}

class test1 {
    public static void main(String[] args) {
        System.out.println("CAR 1\n");
        Vehicle_9 p1 = new Car1("Maruti Suzuki", "SUV", "Petrol", "MS24");
        p1.Print();
        System.out.println();
        System.out.println("CAR 2\n");
        Vehicle_9 p2 = new Car2("Ferrari", "Sedan", "Black", "Petrol");
        p2.Print();
        System.out.println();
        System.out.println("CAR 3\n");
        Vehicle_9 p3 = new Car3("Audi", "SUV", "Diesel");
        p3.Print();
    }
}

