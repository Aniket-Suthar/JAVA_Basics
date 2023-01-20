 class class_replaced_01Nov
{
    public static void main(String[] args) throws InterruptedException {

        Account mycc = new Account(10000);
        MyThread m1 = new MyThread(mycc,5000);
        MyThread m2 = new MyThread(mycc,3000);
        m1.start();
        m2.start();
    }
}


class Account
{
    int balance;
    Account(int n)
    {
        balance = n;
    }
    void credit(int amt) throws InterruptedException
    {
        System.out.println("Your current balance is: "+balance);
        System.out.println("The amount credited will be: "+amt);
        // this thread.sleep is being stopped is to show the real issue which occurs if you have a client-server connection, or computational time, etc.
       int bal = balance;
        Thread.sleep(1000);
        balance = balance + amt;
        System.out.println("The new balance will be: "+balance);
        Thread.sleep(1000);
        System.out.println("The new balance will be: "+balance);

    }
}

class MyThread extends Thread
{
    Account a1;
    int amount;
    MyThread(Account at, int amt)
    {
        a1 = at;
        this.amount = amt;
    }
    public void run()
    {
        try {
            a1.credit(amount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

