interface Car {
  void changeRpm(int newValue);
  void changeGear(int newValue);
  void speedUp(int increment);
  void hitTheBrakes(int decrement);
}

class Toyota implements Car {
  int speed = 0;
  int gear = 1;
  int rpm = 0;
  static int numWheels = 4;

  public void changeRpm(int newValue) {
    rpm = newValue;
  }

  public void changeGear(int newValue) {
    gear = newValue;
  }

  public void speedUp(int increment) {
    speed = speed + increment;
  }

  public void hitTheBrakes(int decrement) {
    speed = speed - decrement;
  }
}

class Rav extends Toyota {
  int speed = 0;
  int gear = 1;
  int rpm = 0;
  int driveWheels = 2;

  void kickInFourWheel(int wheels) {
    driveWheels = wheels;
  }
}
