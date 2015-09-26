import java.util.Scanner;

public class Bank
{
 int pin = 1998;
 boolean correctPin = false;
 
 Scanner sc = new Scanner(System.in);
 
 while(correctPin != true)
 {
  System.out.print("Please enter your four digit pin: ");
  int input = sc.nextInt();
  if(input == 1998)
  {
   correctPin = true;
  }
 }

}
