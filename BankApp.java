// class employee{
//     int id;
//     double sal;
//     String name;




//      employee(int d , double sal, String n){

//         this.id=d;
//         this.name=n;
//         this.sal=sal;



//     }
//     void display(){
//         System.out.println("employee name is "+name);
//         System.out.println("ID of the employee is "+id);
//         System.out.println("we give salary to approx  "+sal);

//     }
// }
// public class Emploee {

//     public static void main(String[] args) {
//         employee newE = new employee(25, 250000, "ashutosh");

//         newE.display();

//     }
// }




class BankAccount {
    int accNumber;
    String accHolderName;
    double balance;

    // Constructor
    BankAccount(int a, String h, double b) {  
        accNumber = a;
        accHolderName = h;
        balance = b;
    }

    // Deposit Method
    void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("₹" + amt + " Deposited successfully to " + accHolderName);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Withdraw Method
    void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("₹" + amt + " withdrawn successfully!");
        } else {
            System.out.println("Insufficient balance or invalid amount!");
        }
    }

    // Check Balance Method
    void checkBalance() {
        System.out.println("Your current balance is ₹" + balance);
    }

    // Change Account Holder Name Method
    void changeAccountHolder(String newName) {
        accHolderName = newName;
        System.out.println("Changed name of account holder to: " + accHolderName);
    }

    // **New Method: Transfer Money**
    void transferMoney(BankAccount receiver, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;  // Sender's balance deduct
            receiver.balance += amount;  // Receiver's balance add
            System.out.println("₹" + amount + " transferred successfully from " + this.accHolderName + " to " + receiver.accHolderName);
        } else {
            System.out.println("Transfer failed! Insufficient balance or invalid amount.");
        }
    }

    void  getInfo(String accHolderName,int accNumber){
        System.out.println("Account holder name is "+accHolderName);
        System.out.println("And bank acc number is "+ accNumber);

    }

    // Display Method
    void display() {
        System.out.println("\nAccount Number: " + accNumber);
        System.out.println("Account Holder: " + accHolderName);
        System.out.println("Current Balance: ₹" + balance);
    } 
}

// Main Class
public class BankApp {
    public static void main(String[] args) {
        // Creating Two Bank Accounts
        BankAccount acc1 = new BankAccount(12345, "Ashutosh", 5000.0);
        BankAccount acc2 = new BankAccount(67890, "Rahul", 3000.0);

        // Display Initial Balances
        acc1.display();
        acc2.display();

        // Transferring Money from Ashutosh to Rahul
        acc1.transferMoney(acc2, 2000);

        // Display Updated Balances
        acc1.display();
        acc2.display();

        // Trying to transfer more than available balance
        acc1.transferMoney(acc2, 4000);

        acc1.getInfo("Ashutosh", 022331133);
    }
}
