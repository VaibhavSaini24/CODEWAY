import java.util.*;

public class Studentgrade {

    public static void main(String arg[]){
        Scanner sc  =  new Scanner(System.in);
        System.out.println("Enter the total Subject");
        int totalSubject = sc.nextInt();
       int Marks[] = new int[totalSubject];
       System.out.println("Enter the Marks of Subjects:");
       for(int i=0; i<totalSubject; i++){
        Marks[i] = sc.nextInt();
       }
       int Sum=0;
       for(int i=0; i<totalSubject; i++){
          Sum = Sum + Marks[i];
       }
    float averageMarks =  100*(Sum)/(totalSubject*100);

    System.out.println("The total Marks You Obtain in the exam would be " + Sum + "  out of "+totalSubject*100);

   System.out.println("The Average Percentage you get in Exam " +averageMarks + " %");

if(averageMarks >100){
System.out.println("Enter the wrong Marks please correct it");
}

   else{
  if(averageMarks >= 89  && averageMarks<=100)
System.out.println("You got GRADE A");
else if(averageMarks >70 && averageMarks<=90)
System.out.println(" You got GRADE B");

else if(averageMarks > 50 && averageMarks <=70)
System.out.println("You got GRADE C");
else if(averageMarks >= 33 && averageMarks <=50)
System.out.println("You got GRADE D");
else
System.out.println("You FAILED");

   }
   sc.close();
   
    }
}