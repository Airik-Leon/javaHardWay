public  class CreatingVariables{
  public static void main(String[] args) {
    int x, y, age, a;
    double seconds, e, checking, b;
    String firstName, lastName, title, married, sport;
    a = 3;
    b = .25;
    married = "is not married";
    sport = "hockey";

    x = 10;
    y = 400;
    age = 39;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr. ";

    System.out.println(" The variable x contains " + x);
    System.out.println(" The value " + y + " is stored in the variable y. ");
    System.out.println(" The experiment took " + seconds + " seconds. ");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hoepfully you have more than $" + checking + "!");
    System.out.println("My name's"+ title + " " + firstName + lastName);

    System.out.println("Your favorite number is " + a + "\n"
                       + "What is one quarter " + b + "\n"
                       + "Allen is " + married + "\n"
                       + "Allen's favorite sport is " +  sport);
  }
}
