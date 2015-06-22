public class TempConversion {
    static double temp = 81.5;
    static void calcTemp() {
      temp = (temp - 32) * 5 / 9;
      System.out.println(temp);
    }
  public static void main(String[] args) {
    calcTemp();
  }
}
