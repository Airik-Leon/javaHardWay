public class randomNumbers{
  public static void main(String[] args) {
    int a, b,c,d;
    double r, rps;

    rps = Math.random();
    if(rps < 0.3333333){//will true 1/3 of time
      System.out.println("ROCK");
    }
    else if(rps < 0.6666667){
      System.out.println("PAPER");
    }
    else{
      System.out.println("SCISSORS");
    }

    //pick four random integers, each 1-10
    a = 1 + (int)(10 * Math.random());
    b = 1 + (int)(10 * Math.random());
    c = 1 + (int)(10 * Math.random());
    d = 1 + (int)(10 * Math.random());
    System.out.println("1 - 10: "+ a + "\t" + b + "\t" + c + "\t" + d);

    //pick four random integers, each 1-6
    a = 1 + (int)(6 * Math.random());
    b = 1 + (int)(6 * Math.random());
    c = 1 + (int)(6 * Math.random());
    d = 1 + (int)(6 * Math.random());
    System.out.println( "1-6:\t" + a + "\t" + b + "\t" + c + "\t" + d );
    //pick four random numbers, each 1-100
    a = 1 +(int) (100 * Math.random());
    b = 1 +(int) (100 * Math.random());
    c = 1 +(int) (100 * Math.random());
    d = 1 +(int) (100 * Math.random());
    System.out.println( "1-100:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    //pick four random numbers, each 0-99

    a = 0 + (int)( 100*Math.random() );
    b = 0 + (int)( 100*Math.random() );
    c = (int)( 100*Math.random() );
    d = (int)( 100*Math.random() );
    System.out.println( "0-99:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // pick four random integers, each 10-20
    a = 10 + (int)( 11*Math.random() );
    b = 10 + (int)( 11*Math.random() );
    c = 10 + (int)( 11*Math.random() );
    d = 10 + (int)( 11*Math.random() );
    System.out.println( "10-20:\t" + a + "\t" + b + "\t" + c + "\t" + d );

    // display four random doubles, each [0-1)
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );
    System.out.println( "0-1:\t" + Math.random() + "\t" + Math.random() );

    r = 10 * Math.random();
    System.out.println( "0-9.99:\t" + r );
    System.out.println( "0-9:\t" + (int)r );
    System.out.println( "1-10:\t" + (1 + (int)r) );
    //display 3 random integers from 1-3
    //1.
    a = 1 + (int) (3*Math.random());
    b = 1 + (int) (3*Math.random());
    c = 1 + (int) (3*Math.random());
    System.out.println("1-3: \t" + a +" \t" +  b + "\t " + c);
    //display 3 random integers from 5-10
    //2.
    a =  (int)(6*Math.random()) + 5;
    b = (int)(6*Math.random()) + 5;
    c = (int)(6*Math.random()) + 5;
    System.out.println("5-10: \t" + a + "\t" + b + "\t" + c);
   }
}
