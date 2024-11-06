import java.util.Scanner;
                                
public class Bank {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BankAccount[] newaAccounts = new BankAccount[3];
    System.out.println("Enter account no(0-2): ");
    int accountNo = sc.nextInt();
    System.out.println("deposit or withdraw (select 1 or 2)");
    int option = sc.nextInt();
    if(option = 1){             
        if(accountNo>=0&&accountNo<=2){
            BankAccount[accountNo].deposit();
        }
        else{
            System.out.println("account no invalid");
        }  
    }
    else{
        if(accountNo>=0&&accountNo<=2){
            BankAccount[accountNo].deposit();
        }
        else{
            System.out.println("account no invalid");
        }   
    }
}
    
}

class BankAccount{
    int accountNo;
    float balance;
    String accountHolderName;

    BankAccount(){
        this.accountNo = accountNo;
        this.balance=0.0;
        this.accountHolderName=accountHolderName;
    }

    public void deposit(){
        if(amount>0){
        balance+=amount;
        System.out.println(balance);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    public void withdraw(){
        if(amount>0||amount<balance){
        balance-=amount;
        System.out.println(balance);
        }
        else{
            System.out.println("Invalid amount or not sufficiant balance");
        }
    }
} 

