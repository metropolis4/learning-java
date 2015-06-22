class Person {
    static int ageYears = 34;
    static int ageDays;
    static long ageMinutes, ageSeconds, ageMilliseconds;
    static void calcAges() {
      ageDays = ageYears * 365;
      ageSeconds = ageDays * 24 * 60 * 60;
      ageMinutes = ageSeconds / 60;
      ageMilliseconds = ageSeconds * 1000;
    }
    static void displayAges() {
      System.out.println("You are " + ageYears + " years old");
      System.out.println("You are " + ageDays + " days old");
      System.out.println("You are " + ageMinutes + " minutes old");
      System.out.println("You are " + ageSeconds + " seconds old");
      System.out.println("You are " + ageMilliseconds + " milliseconds old");
    }
  public static void main(String[] args) {
    calcAges();
    displayAges();
  }

}
