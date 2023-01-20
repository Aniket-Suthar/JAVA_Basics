class Mythread extends Thread {
    public void run() {  //run method
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " " + this.getName() + " Running...");
        }
    }
}


class ThreadMethod_11 {
    public static void main(String[] args) throws InterruptedException {
        Mythread m1 = new Mythread();
        Mythread m2 = new Mythread();

        Mythread m3 = new Mythread();
        m3.setName("NEW THIRD THREAD");  //setname method
        Mythread m4 = new Mythread();
        m4.setName("NEW FOURTH THREAD");

        m1.start();   //start method
        m1.join();   //join method
        System.out.println();

        m2.start();
        m2.join();
        System.out.println();

        m3.start();
        m3.join();
        System.out.println();

        m4.start();
        m4.join();


    }
}
