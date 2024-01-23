import java.util.Random;
import java.util.Scanner;

public class NumberGame {

public static void main(String args[]){
    //START
    Random r = new Random();
    Scanner s = new Scanner(System.in);
    // Create to object one is using Random  and Scanner //

    System.out.println("Let's Play a Number Game in which You guess Number btw 1 to 100");
    System.out.println("IF ARE YOU READY PRESS 'Y' FOR START");

    // take a char for loop 
   char chance = s.next().charAt(0);

   // using do while loop for preforming again chance 
    do{
    // take input to set number of times you play 
System.out.println("Enter the number of time you Play");
    int n = s.nextInt(); 
    // take to integer varible to detect the  total round and correct guess
    int correctGuess =0;
    int round =0;

    // Again use the do while loop for guessing the number
 do{ 
       // number variable generate the random number using random object
        int number = r.nextInt(101);
        // input user Guess Number
     System.out.println("Enter your Guess what the number could be generated (0-100)");
     int guess = s.nextInt();
     round++;
     n--;

     // Check the condition of number to guess number  is it correct / not.
    if (guess== number){
        System.out.println("You Rock!, you guess correctly");
        // increse correctGuess to one on satisfying condition..
        correctGuess++;
    }
    else if(guess< number)
    {
        System.out.println("You guess the too Low number");
    }
    else 
    {
        System.out.println("You guess the too HIGH number");
      }
      // outpu the remaning chance and Generated number
   System.out.println("Generated NUmber = " +number );
   System.out.println("Remaining Life = " + n);
} while(n!=0);

// Condition to check the Correct Guess 
if(correctGuess!=0){
    System.out.println("Total Score  = " +correctGuess);
}
else{
    System.out.println("You Score is 0 (you can't guess Correct)");
}
// output total times you play the game
System.out.println("The total times you play = " +round );

// Condition to check user want to play again or not
System.out.println("If You Want to play again press Y for yes and N for No");
chance = s.next().charAt(0);
s.close();
// END OF Loop
} while(chance =='Y');
// END 
}
}
