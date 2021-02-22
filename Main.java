import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome! What is your current speed?");
    int speed = scan.nextInt();
    speedometer(speed);

  }

  public static boolean speedometer(int speed) {
    if (speed < 50) {
      System.out.println("Keep up your going too slow!");
      return false;
    } else {
      Scanner scan = new Scanner(System.in);

      System.out.println("What is your current speed?");
      int currentSpeed = scan.nextInt();
      return speedometer(currentSpeed);
    }
  }

}
