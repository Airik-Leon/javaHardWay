import java.util.Scanner;

public class bmicategories{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi;

    System.out.print("Enter your height in inches: ");
    double height = keyboard.nextDouble();
    height = height / 12;

    System.out.print("Enter your weight lbs");
    double weight = keyboard.nextDouble();

     bmi = weight / height;



    System.out.print("Your BMI number is: "+ bmi + "and BMI category:  ");
    if( bmi < 15.0 ){
      System.out.println("very severely underweight");
    }
    else if(bmi <= 16.0){
      System.out.println("severely underweight");
    }
      else if(bmi< 18.5){
        System.out.println("underweight");
      }
   if (bmi < 25.0){
        System.out.println("normal weight");
      }
      else if(bmi < 30.0){
        System.out.println("overweight");
      }
      else if(bmi < 35.0){
        System.out.println("moderately obese");
      }
      else if(bmi < 40.0){
        System.out.println("severely obese");
      }
      else {
        System.out.println("very severely/\"morbidly\"obese");
      }
    }
  }

  // 1. completed yes
  // 2. completed
