import java.util.*;
//package import
public class AtmInterface {
    //class declare...
//START
// display the option of the atm interface..
public static void displayOptions() {
    System.out.println("Welcome to your ATM");
    System.out.println("1. Withdraw");
    System.out.println("2. Deposit");
    System.out.println("3. Check A/c Balance");
    System.out.println("0. EXIT");
}
public static int  WithdrawAmount(int amount,int Bal){
// fun for withdrawing amount
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
// For depsoite the money in the bank this function is called
    amount+=deposite;
    System.out.println("Money Deposite Succesfull +$  ");
}

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // intialise the bank account with the 1000 $....
        int  Balance = 1000;
        
        int choice;
// choice for the selction the operation which you want to perform .....

 do{
        System.out.println("Choise the option which opertaion you want to perform");
               displayOptions();
    System.out.println("Enter Your Choice: ");
          choice = sc.nextInt();
          // This show the option which are perform on atm and take input for choice...
   
     switch(choice){
        // switch statement to perform opertions ...
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
    // do - while loop for performing the opertaion repetatively on atm interface ......
    sc.close();
    // END 
    }

}
