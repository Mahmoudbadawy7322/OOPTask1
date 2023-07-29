import java.util.Scanner;

public class Bank {
    private Account[] existAccounts;
    Scanner scanner;
    private int currentAccountsCount;
    public Bank(){
        this.existAccounts = new Account[100];
        this.currentAccountsCount=0;
        scanner= new Scanner(System.in);
    }


    public void createAccount(){
        System.out.println("Creating new account\n------------------------------");
        System.out.print("Enter Your name : ");

        String name = scanner.nextLine();
        String creatingAccountNumber = (currentAccountsCount+1)+"";
        existAccounts[currentAccountsCount]=new Account(creatingAccountNumber,name,0.0);
        System.out.println("Account created successfully.\nYour account number is "+creatingAccountNumber);
        currentAccountsCount += 1;

    }

    public int getCurrentAccountIndex(String accountNumber){
        int foundIndex = -1;
        for (int i=0;i<currentAccountsCount;i++){
            if(existAccounts[i].getAccountNumber().equals(accountNumber)){
                foundIndex=i;
                return foundIndex;
            }
        }
        return foundIndex;
    }

    public void depositToAccount(String accountNumber,double amount){
        int currentAccountIndex = getCurrentAccountIndex(accountNumber);
        if(currentAccountIndex != -1){
            existAccounts[currentAccountIndex].deposit(amount);
            double currentBalance = existAccounts[currentAccountIndex].getBalance();
            System.out.println("The operation Done successfully and the new balance is "+currentBalance);
        }
        else
            System.out.println("Account number not registered so please enter the correct one");
    }

    public void withdrawFromAccount(String accountNumber,double amount){
        int currentAccountIndex = getCurrentAccountIndex(accountNumber);
        if(currentAccountIndex != -1){
            existAccounts[currentAccountIndex].withdraw(amount);
        }
        else
            System.out.println("Account number not registered so please enter the correct one");
    }

    public void showBalance(String accountNumber){
        int currentAccountIndex = getCurrentAccountIndex(accountNumber);
        if(currentAccountIndex != -1){
            double currentBalance = existAccounts[currentAccountIndex].getBalance();
            System.out.println("Your balance is "+currentBalance);
        }
        else
                System.out.println("Account number not registered so please enter the correct one");
    }

}
