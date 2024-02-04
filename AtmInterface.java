import java.util.*;

public class AtmInterface {


public static void displayOptions() {
    System.out.println("Welcome to your ATM");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Check A/c Balance");
    System.out.println("0. EXIT");
}
public static int  WithdrawAmount(int amount,int Bal){

if(amount<=Bal){
    Bal-=amount;
    System.out.println("Withdraw Succesfull");
    System.out.println("Plz Collect your money");
    System.out.println("Remainig Amount =  $" +Bal);
}
else{
    System.out.println("Insuffcient Amount");
}
return 0;
}
public void  deposit(int  amount, int deposite){ 

    amount+=deposite;
    System.out.println("Money Deposite Succesfull +$ :  ");
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // BankAccount userAccount = new BankAccount(1000);
        // AtmInterface mybank = new AtmInterface();
        int  Balance = 1000;
        
        int choice;


 do{
        System.out.println("Choise the option which opertaion you want to perform");
               displayOptions();
    System.out.println("Enter Your Choice: ");
          choice = sc.nextInt();
   
     switch(choice){
    case 1:  {
        System.out.println("ENter amount to Withdraw : -$ ");
         int  amountWithdraw = sc.nextInt();
             WithdrawAmount(amountWithdraw, Balance);
         break;
    }
    case 2:{
        System.out.println("Enter amount you want to deposite:  +$");
        int depositAmount = sc.nextInt();
        Balance+=depositAmount;
        break;
    }
    case 3:{
      System.out.println("The Balance in your bank =   $" +Balance);
      break;

    }
    case 0:{
        System.out.println("Exiting ATM, Thank you!");
        break;
    }
    default:{
        System.out.println("Invalid Choice");
    }
     }
    }while(choice!=0);
    sc.close();
    }

}
