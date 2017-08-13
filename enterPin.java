import java.util.Scanner;

public class enterPin{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String entryPass;
    String password = "Love";

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA");
    System.out.println("ENTER YOUR PASSWORD");
    entryPass = keyboard.nextLine();
    while(! entryPass.equals(password)){
      System.out.println("\nINCORRECT PASSWORD.TRY AGAIN.");
      System.out.println("Enter your password: ");
      entryPass = keyboard.nextLine(); 
    }
    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while(entry != pin){
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED.YOUR ACCOUNT BALANCE IS $425.17");
  }
}
