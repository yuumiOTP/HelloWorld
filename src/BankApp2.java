import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp2 {
    public static void main(String[] args) {
        System.out.println("Velkommen til BankApp2");
        //lokale variabler
         Account a1;
         a1=new Account("Joe Pass", 1.5);
         Account a2=new Account("Brian May", 1.5);
        a1.deposit(50);
        a2.deposit(100);
        a1.withdraw(50);
        a2.withdraw(0);
        a1.annualInterest();
        a2.annualInterest();

        a1.printTransactions();
        a2.printTransactions();


    } // main
}
// instans variabler
class Account {
    private int accountNo;
    private String owner;
    private double balance;
    private double interestRate; //rente i %
    static private int noOfAccounts=0;
    private ArrayList<Transaction> transactions=new ArrayList<>();

    public Account(String ow, double ir) {
        noOfAccounts++;
        accountNo = noOfAccounts;
        owner = ow;
        balance = 0;
        interestRate = ir;
    }

    public static int getNoOfAccounts() {
        return noOfAccounts;
    }

    public static void setNoOfAccounts(int noOfAccounts) {
        Account.noOfAccounts = noOfAccounts;
    }

    public void deposit(double amount) {
     balance=balance+amount;
     Transaction t = new Transaction("Indsat", amount, balance);
     transactions.add(t);
    }

    public void withdraw(double amount) {
        balance=balance-amount;
        transactions.add(new Transaction("Hævet", amount, balance));

    }

    public void annualInterest() {

        double interest =(balance*interestRate)/100;
        balance=balance+interest;
        transactions.add(new Transaction("Renter", interest, balance));
    }

    public void printTransactions(){
        System.out.println(toString());
        System.out.println("Tekst\tDato\t\tBeløb\tSaldo");
        for (Transaction t : transactions){
            System.out.println(t);
        }
        System.out.println();
    }

    public String toString(){

    return "Konto: "+accountNo+"\t"+owner+"\t"+balance;


     }
} // class Account


class Transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    Transaction(String text, double amount, double newBalance) {
        this.text = text;
        date = LocalDate.now();
        this.amount = amount;
        this.newBalance = newBalance;
    }
    public String toString(){
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }

    }
