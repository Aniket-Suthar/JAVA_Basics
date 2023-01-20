public abstract class parent {
    int age;
    public parent(int a){   // constructor of parent class
        this.age=a;
    }
    static void greeting(){
        System.out.println("HEllO...");
    }
    abstract void career();
    abstract void school();
}
