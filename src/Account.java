public class Account {
    private String name;
    private int numAccount;
    private double balance;
    private double tax = 5;

    @Override
    public String toString() {
        return "Account data: account: " + numAccount + ", Holder: " + name + ", Balance: " + balance;
    }

    public Account(String name, int numAccount) {
        this.name = name;
        this.numAccount = numAccount;
        toString();
    }

    public Account(String name, int numAccount, double initialDeposit) {
        this.name = name;
        this.numAccount = numAccount;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumAccount() {
        return numAccount;
    }

    public double getBalance() {
        return balance;
    }



    public double OpenAccount(double initialDeposit){
        return balance + initialDeposit;
    }

    public void saque(double valor){
         balance -= valor + tax;
    }

    public void deposit(double valor){
         balance += valor;
    }

}
