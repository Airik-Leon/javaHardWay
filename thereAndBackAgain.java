public class thereAndBackAgain{
  public static void main(String[] args) {
    System.out.println("Here. ");
    erebor();
    System.out.println("Back first time.");
    erebor();
    System.out.println("Back second time.");
  }
  public static void erebor(){
    System.out.println("There.");
  }
}
// 1. Treats like an unrecoginized symbol
// 2. It simply doesn't print the second 'There' due to no function call
