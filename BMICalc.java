import java.util.Scanner;
public class BMICalc{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double pounds, bmi, kg, m, height;
    int feet, inches;


    System.out.print("Your height in feet (next prompt inches): ");
    feet= keyboard.nextInt();
    System.out.print("your height with inches added: ");
    inches = keyboard.nextInt();
    height = (feet * 12) + inches;


    m = height * .0245;

    System.out.print("your weight in pounds: ");
    pounds = keyboard.nextDouble();
    kg = pounds * .45;


    bmi = kg / (m*m);
    System.out.println("Your BMI is " + bmi);

    //1. compeleted;
    //2.completed; 
  }
}
