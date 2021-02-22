import java.util.Scanner;//importing scanner

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome! What is your current speed?");// printing first question
    int speed = scan.nextInt();// setting answer to the speed variable
    speedometer(speed);// calling method

  }

  public static boolean speedometer(int speed) {// spedometer method
    if (speed < 50) {// if statement
      System.out.println("Keep up your going too slow!");
      return false;
    } else { // else statement

      Scanner scan = new Scanner(System.in);// need user input

      System.out.println("Keep up the pace you are doing great! What is your current speed?");
      int currentSpeed = scan.nextInt();
      return speedometer(currentSpeed);
    }
  }

}
