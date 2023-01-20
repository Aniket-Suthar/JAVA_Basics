class Nthread extends Thread {
    public void run() {
        for (int i = 1; i < 3; i++) {
            System.out.println(i + "-" + this.getName() + " Running..");
        }
    }

}


class PriorityThread_13 extends Nthread {
    public static void main(String[] args) throws InterruptedException {
        Nthread n1 = new Nthread();
        Nthread n2 = new Nthread();
        Nthread n3 = new Nthread();

        //ssetting priorities of various threads
        n3.setPriority(MAX_PRIORITY);
        n2.setPriority(NORM_PRIORITY);
        n1.setPriority(MIN_PRIORITY);


        n1.start();
        n2.start();
        n3.start();
    }
}
