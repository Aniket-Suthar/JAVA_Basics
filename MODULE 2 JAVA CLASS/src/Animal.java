 interface Animal{
    int nolegs=4;
    void type();
    void foundin();
    void legs();
}

class Cats implements Animal{
    @Override
    public void foundin() {
        System.out.println("Cats are generally found on land");
    }

    @Override
    public void type() {
        System.out.println("Cats are most of Carnivore type");
    }
    public void legs(){
        System.out.println("THey have :"+ nolegs+" legs");
    }
}

class Dogs implements Animal{
    public void foundin() {
        System.out.println("Dogs are generally found on land");
    }

    @Override
    public void type() {
        System.out.println("Dogs are most of Carnivore type");
    }
    public void legs(){
        System.out.println("THey have :"+ nolegs+" legs");
    }
}

class tst{
    public static void main(String[] args) {
      Animal a1 = new Cats();
      a1.foundin();
      a1.type();
      a1.legs();

      Animal a2 = new Dogs();
      a2.foundin();
      a2.type();
      a2.legs();
    }
}