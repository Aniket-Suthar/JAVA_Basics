class Motorcycle {
    int gear;
    double speed;

    Motorcycle() {
        this.gear = 3;
        this.speed = 0;
    }

    Motorcycle(int gear, double speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void Info() {
        System.out.println("THe no. of gears present in motorcycle are: " + this.gear);
        System.out.println("The max. speed of motorcycle is:" + this.speed + " Mph");
    }
}

class MountainBike extends Motorcycle {
    double seatHeight;
    String color;

    MountainBike() {
        super();
        this.seatHeight = 0;
        this.color = "white";
    }

    MountainBike(int gear, double speed, double sheight, String color) {
        super(gear, speed);   //invoking parent class constructor using super keyword
        this.color = color;
        this.seatHeight = sheight;
    }

    public void Info() {
        System.out.println("THe no. of gears present in MountainBike  are : " + this.gear);
        System.out.println("The max. speed of MountainBike is  :" + this.speed + " Mph");
        System.out.println("The Seat heigth required in MountainBike is : " + this.seatHeight + " cm");
        System.out.println("The Color MountainBike is : " + this.color);
    }
}

class TEST {
    public static void main(String[] args) {
        Motorcycle m1 = new MountainBike(5, 250, 5, "Orange");
        m1.Info();
    }
}