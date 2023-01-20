import java.util.Scanner;

public class Bank {
        public static void main(String[] args) {
//            System.out.println("Welcome to ICICI Bank\n");
            Bank_Branch id1=new Bank_Branch(342434,"ABCD EF");
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter no. to do following and Press 1 to Proceed");
            System.out.println("1=Credit Amount.");
            System.out.println("2=Apply for loan.");
            System.out.println("3=Repay Loan  Amount.");
            System.out.println("4=Get details.");
            int p=sc.nextInt();
            while(p!=0){
                System.out.println("Enter what you want to do...");
                 p=sc.nextInt();
            switch(p) {

                case 1: {
                    System.out.println("Enter the amount to credit..");
                    float c = sc.nextFloat();
                    id1.main=id1.main+c;
                    id1.credit(c);
                    break;
                }
                case 2: {
                    System.out.println("Enter the amount of loan required");
                    float f = sc.nextFloat();
                    id1.loanRequest(f);
                    break;
                }
                case 3: {
                    System.out.println("Enter the amount of loan to be repaid");
                    float m = sc.nextFloat();
                    id1.repayLoan(m);

                    break;
                }
                case 4: {
                    System.out.println("THE DETAILS ARE..");
                    id1.displayDetails();
                    break;
                }
                default:{
                    System.out.println("SOrry can't do any work....");
                }

            }
        }
    }}

    class Bank_Branch{

    private final static float Bank_Networth=50000;
        public  float main=0;
        private static float Networth = 50000;
        private static int no_of_accounts = 0;
        String CustomerName;
        private int CustomerNo;
        private float AccBalance =0;
        private float loansactioned= 0;
        private int no_of_installment;
        private float Rem_loan_amt;
        private float Total_loan_amt_sanc;
        private int Rem_no_of_installment;


        Bank_Branch(float AccBalance){


        }
        Bank_Branch(int CustomerNo , String CustomerName){
            this.CustomerNo = CustomerNo;
            this.CustomerName = CustomerName;
            Bank_Branch.no_of_accounts++;
            this.Total_loan_amt_sanc = 0;
            this.Rem_no_of_installment = 0;
            this.loansactioned = 0;
            this.Rem_loan_amt = 0;
        }
        public void credit(float creditamt){
            this.AccBalance=this.AccBalance+creditamt;
            Bank_Branch.Networth = Bank_Branch.Networth +creditamt;
        }
        public void loanRequest(float Amount){
            if(Amount>2*this.AccBalance && Amount>Bank_Branch.Networth)  {
                System.out.println("You cannot apply for loan\n");
            }
            else{
                Bank_Branch.Networth = Bank_Branch.Networth - Amount;
                System.out.println("Your Loan has been approved\n");
                System.out.println("Your Remaining Networth is : "+Bank_Branch.Networth);
                this.loansactioned = Amount;
                this.AccBalance =this.AccBalance+Amount;
                this.Rem_loan_amt = this.Rem_loan_amt+Amount;
                this.Total_loan_amt_sanc = this.Total_loan_amt_sanc + Amount;
            }

        }
        public void repayLoan(float amt){
            Bank_Branch.Networth = Bank_Branch.Networth + amt;
            this.no_of_installment++;
            if (Rem_loan_amt == 0){
                Bank_Branch.Networth = Bank_Branch.Networth + amt;
                this.AccBalance=this.AccBalance+amt;
                this.no_of_installment--;
            }
            else if (amt>this.Rem_loan_amt ) {
                this.AccBalance = this.AccBalance + (this.Rem_loan_amt - amt);
                this.Rem_loan_amt = 0;

            }
            else {
                this.Rem_loan_amt = this.Rem_loan_amt - amt;
                this.AccBalance =this.AccBalance - amt;
                if(this.Rem_loan_amt != 0) {
                    this.Rem_no_of_installment = 1;
                }
                else {
                    this.Rem_no_of_installment =0;
                }

            }
        }

        public void displayDetails() {
            System.out.println("THe Initial Bank Net worth is - "+Bank_Branch.Bank_Networth);
            System.out.println("Total No of Accounts in the  Bank - " + Bank_Branch.no_of_accounts);
            System.out.println("CUSTOMER DETAILS..");
            System.out.println("\n");
            System.out.println("Your Account Number is - " + this.CustomerNo);
            System.out.println("Customer Name is - " + this.CustomerName);
            System.out.println("THe amount credited to bank account:"+this.main);
            System.out.println("Your  Account Balance is - " + this.AccBalance);
            System.out.println("Now the bank's Networth  is - " + Bank_Branch.Networth);
            System.out.println("\n");
            System.out.println("LOAN DETAILS..");
            System.out.println("\n");
            System.out.println("Applied Loan Amount is - " + this.loansactioned);
            System.out.println("Remaining Loan Amount to be Paid  - " + this.Rem_loan_amt);
            System.out.println("Total loan Amount Sanctioned by Bank till date - " +this.Total_loan_amt_sanc);
            System.out.println("Total Installment till date - " +this.no_of_installment);
            System.out.println("Remaining Installment till date - " +this.Rem_no_of_installment);
        }

    }

