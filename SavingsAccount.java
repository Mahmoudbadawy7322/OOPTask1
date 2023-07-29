public class SavingsAccount extends Account{
    private double interestRate;
    public SavingsAccount(String accountNumber,String accountHolderName,double balance,double interestRate){
        super(accountNumber,accountHolderName,balance);
        this.interestRate=interestRate;
    }

    public void setInterestRate(double interestRate){
        this.interestRate=interestRate;
    }
    public double getInterestRate(){
        return this.interestRate;
    }

    public double calculateInterestForAccount(){
        return ( getBalance() * this.interestRate );
    }
}
