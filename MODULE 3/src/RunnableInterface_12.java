import java.sql.SQLOutput;

class RunnableMethod implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "-" + Thread.currentThread().getName() + " running using Runnable Method..");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Something Wrong has happened in system..");
        }
    }
}

class NewRunnableMethod implements Runnable {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + "-" + Thread.currentThread().getName() + " running using New Runnable Method..");
        }
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("Something Wrong has happened in system..");
        }
    }
}


class RunnableInterface_12 {
    public static void main(String[] args) throws InterruptedException {

        RunnableMethod rm = new RunnableMethod();
        Thread th1 = new Thread(rm);

        NewRunnableMethod nrm = new NewRunnableMethod();
        Thread th2 = new Thread(nrm);
        th1.start();
        th2.start();
    }
}
