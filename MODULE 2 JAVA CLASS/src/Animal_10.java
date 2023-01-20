public class Animal_10 {
    void print() {
        System.out.println("You are in Animal parent class...");
    }
}

class Dog extends Animal_10 {
    void print() {
        System.out.println("You are in dog subclass..");
    }
}

class Cat extends Animal_10 {
    void print() {
        System.out.println("You are in Cat subclass..");
    }
}

class test2 {
    public static void main(String[] args) {
        Animal_10 ob = new Dog();
        ob.print();
        Animal_10 ob1 = new Cat();
        ob1.print();
        Animal_10 ob2 = new Animal_10();
        ob2.print();

    }
}