class Mytask extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("New Thread " + i + " is running..");
        }
    }
}

class Task implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("New Runnable Thread " + i + " is running..");
        }
    }
}


class Basics {
    //main method represents main thread

    public static void main(String[] args) {
        //whatever we write here will be executed by main thread
        // in threads job is executed in sequence

        //new job "THREADING USING THREAD CLASS EXTEND METHOD"
        //mytask is known as child or worker thread
        //now main and child thread will run parallely
        Mytask m1 = new Mytask();
        m1.start();

        //new job1 "THREADING USING RUNNABLE INTERFACE IMPLEMENTS METHOD"
        Runnable r = new Task();
        Thread t1 = new Thread(r);
        t1.start();


        //job1
        System.out.println("Hello to JAVA programming..");


        //job2
        for (int i = 1; i <= 3; i++) {
            System.out.println("Thread no " + i + " is running");
        }

        //job3
        System.out.println("END of program...");
    }
}
