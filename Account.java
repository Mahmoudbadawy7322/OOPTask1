public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(String accountNumber,String accountHolderName,double balance ){
        this.accountNumber=accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance=balance;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber=accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountHolderName(String accountHolderName){
        this.accountHolderName=accountHolderName;
    }
    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public  void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance=amount;
        }
    }
    public void withdraw(double amount){
        if((amount>0) && (amount <= this.balance)){
            this.balance -= amount;
            System.out.println("The operation Done successfully and the new balance is "+this.balance);
        }
        else {
            System.out.println("The operation failed");
        }
    }
}
