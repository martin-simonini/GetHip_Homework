import java.util.Scanner;

public class Bank
{

   public static void main(String[] args)
   {

   //---------Variable Declaration------------
  int pin = 1998;
  boolean correctPin = false;
 double balance = 0.0; //the balance of the user
   boolean exit = false;

   Scanner sc = new Scanner(System.in);
  
   while(correctPin == false)
   {

      System.out.print("Please enter your four digit pin: ");
            int PinInput = sc.nextInt();
      if(PinInput == 1998)
      {
       correctPin = true;
      }
      else
     {
      System.out.println("Incorrect Pin");
     }
 }

 while(exit != true)
 {

 System.out.println("What would you like to do today?");
 System.out.println("1. View balance");
 System.out.println("2. Deposit money");
 System.out.println("3. Withdrawal money");
 System.out.println("4. Exit");
 
 int  choice = sc.nextInt();

 if(choice ==1)
 {
   System.out.println("$"+balance);
 }
 else if(choice == 2) //deposit
 {
    System.out.print("How much would you like to deposit?");
    int depo = sc.nextInt();
    balance += depo;
 }
 else if(choice == 3) //withdrawal
 {
   System.out.print("How much would you like to withdraw?");
   int with = sc.nextInt();
   if(balance - with < 0)
   {
    System.out.println("You do not have the sufficent funds.");
    continue;
   }
 
 }
 else //exit
    exit = true;
   }


  }

}
