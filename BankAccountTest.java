class BankAccountTest {
    public static void main(String[] args) {
        
        BankAccount jasminesBankAccount = new BankAccount();
        jasminesBankAccount.deposit(20, "checking");
        System.out.println("Deposited:$" + jasminesBankAccount.getCheckingBalance());
        jasminesBankAccount.withdraw(5, "checking");
        System.out.println("Account Balance:$" + jasminesBankAccount.getCheckingBalance());
        jasminesBankAccount.withdraw(300, "checking");
        System.out.println("Checking Balance:$" + jasminesBankAccount.getCheckingBalance());
        System.out.println("Total in accounts:$" + BankAccount.totalStoredInAccounts);
        System.out.println("Number of Accounts:" + BankAccount.numberOfAccounts);
        jasminesBankAccount.deposit(20, "savings");
        System.out.println("Savings Balance:$" + jasminesBankAccount.getSavingsBalance());
    }
}