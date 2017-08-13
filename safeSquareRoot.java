import java.util.Scanner;

public class safeSquareRoot{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double x, y;
    String ready;

    System.out.println("Are you ready? Enter y to start");
    ready = keyboard.next().toLowerCase();
    while(!ready.equals("y")){
      System.out.println("Not ready, okay. Enter 'y' when you are. ");
      System.out.println(ready);
      ready = keyboard.next().toLowerCase();
    }
    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negatives, please.) ");
    x  = keyboard.nextDouble();

    while( x < 0){
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNeew number: ");
      x = keyboard.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + "is " + y);
  }
}
