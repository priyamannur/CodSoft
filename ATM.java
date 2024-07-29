import java.util.*;
class UserBank{
    String userName;
    double balance;

    public UserBank(String name, double balance){
        this.userName = name;
        this.balance = balance;
    }

    double checkBalance(){
        return balance;
    }

    boolean withdraw(double amt){
        if(amt>balance)
            return false;
        balance-=amt;
        return true;
    }

    boolean deposit(double amt){
        if(amt<0)
            return false;
        balance+=amt;
        return true;
    }
}

class ATM{
    UserBank userBank;

    public ATM(UserBank userBank){
        this.userBank = userBank;
    }

    void checkBalance(){
        System.out.println();
        System.out.println("Your current Balance is : "+userBank.checkBalance());
    }

    void withdraw(double amt){
        System.out.println();
        if(userBank.withdraw(amt)){
            System.out.println("Withdraw of amount "+amt+" successful! Remaining: "+userBank.checkBalance());
        }
        else   
            System.out.println("Withdraw failed due to insufficient balance");
    }

    void deposit(double amt){
        System.out.println();
        if(userBank.deposit(amt))
            System.out.println("Deposit was successful!!");
        else{
            System.out.println("Deposit failed! Make sure you enter right amount");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("To get started, please enter your name");
        String name = sc.nextLine();
        System.out.println("Please enter your balance");
        double balance = sc.nextDouble();

        UserBank userBank = new UserBank(name,balance);

        ATM atm = new ATM(userBank);

        while(true){
        System.out.println("*************************************************************************************");
        System.out.println();
        System.out.println("Please enter 1 for Cheking Balance");
        System.out.println("Please enter 2 for Withdrawal");
        System.out.println("Please enter 3 for Deposit");
        System.out.println("Please enter any other key to Exit");

        int choice  = sc.nextInt();

        if(choice==1){
            atm.checkBalance();
        }
        else if(choice == 2){
            double amt;
            System.out.println("Please Enter amount to be withdrawn");
            amt = sc.nextDouble();

            atm.withdraw(amt);
        }
        else if(choice == 3){
            System.out.println("Please Enter amount to deposit");
            double amt = sc.nextDouble();

            atm.deposit(amt);
        }
        else{
            System.exit(0);
        }
        System.out.println("*************************************************************************************");
        }
    }

}

