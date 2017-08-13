import java.util.Scanner;

public class thirtydays{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int month, days;
    String monthName;

    System.out.print("Which month? (1-12) ");
    month = keyboard.nextInt();

    switch(month){
      case 1: monthName = "January";
      System.out.println(monthName);
      case 2: monthName = "February";
      System.out.println(monthName);
      case 3: monthName = "March";
      System.out.println(monthName);
      case 4: monthName = "April";
      break;
      case 5: monthName = "May";
      break;
      case 6: monthName = "June";
      break;
      case 7: monthName = "July";
      break;
      case 8: monthName = "August";
      break;
      case 9: monthName = "September";
      break;
      case 10: monthName= "October";
      break;
      case 11: monthName = "November";
      break;
      case 12: monthName = "December";
      break;
      default : monthName = "error";
    }
    /*Thirty days hath september, april, june, November
    all others are 31 exclude feb(2nd) */

    switch(month){
      case 9:
      case 4:
      case 6:
      case 11: days = 30;
      break;
      case 2: days = 28;
      break;
      default: days = 31;
    }
    System.out.println(days + " days hath " + monthName);
  }
}

//1. completed by removing breaks to ensure variable assignment/ reassignment
