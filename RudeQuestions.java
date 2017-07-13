import java.util.Scanner;
public class RudeQuestions{
  public static void main(String[] args) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner (System.in);
    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hello" + name + "! How old are you?");
    age = keyboard.nextInt();

    System.out.print("So you're " + age + " , eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ". ");

    int dogCount;
    System.out.println("How many dogs do you own? " + name);
    dogCount = keyboard.nextInt();
    System.out.println("You may need more than " + dogCount + "dogs");

    //1. no, doubles are larger than ints and are upgraded to doubles
    //2. No because input is always a string and then converted.
    //3. Couldn't blow up first question due to all inputs being accepted
    // BUt other inputs can be blown up through incorrect mismatch 
    //4. completed above
  }
}
