public class conditionals {
  public static void main(String[] args) {
    int a = 4;
    int c = 5;
    boolean b = a == 4;

    if (b) {
      System.out.println(a == 4);
      boolean result;
      result = a < c;
      System.out.println(result);
      if (a > c)
        System.out.println("It didn't work :(");
      else
        System.out.println("It worked! :)");
      String answer = a < c ? "That's right" : "Nope";
      System.out.println("The result is: " + answer);
    }
  }
}
