class Variables {
  int myNumber = 100;
  short smallNumber = 5;
  byte bitNumber = 1;
  float floater = 1.45f;
  double anotherFloat = 9.342;
  boolean correct = true;
  boolean incorrect = false;
  char letter = 'a';
  final static String MY_NAME = "Matt";

  public static void main(String[] args) {
    String[][] names = {
      {"Matt", "Max", "Buddy"},
      {"Rich", "Roach"}
    };

    System.out.println(names[0][0] + " " + names[1][0]);
    System.out.println(MY_NAME);
  }
}
