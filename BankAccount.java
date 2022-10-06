class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static int totalStoredInAccounts = 0;
    
    //constructor 
    public BankAccount() {
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        BankAccount.numberOfAccounts++;
    }

     //checking getter
    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    //savings getter
    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void deposit(double total, String account) {
        if(account == "checking") {
            this.checkingBalance += total;
        }
        else {
            this.savingsBalance += total;
        }

        this.totalStoredInAccounts += total;
    }

    public void withdraw(double total, String account) {
        if(account == "checking") {
            if(total > this.checkingBalance){
                System.out.println("Insufficient funds");
                return;
            }
            this.checkingBalance -= total;
        }
        else {
            if(total > this.savingsBalance){
                System.out.println("Insufficient funds");
                return;
            }
            this.savingsBalance -= total;
        }
        
        this.totalStoredInAccounts -= total;
    }
}