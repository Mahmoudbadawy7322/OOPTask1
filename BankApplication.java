import java.util.Scanner;

public class BankApplication {

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        Bank bank = new Bank();
        do {
            System.out.println("Welcome to the bank application\n-----------------------------------\n" +
                    "Kindly select one from the below options");
            System.out.println("1- New account\n2- Exist account");
            int selectedOption = scanner.nextInt();
            if(selectedOption == 1)
                bank.createAccount();
            else if (selectedOption == 2){
                scanner= new Scanner(System.in);
                System.out.println("Enter your account number : ");
                String accountNumber = scanner.nextLine();
                System.out.println("1- Deposit\n2- Withdraw\n3- Show balance");
                selectedOption = scanner.nextInt();
                if( selectedOption == 1 || selectedOption == 2 ){
                    System.out.print("Enter the amount : ");
                    double amount = scanner.nextDouble();
                    if(selectedOption == 1 )
                        bank.depositToAccount(accountNumber,amount);
                    else
                        bank.withdrawFromAccount(accountNumber,amount);
                }else if( selectedOption == 3)
                    bank.showBalance(accountNumber);
                else {
                    System.out.println("You entered wrong number");
                }
            }else {
                System.out.println("You entered wrong number");
            }
            scanner= new Scanner(System.in);
            System.out.println("Do you want to do another operation for yes please enter (Y,y) for no press any another key");
            char continueInput = scanner.nextLine().charAt(0);
            if(continueInput != 'y' && continueInput != 'Y')
                break;
        }while (true);
    }
}
