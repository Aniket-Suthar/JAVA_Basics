import java.util.LinkedList;

class Threadexample {
    public static void main(String[] args) throws InterruptedException {
        Test p1 = new Test();
        class Mythread extends Thread {
            public void run() {
                try {
                    p1.produce();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // Create consumer thread
        class Mythread1 extends Thread {
            public void run() {
                try {
                    p1.consume();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        Mythread t1 = new Mythread();
        Mythread1 t2 = new Mythread1();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }

    public static class Test {
        LinkedList<Integer> list = new LinkedList<>();
        int capacity = 2;

        // Function called by producer thread
        public void produce() throws InterruptedException {
            int val = 0;
            while (true) {
                synchronized (this) {

                    while (list.size() == capacity) wait();
                    System.out.println("Producer produced this = "  + val);
                    list.add(val++);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }


        public void consume() throws InterruptedException {
            while (true) {
                synchronized (this) {
                    while (list.size() == 0)
                        wait();

                    int val = list.removeFirst();
                    System.out.println("Consumer consumed this = " + val);
                    notify();
                    Thread.sleep(1000);
                }
            }
        }
    }
}