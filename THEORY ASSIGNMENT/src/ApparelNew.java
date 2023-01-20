import java.util.Scanner;

class Apparel_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter YES to enter the shop...");
        String s = sc.nextLine();
        System.out.println("Enter the follwing to Perform");
        System.out.println("C --> PURCHASE COTTON APPAREL\n" + "S --> PURCHASE SILK APPAREL \n" + "D --> Get Details\n" + "PRESS ENTER TO CONTINUE");
        Apparel ob1 = new Silk();
        Apparel ob2 = new Cotton();
        while (!s.equals("NO")) {
            sc.nextLine();
            System.out.println("Enter what you want  to perform:");
            s = sc.nextLine();
            switch (s) {
                case "C":
                    System.out.println("Enter the price of Apparel you want :");
                    double b = sc.nextInt();
                    System.out.println("Enter the discount amount you got:");
                    double c = sc.nextInt();
                    ob1 = new Cotton(b, c);
                    break;
                case "S":
                    System.out.println("Enter the price of Apparel you want :");
                    double e = sc.nextInt();
                    ob2 = new Silk(e);
                    break;

                case "D":
                    System.out.println("Enter\n" + "1 to get Cotton Apparel's Details..\n" + "2 to get Silk Apparel's Details..\n");
                    int f = sc.nextInt();
                    if (f == 1) {
                        ob1.display();
                    } else {
                        ob2.display();
                    }
                    break;
                default:
                    System.out.println("THANKS FOR VISITING...");
                    break;

            }
        }
    }
}

class Apparel {

    private String id;
    public double price;
    public String item_type;
    private static double counter = 100;


    Apparel() {
//        System.out.println("NO APPAREL SELECTED YET....");
    }

    Apparel(double price, String item_type) {

        if (item_type.equalsIgnoreCase("Cotton")) {
            counter++;
            id = "C" + counter;
        } else if (item_type.equalsIgnoreCase("Silk")) {
            id = "S" + counter;
        }
        this.price = price;
        this.item_type = item_type;
    }


    public double calculatePrice() {
        return this.price += this.price * 0.05;
    }

    public String getItem_Id() {
        return this.id;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("The Apparel type is " + this.item_type);
        System.out.println("ID is : " + this.getItem_Id());
        System.out.println("Price of Apparel : " + this.calculatePrice());
    }


}

class Cotton extends Apparel {

    private double discount;
    public double finalPrice;

    Cotton() {
        super();
    }

    Cotton(double price, double discount) {
        super(price, "Cotton");
        this.discount = discount;
    }

    public double discountCalculate() {
        return this.price = this.price - this.discount;
    }

    public double calculatePrice() {
        this.price = super.calculatePrice();
        this.finalPrice = this.discountCalculate() + this.price * 0.05;
        return this.finalPrice;
    }

    public void display() {
        System.out.println("The Apparel type is " + this.item_type);
        System.out.println("ID is : " + this.getItem_Id());
        System.out.println("Price of Apparel : " + this.calculatePrice());
    }
}

class Silk extends Apparel {
    private double points;
    private double finalprice;

    Silk() {
        super();
    }

    Silk(double price) {
        super(price, "Silk");
    }

    public double calculatePrice() {
        this.finalprice = super.calculatePrice() + this.price * 0.1;
        return this.finalprice;
    }

    public double getPoints() {
        if (this.calculatePrice() > 10000) {
            this.points = 10;
        } else {
            this.points = 3;
        }
        return this.points;
    }

    public void display() {
        System.out.println("The Apparel type is " + this.item_type);
        System.out.println("ID is : " + this.getItem_Id());
        System.out.println("Price of Apparel : " + this.calculatePrice());
        System.out.println("Points you recieved : " + this.getPoints());
    }

}

