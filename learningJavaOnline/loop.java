public class loop {
  public static void main(String[] args) {
    // for loop
    String[] myGuitars = {
      "Strat", "Les Paul", "Acoustic"
    };
    for(int i = 0; i < myGuitars.length; i++) {
      System.out.println("I have a " + myGuitars[i]);
    }
    // forEach loop
    int[] myNums= {1,2,3,4,5,6,7,8,9,10};
    for(int el : myNums) {
      System.out.println("The number " + el + ",");
    }
    // while loop
    int a = 0;
    while(a <= 10) {
      System.out.println("a = " + a);
      a++;
    }
    // do/while loop
    int b = 0;
    do {
      System.out.println("I'm looping...");
      b++;
    } while(b < 10);
  }
}
