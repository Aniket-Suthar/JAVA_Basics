class Printer{
   //synchronized method implementation
   //synchronized void printdoc(int copies,String docname)
    void printdoc(int copies,String docname)  {
        for (int i = 0; i <=copies ; i++) {
            System.out.println("Printing " +i+ " copy of "+ docname);
        }
    }
}

//creating the thread for the printer class job
 class tsk extends Thread{
    Printer p;
    tsk(Printer p1){
        p=p1;
    }
    public void run(){

        //acquiring synchronized lock as a block method
        //no thread will be able to unlock till this block this is finished for execution

        synchronized (p) {
            p.printdoc(5, "Aniket.pdf");
        }try {
          Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}

class newtsk extends Thread {
    Printer p;
    newtsk(Printer p1){
        p=p1;
    }
    public void run(){
        synchronized (p) {
            p.printdoc(5, "Suthar.pdf");
        }try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}

class tsk3 extends Thread{
    Printer p;
    tsk3(Printer p1){
        p=p1;
    }
    public void run(){

        synchronized (p){p.printdoc(5,"Pravinkumar.pdf");
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}



//main thread
public class Basics2 {
    public static void main(String[] args) throws InterruptedException {

        //here main thread and the thread for printer class will work separately
        System.out.println("Program Starts...");

        //here two threads are working on same printer class
        //this is known as multithreading
        Printer p=new Printer();
        //thread 1 implementation
        tsk t1= new tsk(p);
        //thread 2 implementation
        newtsk t2 = new newtsk(p);

        tsk3 t3 = new tsk3(p);

        //here both threads will run in unsynchronized manner
        t3.start();

        //join method will require to make the job of t1 finish then only the job of t2 will begin
        //"join" requires exception handling
        //sleep method also requires exception handling

        //"join" method is used to make threads run in synchronized manner
        //another keyword "synchronized" can be used in front of any method to make that method's thread
        //to run in synchronized way then join method will not be required for each thread

        //LOCK METHOD
        //The keyword "synchronized" just "locks" that particular method
        //to be run by first one thread and after completing the job by first thread
        //it opens the lock to make the method available for the second thread and so on
        t2.start();
        t1.start();
        System.out.println("Program Ends...");
    }
}
