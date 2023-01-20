class File_4 {
    public static void main(String[] args) throws Exception {
        Bank b1 = new Bank("Aniket Suthar", 2123444);
        b1.Deposit(1000);
        System.out.println("The account no is: " + b1.accno + "\n" + "Account Holder name :" + b1.name);
        System.out.println("The credited amount is: " + b1.creditamt);
        System.out.println("The Account balance is :" + b1.accbal);
        b1.Withdraw(2000);
        System.out.println(b1.accbal);


    }


}

class Bank {
    public double creditamt = 0;
    public double debitamt;
    public double accbal = 0;
    double accno;
    String name;

    Bank(String name, double accno) {
        this.name = name;
        this.accno = accno;
    }

    public void Deposit(double creditamt) {
        this.creditamt += creditamt;
        this.accbal += this.creditamt;
    }

    public void Withdraw(double debitamt) throws Exception {
        this.debitamt = debitamt;

        if (this.debitamt > this.accbal) {
            throw new Exception("Sorry amount is more than balance..");
        } else {
            System.out.println("The Debited amount is : " + this.debitamt);
            this.accbal -= this.debitamt;
        }
    }

}
