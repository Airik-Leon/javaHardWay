import java.util.Scanner;

public class dictionaryOrder{
  public static void main(String[] args) {
    Scanner keyboard =  new Scanner(System.in);
    String name;
    String cpp = "C++".toLowerCase();
    String go = "Go".toLowerCase();
    String java = "java".toLowerCase();
    String lisp = "Lisp".toLowerCase();
    String python = "Python".toLowerCase();
    String ruby = "Ruby".toLowerCase();
    String VB = "Visual Basic".toLowerCase();



    System.out.print("make up the name of a programming language! ");
    name = keyboard.nextLine();
    name = name.toLowerCase();


    if(name.compareTo(cpp)< 0)
      System.out.println(name + "comes BEFORE " + cpp);
    if(name.compareTo(cpp) == 0)
      System.out.println(cpp + " isn't a made-up language!");
    if(name.compareTo(cpp) > 0)
      System.out.println(name + "comes after " + cpp);

    if(name.compareTo(go) < 0)
      System.out.println(name + "comes BEFORE " + go );
    if(name.compareTo(go) == 0)
      System.out.println(go + " isn't a made-up language!");
    if(name.compareTo(go) > 0)
    System.out.println(name + " comes AFTER " + go );

    if(name.compareTo(java)< 0)
      System.out.println(name + "comes BEFORE  " + java);
    if(name.compareTo(java) == 0)
      System.out.println(java + " isn't a made-up language!");
    if(name.compareTo(java)> 0 )
      System.out.println(name + "comes AFTER " + java);

      if(name.compareTo(lisp)< 0)
        System.out.println(name + "comes BEFORE " + lisp);
      if(name.compareTo(lisp) == 0)
        System.out.println(lisp + " isn't a made-up language!");
      if(name.compareTo(lisp)> 0 )
        System.out.println(name + "comes AFTER " + lisp);

        if(name.compareTo(python)< 0)
          System.out.println(name + "comes BEFORE  " + python);
        if(name.compareTo(python) == 0)
          System.out.println(python + " isn't a made-up language!");
        if(name.compareTo(python)> 0 )
          System.out.println(name + "comes AFTER " + python);

          if(name.compareTo(ruby)< 0)
            System.out.println(name + "comes BEFORE  " + ruby);
          if(name.compareTo(ruby) == 0)
            System.out.println(ruby + " isn't a made-up language!");
          if(name.compareTo(ruby)> 0 )
            System.out.println(name + "comes AFTER "+ ruby);

            if(name.compareTo(VB)< 0)
              System.out.println(name + "comes BEFORE "+ VB);
            if(name.compareTo(VB) == 0)
              System.out.println(VB + " isn't a made-up language!");
            if(name.compareTo(VB)> 0 )
              System.out.println(name + "comes AFTER " + VB);
  }
}
//1. COMPLETED BY USING toLowerCase() method 
