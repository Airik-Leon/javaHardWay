public class clubbouncer{
  public static void main(String[] args) {
    int age = 22;
    boolean onGuestList = false;
    double allure = 7.5;
    String gender = "F";

    if(onGuestList || age > 21 || (gender.equals("F") && allure >= 8)){
      System.out.println("You are allowed to enter the club.");
    }
  //  System.out.println("Love down below");
    else{
      System.out.println("You are not allowed to enter the club");
    }
  }
}
// Code doesn't excute because the else does not follow an if statement
