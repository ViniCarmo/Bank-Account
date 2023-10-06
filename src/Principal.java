import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name: ");
        String name = scanner.next();

        System.out.println("Enter your account Number: ");
        int number = scanner.nextInt();

        Account account = new Account(name, number);

        System.out.println("Do you want to make an initial deposit? (y/n)");
        String deposit = scanner.next();

        if (deposit.equals("y")){
            System.out.println("what is the initial deposit amount?");
            double priceInitialDeposit = scanner.nextDouble();
            account.deposit(priceInitialDeposit);

            System.out.println(account);

        }else if (deposit.equals("n")){
            System.out.println(account);

        }else{
            System.out.println("coloque um valor valido");
        }

        System.out.println("Enter a Deposit Update: ");
        double depositUpdate = scanner.nextDouble();
        account.deposit(depositUpdate);

        System.out.println(account);


    }
}