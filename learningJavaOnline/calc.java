import java.util.Scanner;
public class Math {
  public int add(int num1, int num2) {
    return num1 + num2;
  }
  public int sub(int num1, int num2) {
    return num1 - num2;
  }
  public int mul(int num1, int num2) {
    return num1 * num2;
  }
  public int div(int num1, int num2) {
    return num1 / num2;
  }
}

public class calc {
  public static void main(String[] args) {
    Math math = new Math();
    Scanner userinput = new Scanner(System.in);
    System.out.println("Calc");
    System.out.println("=====");
    System.out.println("First num:");
    int num1 = userinput.nextInt();
    System.out.println("Second num: ");
    int num2 = userinput.nextInt();
    System.out.println("Enter operation to perform");
    String operation = userinput.next();

    if(operation.equals("+"))
      System.out.println(math.add(num1, num2));
    else if(operation.equals("-"))
      System.out.println(math.sub(num1, num2));
    else if(operation.equals("x"))
      System.out.println(math.mul(num1, num2));
    else if(operation.equals("/"))
      System.out.println(math.div(num1, num2));
    else
      System.out.println("Invalid entry");
  }
}
