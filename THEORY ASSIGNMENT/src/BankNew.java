
import java.util.Scanner;

class BankUpd {
    public static void main(String[] args) {
        System.out.println("Welcome to ICICI Bank\n");
        Scanner sc = new Scanner(System.in);
        Bank_Branch1 id1 = new Bank_Branch1();
        System.out.println("Press 1 to enter the system and 0 to exit...");
        int a = sc.nextInt();
        System.out.println("------------------------------------------------------------------");
        System.out.println("Enter the respective Number for the following operation \n" +
                "Press 1 --> Credit Some Amount\n" +
                "Press 2 --> Loan Request\n" +
                "Press 3 --> Repaying Loan Amount\n" +
                "Press 4 --> Show Details");
        System.out.println("-------------------------------------------------------------------");
        while (a != 0) {
            System.out.print("Enter what do you want to perform ?? = ");
            a = sc.nextInt();
            switch (a) {
                case 1: {
                    sc.nextLine();
                    System.out.print("Enter Customer Account Number : ");
                    double n = Integer.parseInt(sc.nextLine());
                    System.out.print("Enter Customer Name : ");
                    String str = sc.nextLine();
                    System.out.print("Enter the amount to be credited : ");
                    double cr = Integer.parseInt(sc.nextLine());
                    id1.main = id1.main + cr;
                    id1.Credit(cr, n, str);
                    break;
                }
                case 2: {
                    System.out.print("Enter the amount for loan : ");
                    double loan = sc.nextFloat();
                    id1.loanRequest(loan);
                    break;
                }
                case 3: {
                    System.out.print("Enter the amount to be paid : ");
                    float repay = sc.nextFloat();
                    id1.repayLoan(repay);
                    break;
                }
                case 4: {
                    System.out.println("====================================================");
                    System.out.println("The Details are : ");
                    System.out.println("====================================================");
                    System.out.println("\n");
                    id1.displayDetails();
                    break;
                }
                default: {
                    System.out.println("Thank you for your valuable time!!");
                }
            }
        }
    }
}

class Bank_Branch1 {
    private static double Networth = 50000;
    private final static double Bank_NetWorth = 50000;
    private static double no_of_accounts = 0;
    public double main = 0;
    public String CustomerName;
    private double CustomerNo;
    private double AccBalance = 0;
    private double loansactioned = 0;
    private int no_of_installment;
    private double Rem_loan_amt;
    private double Total_loan_amt_sanc;
    private int Rem_no_of_installment;

    void Credit(double cr, double CustomerNo, String CustomerName) {
        this.CustomerNo = CustomerNo;
        this.CustomerName = CustomerName;
        this.AccBalance += cr;
        System.out.println("Account Balance : " + this.AccBalance);
        Bank_Branch1.Networth += cr;
        System.out.println("Bank Networth : " + Bank_Branch1.Networth);
    }

    Bank_Branch1() {

        this.AccBalance = this.AccBalance + AccBalance;
        Bank_Branch1.Networth = Bank_Branch1.Networth + AccBalance;
        this.loansactioned = 0;
        this.Rem_loan_amt = 0;
        Bank_Branch1.no_of_accounts++;
        this.Total_loan_amt_sanc = 0;
        this.Rem_no_of_installment = 0;
    }

    public void loanRequest(double Amount) {
        if (Amount > 2 * this.AccBalance && Amount > Bank_Branch1.Networth) {
            System.out.println("You cannot apply for loan\n");
        } else {
            System.out.println("Your Loan has been approved\n");
            Bank_Branch1.Networth = Bank_Branch1.Networth - Amount;
            System.out.println("New Bank Networth : " + Bank_Branch1.Networth);
            this.loansactioned += Amount;
            this.AccBalance = this.AccBalance + Amount;
            System.out.println(" New Account Balance : " + this.AccBalance);
            this.Rem_loan_amt = this.Rem_loan_amt + Amount;
            this.Total_loan_amt_sanc = this.Total_loan_amt_sanc + Amount;
        }

    }

    public void repayLoan(double amt) {
        Bank_Branch1.Networth = Bank_Branch1.Networth + amt;
        this.no_of_installment++;
        if (Rem_loan_amt == 0) {
            this.no_of_installment--;
            this.AccBalance = this.AccBalance + amt;

        } else if (amt > this.Rem_loan_amt) {
            this.AccBalance -= this.Rem_loan_amt;
            this.AccBalance = this.AccBalance + (Math.abs(this.Rem_loan_amt - amt));
            this.Rem_loan_amt = 0;

        } else {
            this.Rem_loan_amt = this.Rem_loan_amt - amt;
            this.AccBalance = this.AccBalance - amt;
            if (this.Rem_loan_amt != 0) {

                this.Rem_no_of_installment = 1;
            } else {
                this.Rem_no_of_installment = 0;
            }

        }
        System.out.println("Thanks for repaying....");
    }

    public void displayDetails() {
        System.out.println("------------------------------------------------------------------");
        System.out.println("BANK DETAILS...");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Initial Bank NetWorth = " + Bank_Branch1.Bank_NetWorth);
        System.out.println("Total No of Accounts in Bank = " + Bank_Branch1.no_of_accounts);
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------");
        System.out.println("CUSTOMER DETAIL...");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Customer Account Number = " + this.CustomerNo);
        System.out.println("Customer Name = " + this.CustomerName);
        System.out.println("Amount Credited in Bank Account(with Loan amount)= " + (this.main + this.loansactioned));
        System.out.println("Total Balance in Account (after paying Loan amount) = " + this.AccBalance);
        System.out.println("Bank's Current Networth = " + Bank_Branch1.Networth);
        System.out.println("\n");
        System.out.println("------------------------------------------------------------------");
        System.out.println("LOAN DETAILS!!");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Applied Loan Amount =  " + this.loansactioned);
        System.out.println("Remaining Loan Amount to be Paid = " + this.Rem_loan_amt);
        System.out.println("Total loan Amount Sanctioned till date = " + this.Total_loan_amt_sanc);
        System.out.println("Total Installment till date = " + this.no_of_installment);
        System.out.println("Remaining Installment till date = " + this.Rem_no_of_installment);
    }
}

