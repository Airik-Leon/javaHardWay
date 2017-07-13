import java.util.Scanner;
public class ForgetFulMachine{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("What city is the capital of France?");
    keyboard.next();
    System.out.println("What is 6 multiplied by 7?");
    keyboard.nextInt();
    System.out.println("Enter a number between 0.0 and 1.0");
    keyboard.nextDouble();
    System.out.println("Is there anything else you would like to say?");
    keyboard.next();

    //On second question 9.9 results in Input Mismatch Exception
    // ON third question entering "char" results in input Mismatch Exception 
  }
}
